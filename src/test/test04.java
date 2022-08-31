package test;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a = scanner.nextInt();
        System.out.println("请输入第二个数");
        int b = scanner.nextInt();
        int c = a > b ? a + b : a * b;
        System.out.println(c);
    }
}
