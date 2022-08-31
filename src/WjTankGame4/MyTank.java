package WjTankGame4;

import java.util.Vector;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class MyTank extends Tank {
    //定义一个shout对象，表示一个设计行为
    Shot shot = null;

    //可以发射多颗子弹
    Vector<Shot> shots = new Vector<>();
    public MyTank(int x, int y) {
        super(x, y);
    }

    //射击方法
    public void shoutEnemyTank() {

        //判断最多只能法射五颗子弹
        if (shots.size() == 5){
            return;
        }
        //创建Shout对象
        switch (getDirction()) {//
            case 0://向上
                shot = new Shot(getX() + 25, getY() - 10, 0);
                break;
            case 1://向右
                shot = new Shot(getX() + 65, getY() + 25, 1);
                break;
            case 2://向下
                shot = new Shot(getX() + 25, getY() + 65, 2);
                break;
            case 3://向左
                shot = new Shot(getX() - 10, getY() + 25, 3);
                break;
        }
        //把新创建的shot 放到shouts 集合中
        shots.add(shot);
        //启动Shout线程
        new Thread(shot).start();
    }
}
