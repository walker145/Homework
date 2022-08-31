package Aggregate;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class setinterfaceMethod {
    public static void main(String[] args) {
        //set 接口是无序的(添加和取出顺序不一致)，没有索引
        //不允许重复元素，所以最多包含一个null
        //jdk API 实现子类 常用 的有 hashset treeset
        //常用方法 set也是 collection 的子接口，因此常用方法和Collection接口一样
        //1.可以使用迭代器
        //2.增强for
        //3.不能使用索引
        //set 接口的实现类的对象
        //set 接口对象是无序的
        //取出的顺序是固定的虽然不是添加的顺序  不会随着重新运行而改变顺序
        Set hashSet = new HashSet();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        hashSet.add(40);
        hashSet.add(50);
        hashSet.add(60);
        System.out.println(hashSet);

        hashSet.remove(50);
        System.out.println(hashSet);
        //迭代遍历
        System.out.println("=====================");
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

        //增强for循环遍历
        System.out.println("增强for遍历");
        for (Object o : hashSet) {
            System.out.println(o);
        }

    }
}
