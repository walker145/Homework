package javaMapping;

import javax.swing.*;
import java.awt.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Mypanel extends JPanel {

    @Override
    public void paint(Graphics g) {//绘图方法
        super.paint(g);//调用父类的方法完成初始化
        System.out.println("paint方法被调用");
        //画一个圆
        g.drawOval(0, 0, 100, 100);
        //绘制不同的图形
        //画直线
        g.drawLine(10, 10, 100, 100);
        //画矩形边框
        g.drawRect(10, 10, 100, 100);
        //画椭圆边框
        g.drawOval(10, 10, 90, 70);
        //填充矩形
        //设置画笔颜色
        g.setColor(Color.BLUE);
        g.fillRect(50, 50, 100, 100);
        //填充椭圆
        g.setColor(Color.RED);
        g.fillOval(50, 50, 50, 50);
        //画图片
        //1.获取图片资源
//        Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/26a2-khmyntz5693979.jpg"));
//        g.drawImage(image,10,10,888,1488,this);
        //画字符串
        //绘画笔设置颜色和字体
        g.setColor(Color.BLACK);
        g.setFont(new Font("行楷", Font.BOLD, 50));
        g.drawString("苏州你好", 500, 500);
        //画坦克
        g.drawRect(200,200,10,100);
        g.setColor(Color.CYAN);
        g.fillRect(200,200,10,100);

        g.drawRect(260,200,10,100);
        g.setColor(Color.CYAN);
        g.fillRect(260,200,10,100);
        g.drawOval(210,225,50,50);
        g.setColor(Color.CYAN);
        g.fillOval(210,225,50,50);
    }
}
