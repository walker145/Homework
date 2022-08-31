package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test20 {
    public static void main(String[] args) {
        int[][] arr = new int[10][];//创建一个二维数组
        for (int i = 0; i < arr.length; i++) {//遍历数组中的每个元素

            //给每个一维数组开辟空间
            arr[i] = new int[i + 1];
            for (int j = 0; j < arr[i].length; j++) {
                if (j == 0 || j == arr[i].length - 1) {
                    arr[i][j] = 1;

                } else {
                    arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
                }
            }
        }
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j < arr.length-i ; j++) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j] + "\t");
                if (j == i){
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
