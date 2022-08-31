package IO.Outputstream;

import java.io.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class objectoutputstream {
    public static void main(String[] args) throws Exception {

        //指定反序列化的文件
        String file = "e:\\data.dat";

        ObjectInputStream os = new ObjectInputStream(new FileInputStream(file));

        //读取（反序列化）的顺序需要和保存数据的顺序一致
        //否则会出现异常
        System.out.println(os.readInt());
        System.out.println(os.readBoolean());
        System.out.println(os.readChar());
        System.out.println(os.readDouble());
        System.out.println(os.readUTF());

        Object dog = os.readObject();
        System.out.println("运行类型" + dog.getClass());
        System.out.println("dog信息" + dog);
//        objectOutputStream.writeInt(100);//int-->Integer
//        objectOutputStream.writeBoolean(true);
//        objectOutputStream.writeChar('a');
//        objectOutputStream.writeDouble(10.0);
//        objectOutputStream.writeUTF("王军");

        //如果希望调用Dog的方法，需要向下转型
        //需要将Dog类的定义，拷贝引用的位置或则做成共享的
        Dog dog1 = (Dog)dog;
        System.out.println(dog1.getClass());
        os.close();
    }
}
