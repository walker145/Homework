package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        //线程常用方法
        Jion jion = new Jion();
        Thread thread = new Thread(jion);
        thread.start();
        for (int i = 0; i <= 20; i++) {
            System.out.println("hi" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5) {
                //线程插队
                System.out.println("子线程先运行");
                thread.join();//线程插队
               // Thread.yield();//礼让，不一定礼让成功

            }
        }
        System.out.println("主线程结束");
    }
}

//线程插队
class Jion implements Runnable {

    private int r = 0;

    @Override
    public void run() {
        while (true) {
            System.out.println("hello" + (r++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (r >= 20) {
                System.out.println("子线程结束");
                break;
            }
        }
    }
}
