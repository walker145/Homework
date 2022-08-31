package WjTankGame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

/**
 * @version 1.0
 * @Authoy 王军
 */

//为了监听键盘事件，需要实现接口 KeyListener
//为了让Panel不停的绘制子弹
@SuppressWarnings({"all"})
public class MyPanel extends JPanel implements KeyListener, Runnable {
    //定义我的坦克
    MyTank myTank = null;

    //定义敌方坦克，放入到 Vector集合
    Vector<EnemyTank> enemyTanks = new Vector<>();
    //定义一个Vector集合，用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //定义三张图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;

    public MyPanel() {
        myTank = new MyTank(100, 100);//初始化坦克
        myTank.setSupe(5);
        //初始化敌方坦克
        for (int i = 0; i < enemyTankSize; i++) {
            EnemyTank enemyTank = new EnemyTank((100 * (i + 1)), 0);
            //给敌方坦克设置方向
            enemyTank.setDirction(2);
            //启动敌人坦克线程
            new Thread(enemyTank).start();
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 25, enemyTank.getY() + 70, enemyTank.getDirction());
            //启动shout对象
            enemyTank.shots.add(shot);
            //启动shout对象
            new Thread(shot).start();
            //加入集合Vector
            enemyTanks.add(enemyTank);
        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.gif"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.gif"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.gif"));
    }

    @Override
    public void paint(Graphics g) {//游戏绘图区域
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);

        //画出我方坦克 封装方法
        drawTank(myTank.getX(), myTank.getY(), g, myTank.getDirction(), 0);

        //画出myTank射击的子弹
//        if (myTank.shot != null && myTank.shot.islive == true) {
//            //g.fill3DRect(myTank.shot.getX(),myTank.shot.getY(),1,1,false);
//            g.draw3DRect(myTank.shot.getX(), myTank.shot.getY(), 2, 2, false);
//        }
        //将Mytank 的子弹集合 shouts,遍历绘制子弹
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);//取出子弹
            if (shot != null && shot.islive) {
                //g.fill3DRect(myTank.shot.getX(),myTank.shot.getY(),1,1,false);
                g.draw3DRect(shot.getX(), shot.getY(), 2, 2, false);
            } else {
                //如果该shout对象已经无效，就从shouts集合中删除
                myTank.shots.remove(shot);
            }
        }

        //如果bombs集合中有对象就画出炸弹
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值画出。对应的图片
            if (bomb.getLife() > 6) {
                g.drawImage(image1, bomb.getX(), bomb.getY(), 60, 60, this);
            } else if (bomb.getLife() > 3) {
                g.drawImage(image2, bomb.getX(), bomb.getY(), 60, 60, this);
            } else {
                g.drawImage(image3, bomb.getX(), bomb.getY(), 60, 60, this);
            }
            //让炸弹生命值减少
            bomb.survival();
            //如果bomb life 为0 ，就从bombs集合中删除
            if (bomb.getLife() == 0) {
                bombs.remove(bomb);
            }
        }
        //画出敌方坦克， 遍历Vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从集合Vector中取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断敌人坦克是否存活
            if (enemyTank.isLive) {//当敌人坦克是存活的才画出该坦克
                //绘制坦克
                drawTank(enemyTank.getX(), enemyTank.getY(), g, enemyTank.getDirction(), 1);
                //画出敌方坦克子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹准备绘制
                    Shot shot = enemyTank.shots.get(j);
                    //绘制时要有判断
                    if (shot.islive) {
                        g.draw3DRect(shot.getX(), shot.getY(), 2, 2, false);
                    } else {
                        //从集合Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }
            }
        }
    }

    //编写方法画坦克
    public static void drawTank(int x, int y, Graphics g, int diction, int type) {
        //根据坦克不同类型设置不同颜色
        switch (type) {
            case 0://我方坦克
                g.setColor(Color.GREEN);
                break;
            case 1://敌方坦克
                g.setColor(Color.RED);
                break;
        }

        //根据坦克方向绘制坦克
        switch (diction) {
            case 0://坦克向上
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 40, y, 10, 60, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 10, 30, 40, false);//画出中间的矩形
                g.fillOval(x + 10, y + 15, 30, 30);//画出圆盖
                g.drawLine(x + 25, y + 30, x + 25, y - 10);//画出炮筒
                break;
            case 1://坦克向右
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边边轮子
                g.fill3DRect(x, y + 40, 60, 10, false);//画出下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 30, false);//画出中间的矩形
                g.fillOval(x + 15, y + 10, 30, 30);//画出圆盖
                g.drawLine(x + 20, y + 25, x + 65, y + 25);//画出炮筒
                break;
            case 2://坦克向下
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 40, y, 10, 60, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 10, 30, 40, false);//画出中间的矩形
                g.fillOval(x + 10, y + 15, 30, 30);//画出圆盖
                g.drawLine(x + 25, y + 30, x + 25, y + 65);//画出炮筒
                break;
            case 3://坦克向左
                g.fill3DRect(x, y, 60, 10, false);//画出坦克上边轮子
                g.fill3DRect(x, y + 40, 60, 10, false);//画出下边的轮子
                g.fill3DRect(x + 10, y + 10, 40, 30, false);//画出中间的矩形
                g.fillOval(x + 15, y + 10, 30, 30);//画出圆盖
                g.drawLine(x + 20, y + 25, x - 10, y + 25);//画出炮筒
                break;
            default:
        }
    }

    //如果我们坦克可以发射多个子弹
    //在判断我方子弹是否击中敌人坦克时，就需要把我们的子弹集合中
    //所有子弹都去取出和敌人坦克判断
    public void hitEnemTank() {

        //遍历我们的子弹集合
        for (int i = 0; i < myTank.shots.size(); i++) {
            Shot shot = myTank.shots.get(i);
            //在run方法中判断子弹是否击中敌方坦克
            if (shot != null && shot.islive) {//当前我方坦克子弹还存在
                //遍历敌方所有坦克
                for (int j = 0; j < enemyTanks.size(); j++) {
                    //取出坦克
                    EnemyTank enemyTank = enemyTanks.get(j);
                    hitTank(myTank.shot, enemyTank);
                }
            }
        }
    }

    //编写方法，判断我方的子弹是否击中敌人坦克
    //什么时候判断我方子弹击中敌人
    public void hitTank(Shot s, EnemyTank enemyTank) {
        switch (enemyTank.getDirction()) {
            case 0://向上
            case 2://向下
                if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() + 50 &&
                        s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY() + 70) {
                    s.islive = false;
                    enemyTank.isLive = false;
                    //当我防坦克击中敌方坦克后，将enemyTank 从Vector集合中删除
                    enemyTanks.remove(enemyTank);
                    //创建一个Bomb对象，加入到bombs集合中
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://向左
            case 3://向右
                if (s.getX() > enemyTank.getX() && s.getX() < enemyTank.getX() + 70 &&
                        s.getY() > enemyTank.getY() && s.getY() < enemyTank.getY() + 50) {
                    s.islive = false;
                    enemyTank.isLive = false;
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        //处理WDSA 键按下的情况
        if (e.getKeyCode() == KeyEvent.VK_W) {//按下w键
            //按下W键，可以改变方向
            myTank.setDirction(0);
            //修改坦克的坐标
            if (myTank.getY() > 0) {
                myTank.moveUP();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//D键
            myTank.setDirction(1);
            if (myTank.getX() + 70 < 1000) {
                myTank.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//S键
            myTank.setDirction(2);
            if (myTank.getY() + 100 < 750) {
                myTank.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//A键
            myTank.setDirction(3);
            if (myTank.getX() > 0) {
                myTank.moveLeft();
            }
        }
        //如果用户按下的是j就发射子弹
        if (e.getKeyCode() == KeyEvent.VK_J) {
            //发射一颗子弹的效果
            //判断Mytank的子弹是否销毁
//            if (myTank.shot == null || !myTank.shot.islive) {
//                myTank.shoutEnemyTank();
//            }
            //发射多颗子弹
            myTank.shoutEnemyTank();
        }
        //面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {//每隔150；毫秒重绘子弹,刷新绘图区域，子弹就移动
        while (true) {
            try {
                Thread.sleep(150);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.hitEnemTank();
            this.repaint();
        }
    }
}
