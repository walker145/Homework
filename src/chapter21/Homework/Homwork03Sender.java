package chapter21.Homework;

import chapter21.socket.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

/**
 * @version 1.0
 * @Author 王军
 * 客户端
 */
public class Homwork03Sender {
    public static void main(String[] args) throws Exception {

        //1.创建接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downloadName = scanner.next();

        //2.连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 8884);

        //3.获取和Socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadName.getBytes());

        //4.设置结束标志
        socket.shutdownOutput();

        //5.读取服务端返回的文件（字节数据）
        BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //6.得到一个输出流将 bytes 写入磁盘
        String s = "e:\\" + downloadName + ".mp3";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(s));
        bufferedOutputStream.write(bytes);

        //关闭相关的资源
        bufferedInputStream.close();
        bufferedOutputStream.close();
        socket.close();
        outputStream.close();

        System.out.println("客户端下载完毕，退出~~~");
    }
}
