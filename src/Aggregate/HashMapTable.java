package Aggregate;

import java.util.HashMap;
import java.util.Objects;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HashMapTable {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 0; i < 20; i++) {
            hashMap.put(new A(i),10);
        }
        System.out.println(hashMap);
    }
}
class A{
    private int n;

    public A(int n) {
        this.n = n;
    }



    @Override
    public int hashCode() {
        return 100;
    }
}