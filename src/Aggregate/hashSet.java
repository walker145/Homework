package Aggregate;

import java.util.HashSet;
import java.util.Set;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class hashSet {
    public static void main(String[] args) {
        //底层是hashMap
        Set hashSet = new HashSet();
        for (int i = 0; i < 100; i++) {
            hashSet.add(i);
        }
        System.out.println(hashSet);
    }
}
