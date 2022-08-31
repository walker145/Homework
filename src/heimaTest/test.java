package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("=======arr数组情况======");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\n=======arr数组的情况(倒序)=======");
        for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i] + "\t");
        }

        double sum = arr[0];
        int max = arr[0];
        int maxindex = 0;
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
            if (max < arr[i]){
                max = arr[i];
                maxindex = i;
            }
        }
        int findNum = 8;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {

            if (findNum == arr[i]){
                System.out.println("\n找到数" + findNum + "下标为" +i);
                index = i;
                break;
            }
        }
        if (index == -1){
            System.out.println("\n没有找到数" + findNum);
        }
        System.out.println("\nsum=" + (sum/arr.length) + "\nmax=" + max + "\nmaindex=" + maxindex);
    }
}
