package WjTankGame4;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class Shot implements Runnable {

    private int x;//子弹x坐标
    private int y;//子弹y坐标
    private int diction = 0;//子弹方向
    private int speed = 2;//子弹速度
    boolean islive = true;//设计一个属性，子弹是否还存活

    public Shot(int x, int y, int diction) {
        this.x = x;
        this.y = y;
        this.diction = diction;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getDiction() {
        return diction;
    }

    public void setDiction(int diction) {
        this.diction = diction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void run() {//子弹射击
        while (true) {
            try {//子弹休眠一秒钟
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //根据方向改变x,y坐标
            switch (diction) {
                case 0://子弹向上
                    y -= speed;
                    break;
                case 1://子弹向右
                    x += speed;
                    break;
                case 2://子弹向下
                    y += speed;
                    break;
                case 3://子弹向左
                    x -= speed;
                    break;
            }
            //测试输出x,y坐标的
            System.out.println("x=" + x + "y=" + y);
            //当子弹移动到面板的边界时，就应该销毁(把启动子弹的线程销毁)
            //当子弹碰到敌人坦克时，也应该退出线程
            if (!(x >= 0 && x <= 1000 && y >= 0 && y <= 750 && islive)) {//取反超出面板子弹就会销毁
                System.out.println("子弹线程退出");
                islive = false;
                break;
            }
        }
    }
}
