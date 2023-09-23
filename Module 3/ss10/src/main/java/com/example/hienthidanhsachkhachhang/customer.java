package com.example.hienthidanhsachkhachhang;

public class customer {
    private String name;
    private String dob;
    private String address;
    private String image;

    public customer(String name, String dob, String address, String image) {
        this.name = name;
        this.dob = dob;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
