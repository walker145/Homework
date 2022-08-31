package Aggregate;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @version 1.0
 * @Author 王军
 */
@SuppressWarnings({"all"})
public class Aggregateexercise02 {
    public static void main(String[] args) {
        //2.题
        //1定义一个Avengers类
        //1)属性: 编号id ( int类型 ) ，姓名name（String类型），性别sex （String类型）
        //2)方法：空参满参构造 set、get方法
        //2. 在测试类中创建6个对象（对象数据如下），依次将Avengers对象存入集合。
        //1,"钢铁侠","男"
        //2,"美国队长","男"
        //3,"黑寡妇","女"
        //4,"绿巨人","男"
        //5,"雷神","男"
        //6,"星云","女
        //3. 遍历集合删除其中性别为男且姓名长度大于等于3的元素，将剩余的元素数据打印在控制台。
        ArrayList arrayList = new ArrayList();
        Avengers avengers = new Avengers(1, "钢铁侠", "男");
        Avengers avengers1 = new Avengers(2, "美国队长", "男");
        Avengers avengers2 = new Avengers(3, "黑寡妇", "女");
        Avengers avengers3 = new Avengers(4, "绿巨人", "男");
        Avengers avengers4 = new Avengers(5, "雷神", "男");
        Avengers avengers5 = new Avengers(6, "星云", "女");
        arrayList.add(avengers);
        arrayList.add(avengers1);
        arrayList.add(avengers2);
        arrayList.add(avengers3);
        arrayList.add(avengers4);
        arrayList.add(avengers5);

        for (int i = 0; i < arrayList.size(); i++) {
            Avengers Ave = (Avengers) arrayList.get(i);
            if (Ave.getSex().equals("男") && Ave.getName().length() >= 3) {
                arrayList.remove(i);
            } else {
                System.out.println(Ave);
            }
        }
    }
}

class Avengers {
    private int id;
    private String name;
    private String sex;

    public Avengers(int id, String name, String sex) {
        this.id = id;
        this.name = name;
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Avengers{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
