package IO.Outputstream;

import java.io.Serializable;

/**
 * @version 1.0
 * @Authoy 王军
 */
class Dog implements Serializable {
    private String name;
    private int age;
    //序列化对象时，默认将里面的属性都进行序列化，但除了static修饰或transient
    private static String nation;
    private transient String color;

    //serialVersionUID 序列化的版本号，可以提高兼容性，可以提高兼容性
    private static final long serialVersionUID = 1l;
    public Dog(String name, int age, String nation,String color) {
        this.name = name;
        this.age = age;
        this.color = color;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
