package javaEventhandingmechanism;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * @version 1.0
 * @Authoy 王军
 * 通过键盘控制小球上下移动  --> java事件的控制
 */
public class BallMove extends JFrame{
    //定义一个属性
    private Mypanel mp = null;
    public static void main(String[] args) {
        BallMove ballMove = new BallMove();
    }
    //构造器
    public BallMove(){
        mp = new Mypanel();//面板
        this.add(mp);
        this.setSize(400,300);
        //窗口JFrame 对象可以监听键盘事件，即可以监听到面板上发生的键盘事件
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//面板可以画出小球
//KeyListener 是一个监听器，可以监听键盘事件
class Mypanel extends JPanel implements KeyListener {//实现接口KeyListener
    //为了让小球可移动，把它的左上角坐标设置为变量
    int x = 10;
    int y = 10;
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillOval(x,y,20,20);//默认黑色
    }

    @Override
    public void keyTyped(KeyEvent e) {//keyTyped 有字符输出时，该方法会触发

    }

    @Override
    public void keyPressed(KeyEvent e) {//keyPressed 当某个键按下，该方法会触发
        // System.out.println((char) e.getKeyCode() + "键被按下");
        //根据用户按下的不同键，来处理小球的移动（wasd）
        //在java中会给每一个键，分配一个int值
        if (e.getKeyCode() == KeyEvent.VK_DOWN){//KeyEvent.VK_DOWN就是向下的箭头对应的code
            y++;
        }else if (e.getKeyCode() == KeyEvent.VK_UP){
            y--;
        }else if (e.getKeyCode() == KeyEvent.VK_LEFT){
            x--;
        }else if (e.getKeyCode() == KeyEvent.VK_RIGHT){
            x++;
        }
        //让面板重绘
        this.repaint();
    }

    @Override
    public void keyReleased(KeyEvent e) {//keyReleased 当某个键释放时，改方法会触发

    }
}