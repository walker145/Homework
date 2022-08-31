package Aggregate;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @Authoy 王军
 */

public class ListExercise02 {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List arrayList = new ArrayList();
        arrayList.add(new Book1("on java", 118.6, "buch"));
        arrayList.add(new Book1("明朝那些事", 190.3, "当年明月"));
        arrayList.add(new Book1("高      数", 65.4, "jack"));

        //遍历输出
        for (Object o : arrayList) {
            System.out.println(o);
        }
        //冒泡排序
        sort(arrayList);
        System.out.println("排序后");
        for (Object o : arrayList) {
            System.out.println(o);
        }
    }
    //静态方法
    public static void sort(List list) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = 0; j < list.size() - 1 - i; j++) {
                //取出对象
                Book1 book1 = (Book1) list.get(j);
                Book1 book2 = (Book1) list.get(j + 1);
                if (book1.getPric() < book2.getPric()) {
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
        }
    }
}

class Book1 {
    private String name;
    private double pric;
    private String auther;

    public Book1(String name, double pric, String auther) {
        this.name = name;
        this.pric = pric;
        this.auther = auther;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPric() {
        return pric;
    }

    public void setPric(double pric) {
        this.pric = pric;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    @Override
    public String toString() {
        return "\n名称：" + name + "\t\t价格：" + pric + "\t\t作者：" + auther;
    }
}
