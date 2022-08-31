package heimaTest;

import jdk.nashorn.internal.ir.CallNode;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test16 {
    public static void main(String[] args) {
        Reduce reduce = new Reduce();
        reduce.reduce();
    }
}

class Reduce {
    public void reduce() {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};

        Scanner scanner = new Scanner(System.in);
        do {
            int[] arrNew = new int[arr.length - 1];
            for (int i = 0; i < arrNew.length; i++) {
                arrNew[i] = arr[i];//数组拷贝
            }
//            System.out.println("请输入要缩减的元素");
//            int addnum = scanner.nextInt();
//            arrNew[arrNew.length - 1] = addnum;
            arr = arrNew;
            System.out.println("数组缩减后元素的情况");
            for (int i = 0; i < arrNew.length; i++) {
                System.out.print(arrNew[i] + "\t");
            }
            System.out.println("是否继续添加y/n");
            char key = scanner.next().charAt(0);
            if (key == 'n') {
                break;
            }else if (arr.length==1){
                System.out.println("数组只剩一个元素无法继续缩减");
                break;
            }
        } while (true);
        System.out.println("你退出了缩减");
    }
}