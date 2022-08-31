package Aggregate;

import java.util.LinkedList;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class linkedList {
    public static void main(String[] args) {
        //Linkedlist底层实现了双向链表和双端队列特点
        //可以添加任意元素（元素可以重复），包括null
        //线程不安全没有实现同步
        LinkedList linkedList = new LinkedList();
        //模拟一个简单的双向链表
        Node node = new Node("jack");
        Node node1 = new Node("jack1");
        Node node2 = new Node("jack2");

        //连接三个结点
        //jack --> jack1 --> jack2
        node.next = node1;
        node1.next = node2;
        //jack2 --> jack1 --> jack
        node2.pre = node1;
        node1.pre = node;

        Node first = node;
        Node last = node2;

        //从头到尾遍历
        System.out.println("双向链表从头到尾的遍历输出");
        while (true){
            if (first == null){
                break;
            }
            //输出first 信息
            System.out.println(first);
            first = first.next;
        }

        //从尾到头的遍历
        System.out.println("双向链表从尾到头的遍历输出");
        while (true){
            if (last == null){
                break;
            }
            System.out.println(last);
            last = last.pre;
        }

        //链表添加对象或数据
        //先创建Node 结点
        Node jack3 = new Node("jack3");
        jack3.next = node2;
        jack3.pre = node1;
        node1.next =jack3;
        node2.pre = jack3;

        //让fist重新指向node 重置
        first = node;

        //添加对象或数据后再次遍历
        System.out.println("双向列表添加对象/数据遍历输出");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }

        //删除双向列表的对象或元素
//        jack3.next = node2;
//        jack3.pre = node;
//        node.pre = jack3;
//        node2.next = jack3;

        node1.next = node2;
        node2.pre = node1;
        first = node1;
        System.out.println("删除最后一个元素的双向列表");
        while (true){
            if (first == null){
                break;
            }
            System.out.println(first);
            first = first.next;
        }
    }
}

//定义一个Node 类，Node 对象 表示双向链表的一个结点
class Node {
    public Object item;//真正存数据
    public Node next;//指向后一个结点
    public Node pre;//指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }

}
