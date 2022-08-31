package test;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数");
        int a = scanner.nextInt();
        int b = a % 10;
        int c = a / 10 % 10;
        int d = a / 100 % 10;
        int f = a / 1000 % 10;
        int e = a / 10000;
        System.out.println("个位是" + b + "十位是" + c + "百位是" + d + "千位" + f + "万位" + e);
    }
}
