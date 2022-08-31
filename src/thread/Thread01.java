package thread;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Thread01 {
    public static void main(String[] args) {
        //演示写程序查看CPU核数
        Runtime runtime = Runtime.getRuntime();
        //available 可获得的 Processors 处理器
        //获取当前电脑的 CPU数量
        int cpuNum = runtime.availableProcessors();
        System.out.println("CPU的数量是：" + cpuNum);
    }
}
