package WjTankGame4;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class Tank {
    private int x;//坦克横坐标
    private int y;//坦克纵坐标
    private int dirction = 0;//表示坦克方向
    private int supe = 1;

    //上右下左
    public void moveUP() {
        y -= supe;
    }

    public void moveRight() {
        x += supe;
    }

    public void moveDown() {
        y += supe;
    }

    public void moveLeft() {
        x -= supe;
    }

    public Tank(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int getDirction() {
        return dirction;
    }

    public void setDirction(int dirction) {
        this.dirction = dirction;
    }

    public int getSupe() {
        return supe;
    }

    public void setSupe(int supe) {
        this.supe = supe;
    }
}
