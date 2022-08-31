package chapter21.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @version 1.0
 * @Author 王军
 * 文件上传的服务端
 */
public class TCPFileCOPYServer {
    public static void main(String[] args) throws Exception {

        //1.服务端在本机监听8888端口
        ServerSocket serverSocket = new ServerSocket(8888);
        System.out.println("服务端在8888端口监听....");
        //2.等待客户端的连接
        Socket accept = serverSocket.accept();

        //3.读取客户端发送的数据
        //通过socket得到输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(accept.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);
        //4.将得到的bytes 写入到指定的路径，就得到一个文件
        String file1 = "src\\ghp.jpg";
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file1));
        bufferedOutputStream.write(bytes);
        bufferedOutputStream.close();

        //向客户端回复 收到图片
        //通过socket 获取到输出流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(accept.getOutputStream()));
        bufferedWriter.write("收到图片");
        bufferedWriter.flush();//把内容刷新到数据通道
        accept.shutdownOutput();//设置写入结束标记

        //关闭相关流
        bufferedWriter.close();
        bufferedInputStream.close();
        serverSocket.close();
        accept.close();
    }
}
