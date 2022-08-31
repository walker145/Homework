package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test05 {
    public static void main(String[] args) {
        //输出100以内（100）被6整除的数字，每5个换一行
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 6 == 0) {
                sum++;
                System.out.print(i+"\t");
                if (sum % 5 == 0) {
                    System.out.println();
                }
            }
        }

    }
}
