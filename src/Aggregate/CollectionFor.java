package Aggregate;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class CollectionFor {
    public static void main(String[] args) {
        Collection col = new ArrayList();
        col.add(new Book("123", 10.1, "jc"));
        col.add(new Book("1235", 100.1, "nv"));
        col.add(new Book("1234", 101.0, "sd"));

        //使用增强for循环遍历，在Collection
        //增强for的底层还是迭代器
        //增强for可以理解成简化版的迭代器遍历
        //快捷键方式 I
        for (Object book : col) {
            System.out.println("book=" + book);
        }
        //增强for也可以在数组使用
        int[] num = {1, 2, 3, 4};
        for (int s : num) {
            System.out.println(s);
        }
        for (Object o : col) {
            System.out.println("o=" + o);
        }

    }
}
