package Aggregate;

import java.util.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HashFor {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(1, "jack2");
        hashMap.put(2, "jack3");
        hashMap.put(3, "jack4");
        hashMap.put(4, "jack5");
        hashMap.put(5, "jack6");
        hashMap.put(6, "jack7");
        hashMap.put(7, "jack8");

        //Map的六大遍历放式
        //第一组：先取出key,通过key 取出对应的value
        Set set = hashMap.keySet();
        //keySet()方法增强for循环遍历
        System.out.println("keySet方法增强for遍历");
        for (Object o : set) {
            System.out.println(o + "-" + hashMap.get(o));
        }

        //迭代器遍历
        Iterator iterator = set.iterator();
        System.out.println("keySet方法迭代器遍历");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next + "-" + hashMap.get(next));
        }

        //把所有value取出
        Collection values = hashMap.values();
        System.out.println("values()方法增强for遍历");
        for (Object o : values) {
            System.out.println(o);
        }
        //迭代器
        Iterator iterator1 = values.iterator();
        System.out.println("values()方法迭代器遍历");
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            System.out.println(next);
        }

        //通过EntrySet() 来取 K-V
        Set set1 = hashMap.entrySet();
        System.out.println("entrySet()方法增强for遍历");
        for (Object o : set1) {
            //o 转成 Map.Entry
            Map.Entry m = (Map.Entry) o;
            System.out.println(m.getKey() + "-" + m.getValue());
        }
        Iterator iterator2 = set1.iterator();
        System.out.println("values()方法迭代器遍历");
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry s = (Map.Entry) next;
            System.out.println(s.getKey() + "-" + s.getValue());
        }
    }
}
