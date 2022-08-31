package thread.SellTicket;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class sellTicket {
    public static void main(String[] args) {
//        sellticket01 sellticket01 = new sellticket01();
//        sellticket01 sellticket02 = new sellticket01();
//        sellticket01 sellticket03 = new sellticket01();
//        sellticket01.start();
//        sellticket02.start();
//        sellticket03.start();
        //线程同步
        //sellticket02 sellticket02 = new sellticket02();
        sellticket03 sell03 = new sellticket03();
        new Thread(sell03).start();
        new Thread(sell03).start();
        new Thread(sell03).start();
    }
}

//实现接口方式，使用syncharobized
class sellticket03 implements Runnable {
    private static int t = 100;//让多个线程共享t
    private boolean loop = true;//控制run方法变量
    Object object = new Object();//

    //同步方法（静态）的锁是当前类本身
    //
    public synchronized static void m1(){}
    public static void m2(){
        synchronized (sellticket03.class){
            System.out.println("m2");
        }

    }
    //也可以在代码块中加入syncharonized,同步代码块
    public /*synchronized*/ void sell() {//同步方法，在同一时刻，只能有一个线程来执行sell方法
        synchronized (/*this*/object) {
            if (t <= 0) {
                System.out.println("售票结束");
                loop = false;
                return;
            }
            //休眠
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口" + Thread.currentThread().getName() + "售出一张票" + "剩余票数" + (--t));
        }
    }

    @Override
    public void run() {//同步方法
        while (loop) {

            sell();//sell方法是一个同步方法
        }
    }

}
//使用Thread方式创建线程
//class sellticket01 extends Thread{
//    public static int t = 10;
//    @Override
//    public void run() {
//        while (true) {
//
//            if (t <= 0) {
//                System.out.println("售票结束");
//                break;
//            }
//            //休眠
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("窗口"  + Thread.currentThread().getName() + "售出一张票" + "剩余票数"  +(--t));
//        }
//    }
//}
//实现接口的方式
//class sellticket02 implements Runnable{
//    private int t = 100;
//    @Override
//    public void run() {
//        while (true) {
//
//            if (t <= 0) {
//                System.out.println("售票结束");
//                break;
//            }
//            //休眠
//            try {
//                Thread.sleep(50);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            System.out.println("窗口"  + Thread.currentThread().getName() + "售出一张票" + "剩余票数"  +(--t));
//        }
//    }
//}
