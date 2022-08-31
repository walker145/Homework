package IO.transformation;

import java.io.*;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class codequestiong {
    public static void main(String[] args) throws Exception {

        String file = "e:\\new03.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String s = bufferedReader.readLine();
        System.out.println("读取的文件" + s);

        bufferedReader.close();

        //转换流  字节流--->字符流  字节流可以指定编码方式
    }
}
