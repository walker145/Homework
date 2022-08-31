package WjTankGame4;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class Bomb {
    private int x, y;//炸弹的坐标
    private int life = 9;//炸弹生命周期
    private boolean Survival= true;//炸弹是否存活

    public Bomb(int x, int y) {
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

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //减少生命值
    public void survival(){
        if (life > 0){
            life--;//配合图片的爆炸效果
        }else {
            Survival = false;
        }
    }
}
