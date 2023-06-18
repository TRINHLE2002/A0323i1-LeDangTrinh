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
public class BaiTap3_InCacSNTNhoHon100 {
    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n);i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số lượng cần in số nguyên tố nhỏ hơn: ");
        int n = scanner.nextInt();
        for(int i = 2; i < n;i++){
            if(isPrime(i)){
            System.out.println(i);
        }
        }
    }
}
