package test;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = scanner.nextInt();
        String b = a % 2 ==0 ? "这个数是偶数": "这个数是奇数";
        System.out.println(b);
    }
}
