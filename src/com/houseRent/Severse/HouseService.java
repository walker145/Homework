package com.houseRent.Severse;

import com.houseRent.Domain.House;

/**
 * @version 1.0
 * @Authoy 王军
 */
public class HouseService {
    private House[] houses;//保存House对象
    private int HouseNum = 1;//记录当前有多少个房屋的信息
    private int idCounter = 1;
    public HouseService(int size){

        houses = new House[size];//当创建HouseSercice对象，指定数组大小
        //为了配合测试列表信息，
        houses[0] = new House(1,"jack","18712372282","苏州工业园区",1300,"已出租");
    }

    //list 方法返回houses

    public House[] list() {
        return houses;
    }

    //add的方法
    public boolean add(House newhouse){
        //判断是否可以继续添加(暂时不考虑数组扩容)
        if (HouseNum == houses.length){//不能再添加
            System.out.println("房屋信息已满，不能再添加");
            return false;
        }

        houses[HouseNum++] = newhouse;
        //HouseNum++;//新增房屋
        //需要设计id自增长的机制,
        //idCounter++;
        newhouse.setId(++idCounter);
        return true;
    }
    //del 方法 删除房屋信息
    public boolean del(int deId){
        //应该先找到删除的 房屋信息 对应的下标
        //下标和房屋编号不是一回事
        int index = -1;
        for (int i = 0; i < HouseNum; i++){
            if (deId == houses[i].getId()){
                index = i;//记录index
            }
        }
        if (index == -1){
            return false;
        }

        for (int i = index; i < HouseNum -1; i++){
            houses[i] = houses[i + 1];
        }
        houses[--HouseNum] = null;
        return true;
    }

    public House findById(int findId){

        //遍历
        for (int i = 0; i < HouseNum; i++){
            if (findId == houses[i].getId()){
                return houses[i];
            }
        }
        return null;
    }
}
