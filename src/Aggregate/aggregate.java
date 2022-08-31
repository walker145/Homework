package Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Authoy 王军
 * 集合
 * 1.可以动态保存任意多个对象
 * 2.提供一系列方便的操作对象的方法：add,remove,set,get
 * 3.使用集合添加，删除新元素的示意代码简洁了
 *
 * 集合框架体系（背下来）
 */
public class aggregate {
    public static void main(String[] args) {
        //1.集合主要是两组(单列集合，双列集合)
        //2.Collection 接口有两个重要的子接口List set,他们的实现子类都是单列集合
        //3.Map 接口的实现子类是双列集合，存放 K - V；
        //4.Collection 和 Map 框架体系图背下来
        //Collection
        //Map
        ArrayList arrayList = new ArrayList();//单列集合
        arrayList.add("jack");//单列数据
        arrayList.add("tom");
        System.out.println(arrayList);

        HashMap hashMap = new HashMap();//双列集合
        hashMap.put("n1","suzhou");//双列数据
        hashMap.put("n2","beijing");
        System.out.println(hashMap);
    }
}
