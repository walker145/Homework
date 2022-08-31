package heimaTest;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test15 {
    public static void main(String[] args) {
        Capacityexpansion capacityexpansion = new Capacityexpansion();
        capacityexpansion.capacityExpansion();
    }
}

class Capacityexpansion {
    public void capacityExpansion() {
        int[] arr = {1, 2, 3, 4};

        Scanner scanner = new Scanner(System.in);
        do {
            int[] arrNew = new int[arr.length + 1];
            for (int i = 0; i < arr.length; i++) {
                arrNew[i] = arr[i];//数组拷贝
            }
            System.out.println("请输入要添加的元素");
            int addnum = scanner.nextInt();
            arrNew[arrNew.length - 1] = addnum;
            arr = arrNew;
            System.out.println("扩容后元素的情况");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println("\n是否继续添加y/n");
            char key = scanner.next().charAt(0);
            if (key=='n'){
                System.out.println("数组扩容结束");
                break;
            }
        }while (true);
    }
}
