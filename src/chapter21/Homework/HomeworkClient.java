package chapter21.Homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author 王军
 */
public class HomeworkClient {
    public static void main(String[] args) throws IOException {
        //在本机的 9999端口 ，如果连接成功，返回Socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9998);

        System.out.println("连接到服务端端");
        System.out.println("客户端 socket返回" + socket.getClass());
        System.out.println("socket返回" + socket.getClass());

        //连接上后，生成Socket,通过socket.getOutputStream()
        //得到和socket相关的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //要求使用字符流  new OutputStreamWriter使用将outputStream转换流将字节转换成字符
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));

        //从键盘读取用户的问题
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String i = scanner.next();
        bufferedWriter.write(i);//发送给服务端数据通道
        bufferedWriter.newLine();//插入一个换行符，表示写如结束，要求对方使用readLine()!!!
        bufferedWriter.flush();//如果使用的是字符流，需要手动刷新，否则数据不会写入数据通道

        //获取socket相关联的输入流，读取（字节），并显示
        InputStream inputStream = socket.getInputStream();
        //使用字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();//接收服务端发送到数据通的数据
        System.out.println(s);

        //关闭流
        bufferedReader.close();//使用字符流时关闭外层流就可以了
        bufferedWriter.close();
        System.out.println("客户端退出");
        inputStream.close();
    }
}
