package IO;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class FileRead01 {
    public static void main(String[] args) {
        //文件就是保存数据的地方
        //流：数据在数据源（文件）和程序（内存）之间经历的路径
        //输入流：数据从数据源（文件）到程序（内存）的路径
        //输出流：数据从程序（内存）到数据源（文件）的路径
        //创建文件对象相关构造器和方法
        //创建文件
        //获取文件的信息

    }
    //创建文件
    @Test
    public void creat01(){
        String filePath = "e:\\new01.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //方式2
    @Test
    public void creat02(){
        File file = new File("e:\\");
        String fileName = "nes02.txt";
        File file1 = new File(file, fileName);
        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方3
    @Test
    public void creat03(){
        String file = "e:\\";
        String fileName = "news3.txt";
        File file1 = new File(file, fileName);

        try {
            file1.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
