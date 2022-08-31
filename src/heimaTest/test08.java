package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test08 {
    public static void main(String[] args) {
        /*模拟计算器功能，对键盘录入的两个int类型的数据进行加、减、乘、除的运算，并打印运算结果。
        要求：
        键盘录入三个整数，其中前两个整数代表参加运算的数据， 第三个整数为要进行的运算
                (1:表示加法运算,2:表示减法运算,3:表示乘法运算,4:表示除法运算)
        请输入第一个整数： 10
        请输入第二个整数： 20
        请输入您要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)
        3
        10 * 20 = 200*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        double a = scanner.nextDouble();
        System.out.println("请输入第一个整数：");
        double b = scanner.nextInt();
        System.out.println("请输入你要进行的运算(1:表示加法,2:表示减法,3:表示乘法,4:表示除法)");
        int c = scanner.nextInt();
        switch (c) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                System.out.println("%.2f" + (a / b));
                break;
            default:
        }
    }
}
