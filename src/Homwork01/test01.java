package Homwork01;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("小明手中交换前的牌");
        System.out.println("请输入小明左手中的牌");
        int a = scanner.nextInt();
        System.out.println("请输入小明右手中的牌");
        int b = scanner.nextInt();
//        int temp = 0;
//        if(a < b){
//            temp = b;
//            b = a;
//            a = temp;
//        }
       // b = (a + b) - (a = b);
        int c = a < b ? a: b;
        if(a > b) c = a;
        else c = b;
        System.out.println("小明手中交换后的牌");
        System.out.println("小明左手中的牌" + a);
        System.out.println("小明右手中的牌" + b);
    }
}