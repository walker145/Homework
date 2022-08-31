package AggregateHomework;

import java.util.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class Homework03 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("jack", 650);
        hashMap.put("tom", 1200);
        hashMap.put("smith", 2900);
        System.out.println(hashMap);
        hashMap.put("jack", 2600);
        System.out.println(hashMap);

        for (Object o : hashMap.keySet()) {
            hashMap.put(o, (Integer) hashMap.get(o) + 100);
        }
        System.out.println(hashMap);
        Set set = hashMap.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry next =  (Map.Entry)iterator.next();
            System.out.println(next.getKey() + "-" + next.getValue());
        }

        Collection values = hashMap.values();
        for (Object o : values) {
            System.out.println(o);
        }

    }
}
