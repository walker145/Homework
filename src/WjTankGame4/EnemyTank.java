package WjTankGame4;

import java.util.Vector;

/**
 * @version 1.0
 * //敌方坦克
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class EnemyTank extends Tank implements Runnable{

    boolean isLive = true;
    //在敌人坦克类，使用Vector 保存多个对象
    Vector<Shot> shots = new Vector<>();

    public EnemyTank(int x, int y) {
        super(x, y);
    }

    @Override
    public void run() {
        while (true) {
            //判断如果shouts size()
            if (shots.size() < 10){
                Shot s = null;
                //判断坦克方向，创建对应的子弹
                switch (getDirction()){
                    case 0:
                        s = new Shot(getX() + 25,getY()-10,0);
                        break;
                    case 1:
                        s = new Shot(getX() + 70,getY() + 25,1);
                        break;
                    case 2:
                        s = new Shot(getX() + 25,getY() + 70,2);
                        break;
                    case 3:
                        s = new Shot(getX() + 10,getY() +25,3);
                        break;
                }
                shots.add(s);
                //启动
                new Thread(s).start();
            }
            //根据坦克的方向来继续移动
            switch (getDirction()){
                case 0://向上
                    //让坦克保持一个方向走30下
                    for (int i = 0; i < 30; i++) {
                        if (getY() > 0) {
                            moveUP();
                        }
                        //休眠100毫秒
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 1://向右
                    //让坦克保持一个方向走30下
                    for (int i = 0; i < 30; i++) {
                        if (getX() + 60 < 1000) {
                            moveRight();
                        }
                        //休眠100毫秒
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 2://向下
                    //让坦克保持一个方向走30下
                    for (int i = 0; i < 30; i++) {
                        if (getY() + 60 < 750) {
                            moveDown();
                        }
                        //休眠100毫秒
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3://向左
                    //让坦克保持一个方向走30下
                    for (int i = 0; i < 30; i++) {
                        if (getX() > 0) {
                            moveLeft();
                        }
                        //休眠100毫秒
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

            }

            //休眠100毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //然后随机改变坦克方向 0-3
            setDirction((int)(Math.random() * 4));

            //写多线程和并发程序要考虑什么时候退出
            if (!isLive){
                break;
            }
        }
    }
}
