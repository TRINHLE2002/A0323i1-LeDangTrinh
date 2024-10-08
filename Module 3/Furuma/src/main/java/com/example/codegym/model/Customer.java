package com.example.codegym.model;

import java.util.Date;

public class Customer {
    private int customer_id;
    private String customer_name;
    private Date customer_birthday;
    private Boolean customer_gender;
    private int customer_id_card;
    private int customer_phone;
    private String customer_email;
    private int customer_type_id;
    private String customer_address;

    public Customer() {
    }

    public Customer(int customer_id, String customer_name, Date customer_birthday, Boolean customer_gender, int customer_id_card, int customer_phone, String customer_email, int customer_type_id, String customer_address) {
        this.customer_id = customer_id;
        this.customer_name = customer_name;
        this.customer_birthday = customer_birthday;
        this.customer_gender = customer_gender;
        this.customer_id_card = customer_id_card;
        this.customer_phone = customer_phone;
        this.customer_email = customer_email;
        this.customer_type_id = customer_type_id;
        this.customer_address = customer_address;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public Date getCustomer_birthday() {
        return customer_birthday;
    }

    public void setCustomer_birthday(Date customer_birthday) {
        this.customer_birthday = customer_birthday;
    }

    public Boolean getCustomer_gender() {
        return customer_gender;
    }

    public void setCustomer_gender(Boolean customer_gender) {
        this.customer_gender = customer_gender;
    }

    public int getCustomer_id_card() {
        return customer_id_card;
    }

    public void setCustomer_id_card(int customer_id_card) {
        this.customer_id_card = customer_id_card;
    }

    public int getCustomer_phone() {
        return customer_phone;
    }

    public void setCustomer_phone(int customer_phone) {
        this.customer_phone = customer_phone;
    }

    public String getCustomer_email() {
        return customer_email;
    }

    public void setCustomer_email(String customer_email) {
        this.customer_email = customer_email;
    }

    public int getCustomer_type_id() {
        return customer_type_id;
    }

    public void setCustomer_type_id(int customer_type_id) {
        this.customer_type_id = customer_type_id;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customer_id=" + customer_id +
                ", customer_name='" + customer_name + '\'' +
                ", customer_birthday=" + customer_birthday +
                ", customer_gender=" + customer_gender +
                ", customer_id_card=" + customer_id_card +
                ", customer_phone=" + customer_phone +
                ", customer_email='" + customer_email + '\'' +
                ", customer_type_id=" + customer_type_id +
                ", customer_address='" + customer_address + '\'' +
                '}';
    }
}

