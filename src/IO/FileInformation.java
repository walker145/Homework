package IO;

import org.junit.jupiter.api.Test;

import java.io.File;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("e:\\news3.txt");

        //调用相应的方法，得到对应信息
        System.out.println("文件名：" + file.getName());
        System.out.println("文件绝对路径：" + file.getAbsolutePath());
        System.out.println("文件父级目录：" + file.getParent());
        System.out.println("文件文件大小：" + file.length());
        System.out.println("文件是否存在：" + file.exists());
        System.out.println("文件是不是一个文件：" + file.isFile());
        System.out.println("文件是不是一个目录：" + file.isDirectory());
    }

    //目录的操作和删除
    @Test
    public void delete(){
        String file = "e:\\news3.txt";
        File file1 = new File(file);
        if (file1.exists()){
            if (file1.delete()){
                System.out.println(file + "删除成功");
            }else {
                System.out.println(file + "删除失败");
            }
        }else {
            System.out.println("文件不存在");
        }
    }
}
