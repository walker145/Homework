package IO.Outputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class onjectoutstream {
    public static void main(String[] args) throws Exception {
        //序列化后，保存的文件格式，不是纯文本，而是按照它的格式来保存
        String file = "e:\\data.dat";

        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));

        //序列化具有可继承性，即父类实现了序列化其子类都实现了序列化
        //序列化数据
        objectOutputStream.writeInt(100);//int-->Integer
        objectOutputStream.writeBoolean(true);
        objectOutputStream.writeChar('a');
        objectOutputStream.writeDouble(10.0);
        objectOutputStream.writeUTF("王军");
        //保存一个dog对象向
        objectOutputStream.writeObject(new Dog("大黄",10,"德国","白色"));

        objectOutputStream.close();
        System.out.println("序列化形式");
    }
}
//如果需要序列化某个类的对象 需要实现Serializable 接口

