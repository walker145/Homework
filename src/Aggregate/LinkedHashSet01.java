package Aggregate;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class LinkedHashSet01 {
    public static void main(String[] args) {
        //LinkedHashSet是 HashSet的子类
        //LinkedHashSet 添加和取出的顺序是一致的
        Set linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(456);
        linkedHashSet.add(456);
        linkedHashSet.add(new Customer("jack",100));
        linkedHashSet.add(123);
        linkedHashSet.add("wj");
        System.out.println(linkedHashSet);
    }
}
class Customer{
    private String name;
    private int n;

    public Customer(String name, int n) {
        this.name = name;
        this.n = n;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", n=" + n +
                '}';
    }
}
