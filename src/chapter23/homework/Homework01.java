package chapter23.homework;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @Author 王军
 */
public class Homework01 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException, InstantiationException, InvocationTargetException {

        //得到 PrivateTest类对应的Class对象
        Class<PrivateTest> privateTestClass = PrivateTest.class;
        //创建对象实例
        PrivateTest privateTest = privateTestClass.newInstance();
        //得到属性对象
        Field name = privateTestClass.getDeclaredField("name");
        //暴破name 属性
        name.setAccessible(true);
        name.set(privateTest,"你好");
        //得到getName 方法对象,因为getName是public ，所以可以直接调用
        Method method = privateTestClass.getMethod("getName");
        Object invoke = method.invoke(privateTest);
        System.out.println(invoke);
    }
}
