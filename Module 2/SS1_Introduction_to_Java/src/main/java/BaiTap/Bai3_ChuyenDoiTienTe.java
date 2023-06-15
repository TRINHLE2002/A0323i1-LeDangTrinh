/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BaiTap;

/**
 *
 * @author DELL
 */
import java.util.Scanner;

public class Bai3_ChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
     Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số tiền USD: ");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.println("Giá trị VND: " + quydoi);
     
    }
}
