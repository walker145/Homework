package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test13 {
    public static void main(String[] args) {
        //请输入1-100进行如下打印方式:
        //1 2
        //3 4 5
        //6 7
        //8 9 10
        //Scanner scanner = new Scanner(System.in);
        int count = 1;
        for (int i = 1; i <= 100; i++) {
            //System.out.print("请输入第" + i + "个数");
            if (i != i+5) {
                System.out.println(i + "\t");
            }else {
                System.out.println();
            }
        }
    }
}
