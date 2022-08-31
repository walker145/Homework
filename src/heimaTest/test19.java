package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
        for (int i = 5; i >= 0; i--) {
            for (int k = 0; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++)
                if (j == 1 || j == 2 * i - 1 || i == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            System.out.println();
        }
    }
}
