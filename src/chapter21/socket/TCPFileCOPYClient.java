package chapter21.socket;

import org.junit.platform.commons.util.StringUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @version 1.0
 * @Author 王军
 * 文件上传的客户端
 */
public class TCPFileCOPYClient {
    public static void main(String[] args) throws Exception {

        //1.获取服务端的IP和端口 得到socket 对象
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //创建读取磁盘二进制文件的输入流  使用处理流
        String file = "e:\\t0114046689320db02f.jpg";
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));

        //bytes 就是对应的字节数组
        byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

        //通过socket 获取到输出流，将bytes数据发送到服务端
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(bytes);//将对文件应的字节数组的内容，写入到数据通道
        //设置结束标识
        socket.shutdownOutput();
        bufferedInputStream.close();

        //接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();

        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        System.out.println("客户端退出");
        //关闭相关的流
        inputStream.close();
        bufferedOutputStream.close();
        socket.close();
    }
}
