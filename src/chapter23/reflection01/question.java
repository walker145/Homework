package chapter23.reflection01;

import chapter23.Cat;
import jdk.nashorn.internal.ir.CallNode;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @version 1.0
 * @Author 王军
 * 反射问题的引出
 */
@SuppressWarnings({"all"})
public class question {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        //传统的方式 new 对象 -》 调用方法
       //Cat cat = new Cat();
       //cat.hi(); ===> cat.cry() 修改源码.

        //我们尝试做一做 -> 明白反射

        //1. 使用Properties 类, 可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classically").toString();//"chapter23.Cat"
        String methodName = properties.get("method").toString();//"hi"
        System.out.println("classfullpath=" + classfullpath);
        System.out.println("method=" + methodName);
        //2. 创建对象 , 传统的方法，行不通 =》 反射机制
        //new classfullpath();

        //3. 使用反射机制解决
        //(1) 加载类, 返回Class类型的对象cls
        Class cls = Class.forName(classfullpath);
        //(2) 通过 cls 得到你加载的类 chapter23.Cat 的对象实例
        Object o = cls.newInstance();
        System.out.println("o的运行类型=" + o.getClass()); //运行类型
        //(3) 通过 cls 得到你加载的类 chapter23.Cat 的 methodName"hi"  的方法对象
        //    即：在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //(4) 通过method1 调用方法: 即通过方法对象来实现调用方法
        System.out.println("=============================");
        method1.invoke(o); //传统方法 对象.方法() , 反射机制 方法.invoke(对象)

        //得到Cat的属性
        //getField不能得到私有属性
        Field name = cls.getField("age");
        System.out.println(name.get(o));

        //
        Constructor constructor = cls.getConstructor();
        System.out.println(constructor);

        Constructor constructor1 = cls.getConstructor(String.class);
        System.out.println(constructor1);

        //获取class对象的六种方法
        //1.通过读取配置文件获取
        Class<?> cls2 = Class.forName("chapter23.Cat");
        Object o1 = cls2.newInstance();
        Method hi = cls2.getMethod("cry");
        System.out.println("=======通过配置文件获取Class对象");
        hi.invoke(o1);
        System.out.println(o1.getClass());
        System.out.println(o1);
        //2.通过类.Class获取 用于传递参数
        Class<Cat> cls3 = Cat.class;
        Cat cat = cls3.newInstance();
        System.out.println("通过类.Class获取");
        System.out.println(cls3);

        //3.通过对象.getClass获取 应用场景有对象实例
        Cat cat1 = new Cat();
        Class<? extends Cat> cls4 = cat1.getClass();
        System.out.println("通过对象.getClass获取");
        System.out.println(cls4);
        //4.通过类加载器获取Class对象
        //有四种类加载器
        //先得到类加载器
        ClassLoader classLoader = cat1.getClass().getClassLoader();
        //通过类加载器得到class对象
        Class<?> cls5 = classLoader.loadClass(classfullpath);
        System.out.println("====================");
        System.out.println(cls5);

        //通过基本数据类型.class获取
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        System.out.println("==================");
        System.out.println(integerClass);

        //通过包装类.class获取
        Class<Integer> integerClass1 = Integer.TYPE;
        System.out.println("===================");
        System.out.println(integerClass);

        System.out.println("====================");
        System.out.println(cls.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());
        System.out.println(cls5.hashCode());
        System.out.println("=======================");
        System.out.println(integerClass.hashCode());
        System.out.println(integerClass1.hashCode());
    }
}
