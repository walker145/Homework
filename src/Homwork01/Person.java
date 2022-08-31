package Homwork01;

/**
 * @version 1.0
 * @Authoy 王军
 */
//将共同的属性放在Person类
public class Person {
    private String name;
    private char sex;
    private int age;

    public Person(String name, char sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //编写一个play方法
    public String Play(){
        return name + "爱玩";
    }
    //返回一个基本信息  这里要分析出输出信息的方法
    public String baseinfo(){
        return "姓名:" + name + "\n年龄:" + age + "\n性别:" + sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}
