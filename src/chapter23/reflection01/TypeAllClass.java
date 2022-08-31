package chapter23.reflection01;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @Author 王军
 */
public class TypeAllClass {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {

        Class<String> stringClass = String.class;//外部类
        Class<Serializable> serializableClass = Serializable.class;//接口
        Class<Integer[]> aClass = Integer[].class;//数组
        Class<int[][]> aClass1 = int[][].class;//二维数组
        Class<Override> overrideClass = Override.class;//注解
        Class<Thread.State> stateClass = Thread.State.class;//枚举
        Class<Long> longClass = long.class;//基本数据类型
        Class<Class> classClass = Class.class;
        Class<Void> voidClass = void.class;

        System.out.println(stringClass);
        System.out.println(serializableClass);
        System.out.println(aClass);
        System.out.println(aClass1);
        System.out.println(overrideClass);
        System.out.println(stateClass);
        System.out.println(longClass);
        System.out.println(classClass);
        System.out.println(voidClass);

        //通过反射机制创建对象实例
        //1.调用类中的无参构造器，要求类中必须有public无参构造器
        Class<?> clas = Class.forName("chapter23.reflection01.AA");
        //通过public的无参构造器创建实例
        Object o = clas.newInstance();
        System.out.println("通过public的无参构造器创建实例");
        System.out.println(o);
        //通过public有参构造器创建对象实例
        Constructor<?> constructor = clas.getConstructor(String.class);
        Object wj = constructor.newInstance("wj");
        System.out.println("通过public有参构造器创建对象实例");
        System.out.println(wj);
        //通过非public有参构造器创建对象实例
        Constructor<?> constructor1 = clas.getDeclaredConstructor(String.class, int.class);
        constructor1.setAccessible(true);//暴破，使用反射可以访问私有的构造器，反射面前都是纸老虎
        Object wj1 = constructor1.newInstance("wj", 25);
        System.out.println("通过非public有参构造器创建对象实例");
        System.out.println(wj1);

        //通过反射访问类中的成员
        //1.根据属性名获取field对象
        Constructor<?> constructor2 = clas.getConstructor();
        Object o1 = constructor2.newInstance();
        System.out.println(o1.getClass());//o1的运行类型是AA
        Field name = clas.getField("name");//使用反射得到那么属性
        name.set(o1,"wj");//通过反射操作属性
        System.out.println("通过反射访问类中的成员");
        System.out.println(o1);
        System.out.println(name.get(o1));//返回name属性
        //使用反射操作私有属性
        Field age = clas.getDeclaredField("age");
        age.setAccessible(true);//暴破获取私有属性
        age.set(null,25);//因为age是static属性，因此o1也可以写作null
        System.out.println(o1);
        System.out.println(age.get(o1));

        //通过反射获取类中的方法
        Class<?> cls = Class.forName("chapter23.reflection01.Boss");
        Object o2 = cls.newInstance();
        //调用public 的hi方法
        Method method = cls.getMethod("hi",String.class);
        //得到hi方法对象
        Method hi = cls.getDeclaredMethod("hi",String.class);
        method.invoke(o2,"wj");//调用方法并传入参数
        hi.invoke(o2,"nll");

        //调用私有方法
        //得到say方法对象
        Method say = cls.getDeclaredMethod("say", int.class, String.class, char.class);
        say.setAccessible(true);//因为say方法是私有的所以需要爆破
        System.out.println(say.invoke(null,10,"wj",'A'));//因为say方法是static方法所以可以为空
        System.out.println(say.invoke(o2,20,"wjun",'男'));

        //在反射中，方法有返回值，统一返回Object,但是它运行类型和方法定义的返回类型
        Object invoke = say.invoke(null, 200, "hikv", 'c');
        System.out.println(invoke.getClass());
    }
}

class AA {
    public String name;
    private static int age;

    public AA() {
    }

    public AA(String name) {
        this.name = name;
    }

    private AA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "AA{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class Boss{
    private int age;
    private static String name;
    public Boss(){}//无参构造器

    private static String say(int n,String s,char c){
        return n + " " + s + " " + c;
    }

    public void hi(String s){
        System.out.println("hi" + s);
    }
}