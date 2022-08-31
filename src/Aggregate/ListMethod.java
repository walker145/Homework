package Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class ListMethod {
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add("45");
        arrayList.add("30");
        arrayList.add("40");
        arrayList.add("20");
        //在index = 1的位置插入一个对象
        arrayList.add(1, "80");
        System.out.println("array=" + arrayList);

        List arrayList1 = new ArrayList();
        arrayList1.add("55");
        arrayList1.add("59");
        arrayList.addAll(3, arrayList1);
        System.out.println("array=" + arrayList);
        //arrayList.indexOf("20") 是查找20在集合中首次出现的位置
        System.out.println(arrayList.indexOf("20"));
        //arrayList.lastIndexOf("45") 是查找45在集合中最后一次出现的位置
        arrayList.add("45");
        System.out.println("array" + arrayList);
        System.out.println(arrayList.lastIndexOf("45"));
        //arrayList.remove(7) 是删除集合中下标为7的元素
        System.out.println(arrayList.remove(7));
        System.out.println("array=" + arrayList);
        //arrayList.set(1, "60") 是替换集合中下标为1的元素
        System.out.println(arrayList.set(1, "60"));
        System.out.println("arry=" + arrayList);
        //arrayList.subList(0,2) 是返回集合中下标为0,2的元素，是前闭后开的结构即  0<= index < 2
        System.out.println("array=" + arrayList);
        System.out.println(arrayList.subList(0,2));
    }
}
