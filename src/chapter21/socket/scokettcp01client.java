package chapter21.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;

import java.net.Socket;
import java.net.UnknownHostException;


/**
 * @version 1.0
 * @Author 王军
 */
public class scokettcp01client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);

        System.out.println("客户端 socket返回" + socket.getClass());
        System.out.println("socket返回" + socket.getClass());

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello server".getBytes());
        //设置结束标记
        socket.shutdownOutput();

        //获取socket相关联的输入流，读取（字节），并显示
        InputStream inputStream = socket.getInputStream();
        byte[] buf = new byte[1024];
        int readeline = 0;
        while ((readeline = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readeline));
        }

        //关闭流
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
        inputStream.close();
    }
}
