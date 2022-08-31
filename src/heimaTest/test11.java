package heimaTest;

import java.sql.SQLOutput;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test11 {
    public static void main(String[] args) {
        //有一个数组，其中有十个元素从小到大依次排列 {12,14,23,45,66,68,70,77,90,91}。再通过键盘录入一个整数数
        //字。
        //要求：把数字放入数组序列中，生成一个新的数组，并且数组的元素依旧是从小到大排列的。执行效果如下：
        //请输入一个整数数字： 50 生成的新数组是：12 14 23 45 50 66 68 70 77 90
        //数组的扩容+定位
        int[] arr = {12, 14, 23, 45, 66, 68, 70, 77, 90, 91};
        int addNum = 50;
        int index = -1;//index插入的位置

        //遍历数组
//        for (int i = 0; i < arr.length; i++) {
//            if(addNum<=arr[i]){
//                index = i;
//                break;//发现位置就退出
//            }
//        }
//        if (index == -1){
//            index = arr.length;
//        }
//
//        //扩容
//        int[] arrNew = new int[arr.length + 1];
//        for (int i = 0,j = 0; i < arrNew.length; i++) {
//            if (i != index){
//                arrNew[i] = arr[j];
//                j++;
//            }else {
//                arrNew[i] = addNum;
//            }
//        }
//
//        arr = arrNew;
//        System.out.println("先定位再插入后的情况");
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+"\t");
//        }

        //先扩容
        int[] Arrnew = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            Arrnew[i] = arr[i];
        }
        Arrnew[Arrnew.length - 1] = addNum;
        arr = Arrnew;

        //重新排序
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }
}
