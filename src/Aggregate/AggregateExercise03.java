package Aggregate;

import java.util.ArrayList;

/**
 * @version 1.0
 * @Author 王军
 */
public class AggregateExercise03 {
    public static void main(String[] args) {
        //定义个学生类Student，包含空参构造、满参构造和以下成员变量：
        //姓名name(String类型) 成绩 score(ing 类型)
        //生成以上成员变量的set、get方法
        //定义测试类，创建三个对象，存入集合中，之后遍历集合list，求出三个学生的平均成绩
        ArrayList<Student> objects = new ArrayList<>();
        Student student = new Student("jack", 80.5);
        Student student1 = new Student("tom", 91);
        Student student3 = new Student("simter", 60);
        objects.add(student);
        objects.add(student1);
        objects.add(student3);
        double sum = 0;
        for (Student o : objects) {
            sum += o.getScore();
            System.out.println(o);
        }
        System.out.println("avg=" + (sum / objects.size()));
    }
}

class Student {
    private String name;
    private double score;

    public Student(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
