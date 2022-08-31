package chapter21.UDP1;

import java.io.IOException;
import java.net.*;

/**
 * @version 1.0
 * @Author 王军
 * 发布端
 */
public class UDPSenderB {
    public static void main(String[] args) throws IOException {

        //创建DatagramSocket 对象 准备8882接收收数据
        DatagramSocket datagramSocket = new DatagramSocket(8882);//端口号在同一台主机时需要不同，两台主机的话可以是相同的

        //2.将需要发送的数据封装到datgrampacket 对象
        byte[] bytes = "hello, 明天出去玩~~~~~~~~~~~~~~".getBytes();
        DatagramPacket datagramPacket = new DatagramPacket(bytes, bytes.length,
                InetAddress.getByName("192.168.31.79"),8887);
        datagramSocket.send(datagramPacket);

        //创建一个DatagramPacket 准被接收数据
        byte[] bytes1 = new byte[64*1024];
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes1, bytes1.length);
        //调用接收方法准备接收数据
        System.out.println("接收B端数据");
        datagramSocket.receive(datagramPacket1);
        //可以把datagramPacket数据进行拆包，取出数据并显示
        int length = datagramPacket1.getLength();////实际接收的数据字节长度
        byte[] data = datagramPacket1.getData();
        String s = new String(data, 0, length);
        System.out.println(s);

        //关闭资源
        datagramSocket.close();
        System.out.println("B端退出");
    }
}
