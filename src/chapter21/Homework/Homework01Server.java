package chapter21.Homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author 王军
 */
public class Homework01Server {
    public static void main(String[] args) throws IOException {
        //在本机的 9999端口监听，等待连接
        //细节：要求在本机没有其它服务器在监听9999
        ServerSocket serverSocket = new ServerSocket(9998);

        System.out.println("服务器端正在运行。。。。");

        //当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户连接，则返回Socket对象，程序继续
        Socket accept = serverSocket.accept();

        //System.out.println("socket = " + accept.getClass());

        //通过accept.getInputStream() 读取客户端写入到数据通道的数据，显示
        InputStream inputStream = accept.getInputStream();

        //IO读取，使用字符流，使用转换流InputStreamReader 将inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();//接收客户端发送到数据通道的数据
        System.out.println(s);//输出

        String answer = "";
        if ("name".equals(s)){
            answer = "我是王军";
        }else if ("hobby".equals(s)){
            answer = "编写java程序";
        }else {
            answer = "你说的啥";
        }

        //获取相关联的输出流
        OutputStream outputStream = accept.getOutputStream();
        //使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write(answer);//发送给客户端的数据通道
        bufferedWriter.newLine();
        bufferedWriter.flush();//使用字符流时，需要手动刷新

        //关闭流
        bufferedReader.close();
        bufferedWriter.close();
        serverSocket.close();
        outputStream.close();
    }
}
