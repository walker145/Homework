package heimaTest;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test03 {
    public static void main(String[] args) {
        //定义一个数组存储10个学生的成绩，例如：{72, 89, 65, 87, 91, 82, 71, 93, 76, 68}。计算并输出学生的平均成绩。
        double[] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("总分：" + sum +"平均分是：" + (sum/ arr.length));
    }
}
