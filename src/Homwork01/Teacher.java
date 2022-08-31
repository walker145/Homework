package Homwork01;

/**
 * @version 1.0
 * @Authoy 王军
 */
//创建一个Teacher 类 属性有 名字 性别 年龄 工龄 做合理封装，通过构造器给四个属性赋值
public class Teacher extends Person{

    private double work_age;

    public Teacher(String name, int age, char sex, double work_age) {
       super(name, sex, age);
        this.work_age = work_age;
    }

    public double getWork_age() {
        return work_age;
    }

    public void setWork_age(double work_age) {
        this.work_age = work_age;
    }

    public void teacher(){
        System.out.println(getName() + "承诺,我会认真教学");
    }

    //子类对父类的方法重写
    @Override
    public String Play() {
        return super.Play() + "象棋";
    }
    //编写一个输出信息的方法，这样体现封装
    public void printInfo(){
        System.out.println("老师的信息：");
        System.out.println(baseinfo());//这里带上super也可以
        System.out.println("工龄：" + work_age);
        teacher();
        System.out.println(Play());//这里不能带super 因为子类里有Play 父类没有 super是从父类开始查找的
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "work_age=" + work_age +
                '}' + super.toString();
    }
}
