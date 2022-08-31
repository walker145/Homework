package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + (i * j) + "\t");
            }
            System.out.println();
        }

        //int i = 1;

        for (int i = 1; i <= 10; i++) {
            int j = 1;
            for (j = i + (j - 1); j < 2 * i; j++) {

                System.out.print(j);
            }
            System.out.println();
        }
        int[] arr = new int[20];


        int index = 1;
        for (int x = 1; x < arr.length; x++) {
            for (int z = 0; z < x; z++) {
                if (index == 101){
                    break;
                }
                System.out.print((index++) + " ");
            }
            System.out.println();
        }
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }

}
