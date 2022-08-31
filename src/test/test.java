package test;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输java的成绩：");
        int a = scanner.nextInt();
        System.out.println("请输入SQL的成绩：");
        int b = scanner.nextInt();
        System.out.println("请输入Web的成绩：");
        int c = scanner.nextInt();
        System.out.println("--------------------------------");
        System.out.println("\tjava\t" + "SQL\t" + "\tWeb\t");
        System.out.println("\t" + a  + "\t" + "\t" + b + "\t" + "\t" + c + "\t");
        System.out.println("--------------------------------");
        int d = a - b;
        int e = (a + b + c)/3;
        System.out.println("java和Sql的成绩差是：" + d);
        System.out.println("三门课的平均成绩是：" + e);
    }
}
