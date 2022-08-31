package WjTankGame4;

import javax.swing.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class TankGame extends JFrame {
    //定义一个Mypanel
    MyPanel mp = null;
    public static void main(String[] args) {
        TankGame tankGame = new TankGame();
    }
    public TankGame(){
        mp = new MyPanel();
        //将mp放入到Thread,并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp);//把面板
        this.setSize(1000,750);//面板的大小
        this.addKeyListener(mp);//增加一个监听事件，监听mp键盘事件
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
