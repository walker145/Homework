package chapter23;

/**
 * @version 1.0
 * @Author 王军
 */
public class Cat {
    private String name = "招财猫";
    public int age = 10;
    public Cat(){};

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void hi(){
        System.out.println("hi" + name);
    }

    public void cry(){
        System.out.println("你好，" + name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
