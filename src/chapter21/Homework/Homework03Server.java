package chapter21.Homework;

import chapter21.socket.StreamUtils;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author 王军
 */
public class Homework03Server {
    public static void main(String[] args) throws Exception {

        //1.监听8884端口,
        ServerSocket serverSocket = new ServerSocket(8884);
        //2.等待客户端连接
        Socket accept = serverSocket.accept();
        //3.读取 客户端发送下载的文件名
        InputStream inputStream = accept.getInputStream();
        //写入到字节数组中
        byte[] bytes = new byte[1024];
        int lin = 0;
        String downLoad = "";
        //使用while循环考虑到将来客户端发送的数据比较大
        while (((lin = inputStream.read(bytes)) != -1)) {
            downLoad += new String(bytes,0,lin);
        }
        System.out.println("客户端希望下载的文件名=" + downLoad);

        String resfileName = "";
        if ("消愁".equals(downLoad)){
            resfileName = "src\\消愁.mp3";
        }else {
            resfileName = "sre\\无名.mp3";
        }

        //4.创建一个输入流，读取服务器端上的磁盘文件
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(resfileName));

        //5.使用工具类，读取文件到一个字节数组
        byte[] bytes1 = StreamUtils.streamToByteArray(bufferedInputStream);

        //6.在得到Socket关联的输出流
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(accept.getOutputStream());

        //7.写入到数据通道，返回给客户端
        bufferedOutputStream.write(bytes1);
        accept.shutdownOutput();//设置结束标记

        //关闭相关的流（资源）
        bufferedInputStream.close();
        bufferedOutputStream.close();
        serverSocket.close();
        accept.close();
        System.out.println("服务端退出~~");
    }
}
