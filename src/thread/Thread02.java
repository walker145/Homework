package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Thread02 {
    public static void main(String[] args) throws InterruptedException {
        //创建线程的两种方式
        //1.继承Thread类，重写Run方法
        //2.实现Runnable接口，重写run方法
        Cat cat = new Cat();
        cat.start();//
        //当main线程启动了一个子线程时，主线程不会阻塞，会交替执行
        for (int i = 0; i < 100; i++) {
            System.out.println("main线程" + i + "线程名" + Thread.currentThread().getName());
                Thread.sleep(1000);
        }
    }
}

//通过继承Thread 创建线程
//1.当一个类继承了Thread 类该类可以当做线程使用
//2.重写Thread 方法，
//3.run方法 Thread类实现了 Runnable 接口
class Cat extends Thread {
    int times = 0;
    @Override
    public void run() {//重写run方法，写上自己的业务逻辑
        while (true) {
            System.out.println("喵喵，我是小猫咪" + (++times) + "线程名称" + Thread.currentThread().getName());
            //让线程休眠一秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 150){
                break;
            }
        }
    }
}
