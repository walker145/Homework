package Aggregate;



import java.util.HashMap;
import java.util.Map;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HashMap01 {
    public static void main(String[] args) {
        Map hashMap = new HashMap();
        hashMap.put("n1",200);
        hashMap.put("n1",200);
        hashMap.put(1,200);
        hashMap.put("n3",200);
        hashMap.put("n4",200);
        hashMap.put("n5",200);
        hashMap.put("n6",200);
        hashMap.put("n1",200);
        hashMap.put(new Object(),10);
        System.out.println(hashMap.get("n1"));
        System.out.println(hashMap);
    }
}
