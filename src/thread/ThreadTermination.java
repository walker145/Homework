package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class ThreadTermination {
    public static void main(String[] args) throws InterruptedException {
        T t = new T();
        t.start();

        //如果希望main线程去控制t线程终止，必须修改loop
        //让t 退出run方法，从而终止t线程
        //让主线程休眠10秒 ，再通知t线程终止
        Thread.sleep(1000);
        t.setLoop(false);
    }
}

//线程退出
class T extends Thread {
    private int count = 0;
    //设置一个变量
    private boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("你好" + (count++));
        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}
