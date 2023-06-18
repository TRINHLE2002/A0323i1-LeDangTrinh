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
public class BaiTap8_DemKyTuTrongChuoi {
     public static void main(String[] args) {
        // Khai báo một chuỗi và gán giá trị
        String str = "hello world";

        // Khai báo một biến ký tự và gán giá trị "o"
        char ch = 'o';

        // Khai báo biến count và gán giá trị 0
        int count = 0;

        // Duyệt qua từng ký tự trong chuỗi
        for (int i = 0; i < str.length(); i++) {
            // So sánh ký tự trong chuỗi với ký tự được nhập vào
            if (str.charAt(i) == ch) {
                // Nếu trùng thì tăng biến đếm lên 1
                count++;
            }
        }

        // In ra số lần xuất hiện của ký tự trong chuỗi
        System.out.println("The character '" + ch + "' appears " + count + " times in the string.");
    }
}
