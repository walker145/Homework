package heimaTest;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class test09 {
    public static void main(String[] args) {
        //请模拟简单的考试管理系统, 程序需要用户先键盘录入班级的人数, 再录入实际的考试成绩, 随后计算出 (总成绩，平
        //均分，最高分，最低分，不及格人数[低于60分]）
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入班级人数：");
        int num = scanner.nextInt();
        int[] Score = new int[num];
        double sum = 0;
        int count = 0;

        for (int i = 0; i < Score.length; i++) {
            System.out.println("请输入第" + (i+1) + "学生的成绩");
            Score[i] = scanner.nextInt();
            if (Score[i] < 60) {
                count++;
            }
            sum += Score[i];
        }
        for (int i = 0; i < Score.length; i++) {
            System.out.print(Score[i] + "\t");
        }
        Arrays.sort(Score);
        int maxScore = Score[Score.length-1];
        int minScore = Score[0];
        System.out.println("\n总分" + sum + "平均分" + (sum/num) + "最高分" + maxScore + "最低分"
                + minScore + "不及格人数" + count);
//        for (int i = 1; i < Score.length; i++) {
//            if (Score[i] > maxScore){
//                maxScore=Score[i];
//            }

        }
//        for (int i = 1; i < Score.length; i++) {
//            if (Score[i] < minScore){
//                minScore=Score[i];
//            }
//        }

//        for (int i = 0; i < Score.length-1; i++) {
//            for (int j = 0; j < Score.length-1-i; i++) {
//                if (Score[j] > Score[j + 1]) {
//                    minScore = Score[i];
//                    Score[j] = Score[i + 1];
//                    Score[j + 1] = Score[j];
//                }
//            }
//        }
//        for (int i = 0; i < Score.length; i++) {
//            System.out.println(Score[i]);
//        }

    }
