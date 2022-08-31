package WjTankGame1;

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
        this.add(mp);
        this.setSize(1000,750);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
