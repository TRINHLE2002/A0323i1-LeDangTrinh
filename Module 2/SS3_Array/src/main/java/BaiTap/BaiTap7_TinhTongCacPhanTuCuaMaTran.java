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
public class BaiTap7_TinhTongCacPhanTuCuaMaTran {
     public static void main(String[] args) {
        // Tạo một ma trận vuông có sẵn các phần tử
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Tính tổng các phần tử trên đường chéo chính
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }

        // In ra tổng các phần tử trên đường chéo chính
        System.out.println("The sum of the diagonal elements is: " + sum);
    }
}
