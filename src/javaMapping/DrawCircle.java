package javaMapping;

import javax.swing.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class DrawCircle extends JFrame {
    //定义一个面板
    private Mypanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        //初始化面板
        mp = new Mypanel();
        //把画框放入到窗口（画框)
        this.add(mp);
        //设置窗口大小
        this.setSize(1080,1920);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
//先定义一个面板 MyPanel继承Jpanel,换图形就在面板上画

