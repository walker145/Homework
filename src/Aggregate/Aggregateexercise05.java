package Aggregate;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author 王军
 */
public class Aggregateexercise05 {
    public static void main(String[] args) {
        //5、定义ArrayList集合，存入多个字符串
        //1、 如:"ab1" "123ad" "bca" "dadfadf" "dddaaa" "你好啊" "我来啦" "别跑啊"
        //2.遍历集合,删除长度大于5的字符串,打印删除后的集合对象
        //3.基于上一步,删除集合中元素包含0-9数字的字符串(只要字符串中包含0-9中的任意一个数字就需要删除此整个字
        //符串)
        ArrayList arrayList = new ArrayList();
        arrayList.add("ab1");
        arrayList.add("123ad");
        arrayList.add("bca");
        arrayList.add("dadfadf");
        arrayList.add("dddaaa");
        arrayList.add("你好啊");
        arrayList.add("我来啦");
        arrayList.add("别跑啊");
        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            if (s.length() > 5) {
                arrayList.remove(i);
                i--;
            }
        }
        System.out.println(arrayList);

        for (int i = 0; i < arrayList.size(); i++) {
            String s = (String) arrayList.get(i);
            char[] b = s.toCharArray();
            for (int j = 0; j < b.length; j++) {
                if (b[j] >= '0' && b[j] <= '9') {
                    arrayList.remove(i);
                    i--;
                    break;
                }
            }

        }
        System.out.println(arrayList);
    }
}
