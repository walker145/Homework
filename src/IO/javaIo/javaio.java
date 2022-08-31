package IO.javaIo;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class javaio {
    public static void main(String[] args) {

    }

    @Test
    public void readfile01() {
        String file = "e:\\new01.txt";
        int read = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象 用于读取文件
            fileInputStream = new FileInputStream(file);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
            while ((read = fileInputStream.read()) != -1) {
                System.out.print((char) read);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //读取文件提高效率
    @Test
    public void readfile02() {
        String file = "e:\\new01.txt";
        //int read = 0;
        //字节数组
        byte[] arr = new byte[8];
        int readlength = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建 FileInputStream 对象 用于读取文件
            fileInputStream = new FileInputStream(file);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
            while ((readlength = fileInputStream.read(arr)) != -1) {
                System.out.print(new String(arr, 0, readlength));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流释放资源
            try {
                //必须关闭文件流
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
