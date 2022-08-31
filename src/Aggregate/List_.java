package Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class List_ {
    public static void main(String[] args) {
        //List集合类中元素有序（即添加顺序和取出顺序一致，）且可以重复
        List arrayList = new ArrayList();
        arrayList.add("1");
        arrayList.add("6");
        arrayList.add("5");
        arrayList.add("4");
        arrayList.add("3");
        arrayList.add("2");
        arrayList.add("2");
        System.out.println("arraylist=" + arrayList);
        //List集合中的每个元素都有其对象的索引（下标），即支持索引
        System.out.println(arrayList.get(2));
        //
    }
}
