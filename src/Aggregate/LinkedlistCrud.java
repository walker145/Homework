package Aggregate;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @version 1.0
 * @Authoy 王军
 * 追源码           底层结构         增删效率                改查效率
 * ArrayList      可变数组          较低，数组扩容            较高
 * LinkedList     双向链表          较高，通过链表追加         较低
 */
public class LinkedlistCrud {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(10);
        linkedList.add(40);
        linkedList.add(30);
        linkedList.add(20);
        linkedList.add(80);
        linkedList.add(70);
        linkedList.add(60);
        linkedList.add(50);
        System.out.println(linkedList);

        //删除第一个结点
        linkedList.remove();
        System.out.println(linkedList);

        //删除最后一个结点
        linkedList.removeLast();
        System.out.println(linkedList);

        //修改
        linkedList.set(0,99);
        System.out.println(linkedList);

        //获取
        Object s = linkedList.get(1);
        System.out.println(s);

        //删除
        linkedList.remove(1);
        System.out.println(linkedList);

        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        System.out.println("========");
        for (Object o : linkedList) {
            System.out.println(o);
        }

        System.out.println("========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }
    }
}
