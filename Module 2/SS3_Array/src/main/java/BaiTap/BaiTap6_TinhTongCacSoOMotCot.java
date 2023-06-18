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
public class BaiTap6_TinhTongCacSoOMotCot {
    public static void main(String[] args) {
        // Tạo một mảng hai chiều có sẵn các phần tử
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        // Hỏi người dùng muốn tính tổng của cột mấy
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the column number to sum: ");
        int column = scanner.nextInt();

        // Tính tổng của cột được chọn
        int sum = 0;
        for (int[] matrix1 : matrix) {
            sum += matrix1[column];
        }

        // In ra tổng của cột được chọn
        System.out.println("The sum of column " + column + " is: " + sum);
    }
}
