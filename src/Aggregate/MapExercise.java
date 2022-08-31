package Aggregate;

import java.util.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class MapExercise {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put(0001, new person("jack1", 20000, "0001"));
        hashMap.put(0002, new person("jack2", 50000, "0002"));
        hashMap.put(0003, new person("jack3", 2000, "0003"));
        System.out.println(hashMap);

        Set set = hashMap.keySet();
        System.out.println("增强for");
        for (Object o : set) {
            //筛选工资>18000的
            person p = (person) hashMap.get(o);
            if (p.getSalary() > 18000) {
                System.out.println(o + "-" + hashMap.get(o));
            }
        }
        Iterator iterator = set.iterator();
        System.out.println("迭代器");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            //person q = (person)next;
            //if (q.getSalary() > 18000) {
                System.out.println(next + "-" + hashMap.get(next));
           // }
        }

        Collection values = hashMap.values();
        System.out.println("增强for");
        for (Object o : values) {
            if (((person) o).getSalary() > 18000) {
                System.out.println(o);
            }
        }
        Iterator iterator1 = values.iterator();
        System.out.println("迭代器");
        while (iterator1.hasNext()) {
            Object next = iterator1.next();
            if (((person) next).getSalary() > 18000) {
                System.out.println(next);
            }
        }

        Set set1 = hashMap.entrySet();
        System.out.println("增强for");
        for (Object o : set1) {
            Map.Entry a = (Map.Entry) o;
            if (((person) ((Map.Entry<?, ?>) o).getValue()).getSalary() > 18000) {
                System.out.println(a.getKey() + "-" + a.getValue());
            }
        }
        Iterator iterator2 = set1.iterator();
        System.out.println("迭代器");
        while (iterator2.hasNext()) {
            Object next = iterator2.next();
            Map.Entry d = (Map.Entry) next;
            // person g = (person) ((Map.Entry<?, ?>) next).getValue();
            if (((person) ((Map.Entry<?, ?>) next).getValue()).getSalary() > 18000) {
                System.out.println(d.getKey() + "-" + d.getValue());
            }
        }
    }
}
@SuppressWarnings({"all"})
class person {
    private String name;
    private double salary;
    private String Id;

    public person(String name, double salary, String id) {
        this.name = name;
        this.salary = salary;
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", Id='" + Id + '\'' +
                '}';
    }
}
