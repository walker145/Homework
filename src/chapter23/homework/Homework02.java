package chapter23.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @version 1.0
 * @Author 王军
 */
public class Homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<?> Cls = Class.forName("java.io.File");
        //得到所有构造器
        Constructor<?>[] declaredConstructors = Cls.getDeclaredConstructors();
        //遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //
        Constructor<?> declaredConstructor = Cls.getDeclaredConstructor(String.class);
        String fileAllPath = "e:\\wj.txt";
        Object o = declaredConstructor.newInstance(fileAllPath);

        //得到 createNewaFile方法对象
        Method createNewFile = Cls.getMethod("createNewFile");
        createNewFile.invoke(o);//创建文件，调用createNewaFile

        System.out.println(o.getClass());
        System.out.println("文件创建成功" + fileAllPath);
    }
}
