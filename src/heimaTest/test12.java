package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test12 {
    public static void main(String[] args) {
        //键盘录入一个长度为5,元素值在20-70之间的数组;再键盘录入一个数据，将要查找的元素在数组中出现的所有索引
        //位置都记录下来,存储到一个新数组中,遍历新数组!
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数组的长度");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        int i2 = 0;
        int[] arrNew = new int[i2];
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            System.out.println("请输入20-70之间的数");
            arr[i] = scanner.nextInt();
        }


        System.out.println("请再次输入20-70之间的数");
        int i1 = scanner.nextInt();
        for (int j = 0; j < arr.length; j++) {
            if (i1 == arr[j]) {
                arrNew[i2] = arr[j];
                i2++;
                index = j;
                System.out.println("下标为" + index);
            }
        }
        for (int i = 0; i < arrNew.length; i++) {
            System.out.println(arrNew[i2] + "\t");
        }
//        for (int j = 0; j < arr.length; j++) {
//            arrNew[j] = arr[j];
//        }
//        arrNew[arrNew.length-1] = i1;
//        arr = arrNew;
//        for (int j = 0; j < arr.length; j++) {
//            System.out.print(arr[j] + "\t");
//        }
    }
}
