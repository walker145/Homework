package WjTankGame1;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class MyPanel extends JPanel {
    //定义我的坦克
    MyTank myTank = null;

    public MyPanel() {
        myTank = new MyTank(100, 100);//初始化坦克
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0, 0, 1000, 750);
//        g.setColor(Color.CYAN);
//        g.fillRect(100,100,10,50);//第一个矩形的位置
//        g.setColor(Color.CYAN);
//        g.fillRect(110,110,30,30);//第二个矩形的位置
//        g.setColor(Color.CYAN);
//        g.fillRect(140,100,10,50);//第三个矩形的位置
//        g.setColor(Color.BLUE);
//        g.fillOval(110,110,30,30);//第一个圆的位置
//        g.setColor(Color.CYAN);
//        g.drawLine(125,135,125,90);//炮筒的位置
        //写出坦克封装方法
        drawTank(myTank.getX(), myTank.getY(), g, 0, 1);
    }

    //编写方法画坦克
    public void drawTank(int x, int y, Graphics g, int direction, int type) {
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
        switch (direction) {
            case 0:
                g.fill3DRect(x, y, 10, 60, false);//画出坦克左边轮子
                g.fill3DRect(x + 40, y, 10, 60, false);//画出右边的轮子
                g.fill3DRect(x + 10, y + 15, 30, 30, false);//画出中间的矩形
                g.fillOval(x + 10, x + 15, 30, 30);//画出圆盖
                g.drawLine(x + 25, y + 30, x + 25, y - 10);//画出炮筒
                break;
            default:
        }
    }
}
