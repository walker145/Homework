package chapter21.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author 王军
 */
public class ScoletTCP01Server {
    public static void main(String[] args) throws IOException {
        //在本机的 9999端口监听，等待连接
        //细节：要求在本机没有其它服务器在监听9999
        ServerSocket serverSocket1 = new ServerSocket(9999);

        System.out.println("服务器端正在运行");

        //当没有客户端连接9999端口时，程序会阻塞，等待连接
        //如果有客户连接，则返回Socket对象，程序继续
        Socket accept = serverSocket1.accept();

        System.out.println("socket = " + accept.getClass());

        InputStream inputStream = accept.getInputStream();

        byte[] buf = new byte[1024];

        int readline = 0;

        while ((readline = inputStream.read(buf)) != -1){
            System.out.println(new String(buf,0,readline));
        }

        //获取相关联的输出流
        OutputStream outputStream = accept.getOutputStream();
        outputStream.write("hello,client".getBytes());

        //设计写入结束结束标记
        accept.shutdownOutput();

        //关闭流
        inputStream.close();
        accept.close();
        serverSocket1.close();
        outputStream.close();

    }
}
