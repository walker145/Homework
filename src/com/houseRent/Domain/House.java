package com.houseRent.Domain;

/**
 * @version 1.0
 * @Authoy 王军
 * House的对象表示一个房屋信息
 */
public class House {
    //
    private int id;
    private String name;
    private String phone;
    private String address;
    private double rent;
    private String statar;

    public House(int id, String name, String phone, String address, double rent, String statar) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.rent = rent;
        this.statar = statar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }

    public String getStatar() {
        return statar;
    }

    public void setStatar(String statar) {
        this.statar = statar;
    }

    //为了方便的输出对象信息，实现toString方法
    @Override
    public String toString() {
        return id +
                "\t" + name  +
                "\t" + phone +
                "\t" + address +
                "\t" + rent +
                "\t" + statar;
    }
}
