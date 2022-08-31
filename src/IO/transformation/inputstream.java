package IO.transformation;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * @version 1.0
 * @Authoy 王军
 * 使用inputstreamreade 转换流解决中文乱码，指定编码
 */
public class inputstream {
    public static void main(String[] args) throws Exception {

        String file = "e:\\new03.txt";

        //InputStreamReader gbk = new InputStreamReader(new FileInputStream(file), "gbk");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader
                (new FileInputStream(file), "gbk"));

        String s = bufferedReader.readLine();
        System.out.println("读取内容" + s);

        bufferedReader.close();
    }
}
