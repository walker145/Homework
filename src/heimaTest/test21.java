package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test21 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || i == 1) {
                arr[i] = 1;
            } else {
                arr[i] = arr[i - 1] + arr[i - 2];
            }
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
        long end = System.currentTimeMillis();
        long time = end - start;
        System.out.println(time);
        A a = new A();
        a.F();
    }
}

class A {
    int f = 1;

    public void F() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数");
        int i1 = scanner.nextInt();
        for (int i = 0; i <= i1; i++) {
            if (i == 0) {
                f = 1;
            } else {
                f *= i;
            }
        }
        System.out.println(i1 + "! = " + f);
    }
}