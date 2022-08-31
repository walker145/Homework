package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test06 {
    public static void main(String[] args) {
        //让用户依次录入三个整数，求出三个数中的最小值，并打印到控制台
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int a = scanner.nextInt();
        System.out.print("请输入第二个数：");
        int b = scanner.nextInt();
        System.out.print("请输入第三个数：");
        int c = scanner.nextInt();
        int max = 0;
        if (a > b) {
            max = a;
        } else if (a < c) {
            max = c;
        } else {
            max = b;
        }
        System.out.println("max=" + max);
    }
}
