package Homwork01;

/**
 * @version 1.0
 * @Authoy 王军
 */
//应该分析出打印的方法
public class chapte09Homework13 {
    public static void main(String[] args) {
        Student student = new Student("wangjun", 25, '男', "00021354");
        student.printInfo();//封装

        System.out.println("======================");
        Teacher teacher = new Teacher("jack", 36, '女', 12);
        teacher.printInfo();
        //定义多态数组，里面保存两个学生 和 两个教师，要求按年龄从高到低排序
        Person[] people = new Person[4];
        people[0] = new Student("tom", 25, '男', "0001");
        people[1] = new Student("smith", 20, '女', "0002");
        people[2] = new Teacher("aexl", 35, '女', 10);
        people[3] = new Teacher("aell", 45, '男', 15);

        chapte09Homework13 chapte09Homework13 = new chapte09Homework13();
        chapte09Homework13.bubbleSort(people);

        //遍历数组输出排序后的数组
        System.out.println("=======排序后的情况======");
        for (int i = 0; i < people.length; i++){
            System.out.println(people[i]);
        }

        //遍历数组然后调用test方法
        System.out.println("=======排序后的情况======");
        for (int i = 0; i < people.length; i++){
            chapte09Homework13.test(people[i]);
        }

    }
    //定义方法，形参为Person类型，功能：调用学生的study或教师的teacher
    //分析这里或使用到向下转型和类型转换
    public void test(Person h){
        if(h instanceof Student){//h 的运行类型如果是Student
            ((Student) h).study();
        }else if (h instanceof Teacher){
            ((Teacher) h).teacher();
        }else {
            System.out.println("");
        }
    }

    //方法 完成年龄从高到低排序
    public void bubbleSort(Person[] people) {
        Person temp = null;
        for (int i = 0; i < people.length - 1; i++)
            for (int j = 0; j < people.length - 1 - i; j++) {
                //判断条件可以根据需求改变
                if (people[j].getAge() < people[j + 1].getAge()) {
                    temp = people[j];
                    people[j] = people[j + 1];
                    people[j + 1] = temp;
                }
            }
    }
}
