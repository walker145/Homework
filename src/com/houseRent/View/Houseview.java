package com.houseRent.View;

import com.houseRent.Domain.House;
import com.houseRent.Severse.HouseService;
import com.houseRent.Utils.Utility;

import java.util.Scanner;

/**
 * @version 1.0
 * @Authoy 王军
 * 显示界面
 * 接收用户的输入
 * 调用HouseService 完成对房屋信息的各种操作
 */
public class Houseview {
    private boolean loop = true;//控制显示菜单
    private char key = ' ';//接收用户输入
    private HouseService houseService = new HouseService(10);

    //显示一个主菜单
    public void mainMenu() {
        do {
            System.out.println("===========房屋出租系统==========");
            System.out.println("\t\t\t1.新 增 房 源：");
            System.out.println("\t\t\t2.查 找 房 源 信 息：");
            System.out.println("\t\t\t3.删 除 房 源 信 息：");
            System.out.println("\t\t\t4.修 改 房 屋 信 息：");
            System.out.println("\t\t\t5.显 示 房 屋 信 息：");
            System.out.println("\t\t\t6.退         出：");
            System.out.println("请输入你的选择");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    deletHouse();
                    break;
                case '4':
                    upDateHouse();
                    break;
                case '5':
                    listHouse();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    //编写listHouse()方法显示界面
    public void listHouse() {
        System.out.println("===========房屋列表============");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t房租\t\t状态(未出租/已出租)");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("===========房屋列表显示完毕=========");
    }

    //编写addHouse 接收用户天价房源信息界面，创建House 对象 调用add方法
    public void addHouse() {
        System.out.println("===========添加房屋完成=============");
        Scanner scanner = new Scanner(System.in);
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(11);
        System.out.print("地址：");
        String address = Utility.readString(26);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String Statar = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的，用户不能输入
        House house = new House(0, name, phone, address, rent, Statar);
        if (houseService.add(house)) {
            System.out.println("=============添加完成==============");
        } else {
            System.out.println("=============添加失败==============");
        }
    }

    //编写deletHouse()方法
    public void deletHouse() {
        System.out.println("================删除房屋==============");
        System.out.println("请输入待删除房屋的编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("=============你放弃了删除===========");
            return;
        }
        System.out.println("请确认是否删除(输入y/n),请小心选择");
        char choice = Utility.readConfirmSelection();//该方法本身就有循环判断的逻辑
        if (choice == 'Y') {
            if (houseService.del(delId)) {
                System.out.println("=============删除成功===========");
            } else {
                System.out.println("=============房屋编号不存在，删除失败===========");
            }
        } else {
            System.out.println("=============你放弃了删除===========");
        }
    }

    //退出选择机制
    public void exit() {
        char Exit = Utility.readConfirmSelection();
        if (Exit == 'Y') {//判断是否输入的是Y
            loop = false;
        }
    }

    //根据id查找房屋信息
    public void findHouse() {
        System.out.println("================查找房屋信息=================");
        System.out.print("请输入你要查找的房屋id:");
        int findId = Utility.readInt();

        //调用方法
        House byId = houseService.findById(findId);
        if (byId != null) {
            System.out.println(byId);
        } else {
            System.out.println("查找的房屋信息ID不存在");
        }
    }

    //修改房屋信息
    public void upDateHouse() {
        System.out.println("============修改房屋信息============");
        System.out.println("请选择待修房房屋的id:");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("=============你放弃修改房屋信息=============");
            return;
        }
        //根据输入的id查找
        House byId = houseService.findById(updateId);
        if (byId == null) {
            System.out.println("=============你要修改的房屋编号不存在=============");
            return;
        }

        System.out.println("姓名(" + byId.getName() + "):");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            byId.setName(name);
        }
        System.out.println("电话(" + byId.getPhone() + "):");
        String phone = Utility.readString(11, "");
        if (!"".equals(phone)) {
            byId.setPhone(phone);
        }
        System.out.println("地址(" + byId.getAddress() + "):");
        String Add = Utility.readString(20, "");
        if (!"".equals(Add)) {
            byId.setAddress(Add);
        }
        System.out.println("租金(" + byId.getRent() + "):");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            byId.setRent(rent);
        }
        System.out.println("状态(" + byId.getStatar() + "):");
        String state = Utility.readString(3, "");
        if (!"".equals(state)) {
            byId.setStatar(state);
        }
        System.out.println("===========修改房屋信息成功=============");
    }
}
