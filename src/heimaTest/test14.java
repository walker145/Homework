package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test14 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入数组的长度");
//        int a = scanner.nextInt();
        int[] arr = {45,50,85,46,46};
        int max = arr[0];
        int min = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("请输入" + (i+1) + "元素");
//            arr[i] = scanner.nextInt();
//        }
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min=arr[i];
            }
            if (arr[i] > max){
                max=arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nmax=" + max + "min=" + min);
    }
}
