package com.rcoolone.onlineshopping.db.po;

public class OnlineShoppingUser {
    private Integer userId;

    private String name;

    private String email;

    private String address;

    private String phone;

    private byte[] userType;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public byte[] getUserType() {
        return userType;
    }

    public void setUserType(byte[] userType) {
        this.userType = userType;
    }
}