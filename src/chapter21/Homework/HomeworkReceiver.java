package chapter21.Homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @version 1.0
 * @Author 王军
 */
public class HomeworkReceiver {
    public static void main(String[] args) throws IOException {
        //1.创建一个DatagramSocket 对象，准备在8887接收数据
        DatagramSocket datagramSocket = new DatagramSocket(8886);
        //2.创建一个DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[64 * 1024];
        DatagramPacket datagramPacket = new DatagramPacket(buf, buf.length);
        //调用接收方法准被接收数据
        //如果没有数据包发送到本机端口8887，就会阻塞

        datagramSocket.receive(datagramPacket);

        //可以把datagramPacket数据进行拆包，取出数据并显示
        int length = datagramPacket.getLength();//实际接收的数据字节长度
        byte[] data = datagramPacket.getData();//获取接收的数据
        String server = new String(data, 0, length);
        System.out.println(server);
        String answer = "";
        if ("四大名著是那些".equals(server)){
            answer = "四大名著《红楼梦》，《西游记》，《三国》，《水浒》";
        }else {
            answer ="你说啥";
        }

        //将需要发送的数据封装到
        byte[] bytes = answer.getBytes();
        DatagramPacket datagramPacket1 = new DatagramPacket(bytes, bytes.length, InetAddress.getByName("192.168.31.79"), 8882);
        datagramSocket.send(datagramPacket1);

        //关闭资源
        datagramSocket.close();
        System.out.println("A端退出。。。");
    }
}
