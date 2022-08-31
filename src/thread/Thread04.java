package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Thread04 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();
        Thread thread = new Thread(t1);
        Thread thread1 = new Thread(t2);
        thread.start();//启动第一个线程
        thread1.start();//启动第二个线程
    }
}
//子线程
class T1 implements Runnable{

    int coun = 0;
    @Override
    public void run() {
        //每隔一秒输出一个hello Word
        while (true){
            System.out.println("hello word" + (++coun) + Thread.currentThread().getName());
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (coun == 10){
                break;
            }
        }
    }
}
//子线程二
class T2 implements Runnable{

    int coun = 0;
    @Override
    public void run() {
        //每隔一秒输出一个hello Word
        while (true){
            System.out.println("hi" + (++coun) + Thread.currentThread().getName());
            //休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (coun == 5){
                break;
            }
        }
    }
}