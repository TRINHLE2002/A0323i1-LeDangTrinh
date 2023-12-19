package com.example.motelroom.Model;

public class PaymentMethod {
    private int idPay;
    private String namePay;

    public PaymentMethod() {
    }

    public PaymentMethod(int idPay, String namePay) {
        this.idPay = idPay;
        this.namePay = namePay;
    }

    public int getIdPay() {
        return idPay;
    }

    public void setIdPay(int idPay) {
        this.idPay = idPay;
    }

    public String getNamePay() {
        return namePay;
    }

    public void setNamePay(String namePay) {
        this.namePay = namePay;
    }

    @Override
    public String toString() {
        return "PaymentMethod{" +
                "idPay=" + idPay +
                ", namePay='" + namePay + '\'' +
                '}';
    }
}
