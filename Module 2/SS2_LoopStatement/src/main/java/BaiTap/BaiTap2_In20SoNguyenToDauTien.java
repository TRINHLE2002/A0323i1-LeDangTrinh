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
public class BaiTap2_In20SoNguyenToDauTien {
    
    public static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        for(int i = 2; i <= Math.sqrt(n); i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập số lượng các số nguyên tố cần in: ");
        int number = scanner.nextInt();
        int count = 0;
        int N = 2;
         while (count < number) {
            if (isPrime(N)) {
                System.out.print(N + " ");
                count++;
            }
            N++;
    }
}
}
