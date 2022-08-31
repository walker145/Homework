package Aggregate;

import java.util.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class ListExercise {
    public static void main(String[] args) {
        //List arrayList = new ArrayList();
        //Vector arrayList = new Vector();
        LinkedList arrayList = new LinkedList();

        for (int i = 0; i < 12; i++) {
            arrayList.add("hello" + i);
        }

        arrayList.add(1, "wj");
        System.out.println("array=" + arrayList);

        System.out.println("第五个元素");
        System.out.println(arrayList.get(4));

        System.out.println("删除第六个元素");
        System.out.println(arrayList.remove(5));
        System.out.println("array=" + arrayList);

        System.out.println("修改第七个元素");
        System.out.println(arrayList);
        System.out.println(arrayList.set(6, "60"));
        System.out.println(arrayList);

        //使用迭代器遍历输出集合元素
        Iterator iterator = arrayList.iterator();
        System.out.println("使用迭代器遍历");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        //使用增强for遍历输出
        System.out.println("使用增强for遍历");
        for (Object o : arrayList) {
            System.out.println("array=" + o);
        }
        //使用普通for循环遍历
        System.out.println("使用普通for遍历");
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println("对象=" + arrayList.get(i));
        }
    }
}
