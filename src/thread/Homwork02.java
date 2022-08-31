package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Homwork02 {
    public static void main(String[] args) {
        C c = new C();
        new Thread(c).start();
        new Thread(c).start();
    }
}
class C implements Runnable{
    private int money = 10000;

    @Override
    public /*synchronized*/ void run() {
        while (true){

            //这里使用了synchronized 实现了线程同步
            //当多个线程执行到这里时，就会去争夺this对象
            //那个线程争夺到this对象，就执行synchronized代码块，执行完后会释放this对象锁
            //争夺不到this对象锁，就blocked，准备继续争夺
            //this对象是非公平锁
            synchronized (this) {
                //先进行余额判断
                if (money <= 0) {
                    System.out.println("余额不足");
                    break;
                }
                System.out.println(Thread.currentThread().getName() + "每次取1000,余额：" + (money -= 1000));
            }
            try {//休眠一秒钟
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
