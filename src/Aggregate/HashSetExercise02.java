package Aggregate;

import java.util.HashSet;
import java.util.Objects;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HashSetExercise02 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new MyDate("jack",18,"1997.3.25"));
        hashSet.add(new MyDate("tom",28,"1999.3.25"));
        hashSet.add(new MyDate("jack",48,"1997.3.25"));
        System.out.println(hashSet);
    }
}
class Employee02 {
    private String name;
    private double sal;

    public Employee02(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

//    @Override
//    public String toString() {
//        return "\tname='" + name + "\tsal=" + sal ;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee02 that = (Employee02) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
class MyDate extends Employee02{
    private String birthDay;

    public MyDate(String name, double sal, String birthDay) {
        super(name, sal);
        this.birthDay = birthDay;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "name=" + getName() + "\tsal=" + getSal() +"\tbirthDay='" + birthDay ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(birthDay, myDate.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), birthDay);
    }
}