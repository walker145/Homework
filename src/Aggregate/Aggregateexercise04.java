package Aggregate;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author 王军
 */
public class Aggregateexercise04 {
    public static void main(String[] args) {
        //4、定义“手机类”Phone包含空参构造、满参构造和以下成员变量：
        //名称name（String类型） 价格price（double类型） 类型type（String类型）
        //生成以上成员变量的set/get方法
        //定义测试类Test，完成以下要求：
        //①定义public static ArrayList filter(ArrayList list,double price) {...}方法: 要求：遍历list集合，将list中价格大于参
        //数price的元素存入到另一个ArrayList 中并返回
        //②在main方法内完成以下要求: a.根据以下内容创建并初始化3个Phone对象
        //{"小米MIX2",2999,"新机皇"}
        //{"Iphone8", 5888,"火爆新机"}
        //{"VIVO X9s",1998,"火爆新机"}
        //b.创建一个ArrayList list_phone，将上面的3个Phone对象添加到list_phone中，调用 filter方法传入list_phone和
        //2000，根据返回的list集合输出所有元素信息
        ArrayList list_phones = new ArrayList();
        Phone phone = new Phone("小米MIX2", 2999, "机皇");
        Phone phone1 = new Phone("iphon13", 5988, "火爆新机");
        Phone phone2 = new Phone("VIVO x9s", 1999, "火爆新机");
        list_phones.add(phone);
        list_phones.add(phone1);
        list_phones.add(phone2);
        Test.filter(list_phones, 2000);

    }
}

class Phone {
    private String name;
    private double price;
    private String type;

    public Phone(String name, double price, String type) {
        this.name = name;
        this.price = price;
        this.type = type;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", type='" + type + '\'' +
                '}';
    }
}

class Test {
    public static void filter(ArrayList list, double price) {
        for (int i = 0; i < list.size(); i++) {
            Phone test = (Phone) list.get(i);
            if (test.getPrice() > price) {
                list.set(i, test);
                System.out.println(test);
            }

        }
    }
}