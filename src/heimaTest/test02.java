package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test02 {
    public static void main(String[] args) {
        int[] arr = new int[6];
        int sum = 0;
        for (int i = 0; i < args.length; i++) {
            arr[i] = (int)(0+(Math.random()*100 - 1 + 1));
            sum += arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("sum=" + sum);
    }
}
