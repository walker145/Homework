package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Thread03 {
    public static void main(String[] args) {
        tiger tiger = new tiger();
        Thread thread = new Thread(tiger);//这里使用了设计模式（代理模式）
        thread.start();

        Dog dog = new Dog();
        Proxy proxy = new Proxy(dog);
        proxy.start();
    }
}
class Aniaml{}
class Dog extends Aniaml implements Runnable{

    @Override
    public void run() {
        System.out.println("小狗汪汪叫");
    }
}
//代理模式的模拟代码
class Proxy implements Runnable{//proxy 代理

    private Runnable target = null;
    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }
    public  Proxy(Runnable target){
        this.target = target;
    }
    public void start(){
        start0();//这个方法是真正实现线程的方法
    }

    private void start0() {
        run();
    }
}
//通过实现Runnable 接口创建线程
class tiger implements Runnable{
    int count = 0;
    @Override
    public void run() {
        while (true){
            System.out.println("老虎嗷嗷叫" + (++count) + Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (count == 10){
                break;
            }
        }
    }
}
