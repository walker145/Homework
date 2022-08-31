package Homwork01;

/**
 * @version 1.0
 * @Authoy 王军
 */
//创建一个Student 类 有属性 名字 性别 年龄 学号
public class Student extends Person{

    private String stu_id;

    public Student(String name, int age, char sex, String stu_id) {//构造器
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    //getter 和 setter 方法

    public String getStu_id() {
        return stu_id;
    }

    public void setStu_id(String stu_id) {
        this.stu_id = stu_id;
    }

    public void study(){
        System.out.println(getName() + "承诺，我要好好学习java");
    }

    //子类实现父类重写
    @Override
    public String Play() {
        return super.Play() + "足球";
    }
    //编写一个输出信息的方法，这样体现封装
    public void printInfo(){
        System.out.println("学生的信息：");
        System.out.println(baseinfo());//这里带上super也可以
        System.out.println("学号：" + stu_id);
        study();
        System.out.println(Play());//这里不能带super 因为子类里有Play 父类没有 super是从父类开始查找的
    }

    @Override
    public String toString() {
        return "Student{" +
                "stu_id='" + stu_id + '\'' +
                '}' + super.toString();
    }
}
