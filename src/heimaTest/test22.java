package heimaTest;


import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test22 {
    public static void main(String[] args) {
        B b = new B();
        int r = b.test(10);
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要输出的斐波那契数");
        int i = scanner.nextInt();
        int c = b.test1(i);
        if (c != 0) {
            System.out.println(i + "对应的斐波那契数是" + c);
        }
        System.out.println(r);
        long start = System.currentTimeMillis();
        for (int j = 1; j <= 60; j++) {
            System.out.print(b.test2(j) + "\t");
        }
        long end = System.currentTimeMillis();
        long time = start - end;
        System.out.println(time);
    }
}

class B {
    public int test(int n) {
        if (n == 1) {
            return 1;
        } else {
            return test(n - 1) * n;
        }
    }

    public int test1(int n) {
        if (n >= 1) {
            if (n == 1 || n == 2) {
                return 1;
            } else {
                return test1(n - 1) + test1(n - 2);
            }
        } else {
            System.out.println("你输入有误");
            return 0;
        }
    }

    public int test2(int d) {
        long start = System.currentTimeMillis();
        if (d == 1 || d == 2) {
            return 1;
        }
        return test1(d - 1) + test1(d - 2);


    }
}

