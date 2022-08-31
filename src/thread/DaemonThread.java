package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class DaemonThread {
    public static void main(String[] args) throws InterruptedException {
        T4 t4 = new T4();
        //如果希望主线程结束，子线程也可以自动结束
        //只需将子线程设置成守护线程即可
        t4.setDaemon(true);
        t4.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("hello" + i);
            Thread.sleep(1000);
        }
    }
}
class T4 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1000);//休眠1秒
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(123);
        }
    }
}
