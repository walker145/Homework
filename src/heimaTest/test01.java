package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test01 {
    public static void main(String[] args) {
        int a = (int) (55 + (Math.random() * (88 - 55 + 1)));
        int b = (int) (55 + (Math.random() * (88 - 55 + 1)));
        System.out.println("a=" + a + "\nb=" + b);
        System.out.println((a > b) ? a + b : a * b);
    }
}
