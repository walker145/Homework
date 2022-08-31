package AggregateHomework;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Homework02 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Car("BMW",2000000));
        arrayList.add(new Car("奥迪",1000000));
        System.out.println(arrayList);

        arrayList.remove(0);
        System.out.println(arrayList);

        System.out.println(arrayList.contains("BMW"));

        System.out.println(arrayList.size());

        System.out.println(arrayList.isEmpty());

        System.out.println(arrayList);
        arrayList.addAll(arrayList);
        System.out.println(arrayList);

        System.out.println(arrayList.containsAll(arrayList));
    }
}
