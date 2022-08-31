package IO.properties;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0
 * @Author 王军
 */
public class properties01 {
    public static void main(String[] args) throws IOException {
        //用传统方法编写
        BufferedReader bufferedReader = new BufferedReader(new FileReader("src\\mysql.properties"));

        String line = "";
        while ((line = bufferedReader.readLine()) != null){
            String[] split = line.split("=");
            System.out.println(split[0] + "值是"+split[1]);
        }

        bufferedReader.close();
    }
}
