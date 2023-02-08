package com.example.userManagemantSystem.model;

public class userManagementSystem {
    private int userId;
    private String name;
    private String userName;
    private String adress;
    private String phone;

    public userManagementSystem(int userId, String name, String userName, String adress, String phone) {
        this.userId = userId;
        this.name = name;
        this.userName = userName;
        this.adress = adress;
        this.phone = phone;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "userManagementSystem{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", userName='" + userName + '\'' +
                ", adress='" + adress + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
