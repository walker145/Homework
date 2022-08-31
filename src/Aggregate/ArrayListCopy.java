package Aggregate;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class ArrayListCopy {
    public static void main(String[] args) {
        //ArrayList 扩容机制
        //线程不安全 效率高
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            arrayList.add(i);
        }
        for (int i = 11; i < 15 ; i++) {
            arrayList.add(i);
        }
        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(null);
        System.out.println(arrayList);
    }
}
