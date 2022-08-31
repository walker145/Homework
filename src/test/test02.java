package test;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的成绩：");
        int a = scanner.nextInt();
        if (a >= 0 && a <= 100 ) {
            String b = a > 60 ? "及格" : "不及格";
            System.out.println(b);
        }else{
            System.out.println("你输入的成绩有误，成绩须在 0 到 100");
        }
    }
}
