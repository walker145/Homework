package chapter21.API;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @version 1.0
 * @Author 王军
 */
public class api {
    public static void main(String[] args) throws UnknownHostException {

        //获取本机的InetAddress 对象
        InetAddress localhost = InetAddress.getLocalHost();
        System.out.println(localhost);//获取本地的主机名和IP地址

        //根据指定主机名 获取InetAddress对象
        InetAddress allByName = InetAddress.getByName("LAPTOP-G00HDR7S");
        System.out.println(allByName);

        //根据域名返回 InetAddress 对象
        InetAddress byName = InetAddress.getByName("www.baidu.com");
        System.out.println(byName);

        //通过InetAddress 对象，获取相应的地址
        String hostAddress = byName.getHostAddress();
        System.out.println(hostAddress);

        //通过InetAddress 对象，获取主机名或者域名
        String hostName = allByName.getHostName();
        System.out.println(hostName);

    }
}
