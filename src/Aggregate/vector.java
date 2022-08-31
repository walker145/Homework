package Aggregate;

import java.util.Vector;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class vector {
    public static void main(String[] args) {
        //vector 底层也是对象数组
        //线程安全 效率低 扩容是两倍
        Vector vector = new Vector();
        for (int i = 0; i < 10; i++) {
            vector.add(i);
        }
        for (int i = 11; i < 12; i++) {
            vector.add(i);
        }
        vector.add(100);
        vector.add(200);
        System.out.println(vector);
    }
    /**
     * 1.new Vector() 底层
     *  public Vector() {
     *         this(10);
     *     }
     *2.
     * */
}
