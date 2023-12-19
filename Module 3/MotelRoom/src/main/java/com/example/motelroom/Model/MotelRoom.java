package com.example.motelroom.Model;

import java.util.Date;

public class MotelRoom {
    private int id;
    private String name;
    private String phoneNumber;
    private String startDay;
    private PaymentMethod idPayments;
    private String note;

    public MotelRoom(int maPhongTro, String tenNguoiThue, String soDienThoai, Date ngayThue, PaymentMethod kieuThue, String ghiChu) {
    }

    public MotelRoom(int id, String name, String phoneNumber, String startDay, PaymentMethod idPayments, String note) {
        this.id = this.id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.startDay = startDay;
        this.idPayments = idPayments;
        this.note = note;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public PaymentMethod getIdPayments() {
        return idPayments;
    }

    public void setIdPayments(PaymentMethod idPayments) {
        this.idPayments = idPayments;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "MotelRoom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + phoneNumber + '\'' +
                ", startDay='" + startDay + '\'' +
                ", idPay=" + idPayments +
                ", note='" + note + '\'' +
                '}';
    }
}
