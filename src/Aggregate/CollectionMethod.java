package Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class CollectionMethod {
    public static void main(String[] args) {
        //Cllection接口常用方法，以实现子类ArrayList
        //1.add 添加元素
        List arrayList = new ArrayList();
        arrayList.add("jack");
        arrayList.add(10);
        arrayList.add(true);
        arrayList.add(20);
        arrayList.add("tom");
        System.out.println(arrayList);
        //2.remove 删除指定元素
        arrayList.remove(0);//删除下标为零的元素
        arrayList.remove(true);//指定删除某个元素
        System.out.println(arrayList);
        //3.contains 查找元素是否存在
        System.out.println(arrayList.contains(500));
        //4.size 获取元素个数
        System.out.println(arrayList.size());
        //5.isEmpty 判断是否为空
        System.out.println(arrayList.isEmpty());
        //6.clear 清空
        arrayList.clear();
        System.out.println(arrayList);
        //7.addAll 添加多个元素
        List arrayList1 = new ArrayList();
        arrayList1.add("jav");
        arrayList1.add("cvdf");
        arrayList1.add("asd");
        arrayList.addAll(arrayList1);
        System.out.println(arrayList);
        //8.containsAll 查找多个元素是否存在
        System.out.println(arrayList.containsAll(arrayList1));
        //9.removeAll 删除多个元素
        arrayList.add("das");
        arrayList.removeAll(arrayList1);
        System.out.println(arrayList);
        //10.

    }
}
