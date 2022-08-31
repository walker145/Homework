package Aggregate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * @version 1.0
 * @Authoy 王军
 */
@SuppressWarnings({"all"})
public class CollectionExercise {
    public static void main(String[] args) {
        List collection = new ArrayList();
        collection.add(new Dog("jack",10));
        collection.add(new Dog("tom",20));
        collection.add(new Dog("smith",5));

        //用迭代器遍历输出
        Iterator iterator = collection.iterator();
        System.out.println("第一次遍历");
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);
        }

        //使用增强for遍历输出
        System.out.println("第二次遍历");
        for (Object o : collection) {
            System.out.println("o=" + o);
        }

    }
}
@SuppressWarnings({"all"})
class Dog {
    private String name;
    private int age;

    public Dog(String name,int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
