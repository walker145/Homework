package AggregateHomework;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HashMap_ {
    private String name;
    private int salary;

    public HashMap_(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  "name=" + name;
    }
}
