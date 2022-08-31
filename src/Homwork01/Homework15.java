package Homwork01;

/**
 * @version 1.0
 * @Authoy 王军
 *  *多态：方法或对象具有多中形态，是oop的三大特征 建立在封装和继承的基础之上
 *  * 多态的具体体现
 *  * 1.方法多态
 *  * 1)方法的重载体现多态
 *  * 2)犯法的重写体现多态
 *  * 2.对象多态
 *  * 1)对象的编译类型和运行类型不一致，编译类型在定义时，就确定的不能忘变化
 *  * 2)对象的运行类型是可以变化的，可以通过getClass()方法来查看运行类型
 *  * 3)编译类型看定义时 看 等号的左边 ，运行类型等号的右边
 *  * 3.举例说明
 *  动态绑定机制
 *  当调用对象的方法时，该方法会和对象的内存地址/运行类型进行绑定
 *  */
public class Homework15 {
    public static void main(String[] args) {
        AA aa = new BB();//向上转型
        BB bb = (BB) aa;//向下转型
        System.out.println("bb的运行类型" + bb.getClass());//BB
        AA a1 = aa;
        System.out.println("aa的运行类型" + aa.getClass());//BB
        aa = new CC();//向上转型
        System.out.println("aa的运行类型" + aa.getClass());//CC
        aa = a1;//aa指向a1的运行类型
        System.out.println("aa的运行类型" + aa.getClass());//BB
        CC cc = new CC();

    }
}
class AA{

}

class BB extends AA {

}

class CC extends BB {

}
