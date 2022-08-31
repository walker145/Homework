package test;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test05 {
    public static void main(String[] args) {
        //有一个数组int[] arr = {9,1,3,4,54,56,23,22,20,43,45,78};,要求打印数组中能被6整除的元素
        int[] arr = {9, 1, 3, 4, 54, 56, 23, 22, 20, 43, 45, 78};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            //System.out.println(arr[i]);
            if (arr[i] % 6 == 0) {
                System.out.println(arr[i]);
                sum++;
            }
        }
        System.out.println("能被6整除的个数有" + sum);
    }
}
