package Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class CollectionIterator {
    public static void main(String[] args) {
        //Collection 接口遍历元素方式1 使用Iterator(迭代器)
        //1.Iterator对象称为迭代器，主要用于遍历 Collection集合中的元素
        //2.所有实现了collection接口的集合类都有一个iterator()方法，用以返回一个实现了Iterator接口的对象，即可以返回一个迭代器
        //3.Iterator的结构
        //4.Iterator仅用于遍历集合，Iterator本身并不存放对象
        Collection col = new ArrayList();
        col.add(new Book("123", 10.1, "jc"));
        col.add(new Book("1235", 100.1, "nv"));
        col.add(new Book("1234", 101.0, "sd"));
        System.out.println(col);
        //遍历集合 迭代器遍历输出集合元素
        //先得到 array 对应的迭代器
        Iterator iterator = col.iterator();
        System.out.println("第一次遍历");
        //使用while循环遍历
        while (iterator.hasNext()) {//判断是否有数据
            //返回下一个元素，类型是Objict
            Object next = iterator.next();
            System.out.println("next=" + next);
        }
        //使用快捷键，快速生成while => itit
        //如果希望重新遍历，需要重置迭代器
        iterator = col.iterator();
        System.out.println("第二次遍历");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next=" + next);
        }

        for (Object o : col) {
            System.out.println(o);
        }
    }
}

class Book {
    private String name;
    private double price;
    private String authore;

    public Book(String name, double price, String authore) {
        this.name = name;
        this.price = price;
        this.authore = authore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthore() {
        return authore;
    }

    public void setAuthore(String authore) {
        this.authore = authore;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", authore='" + authore + '\'' +
                '}';
    }
}
