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
public class BaiTap4_TimPhanTuLonNhatTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập kích thước của ma trận
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        // Tạo ma trận và nhập giá trị cho các phần tử
        double[][] matrix = new double[rows][columns];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        // Tìm phần tử lớn nhất
        double max = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        // In ra phần tử lớn nhất và tọa độ của nó
        System.out.println("The maximum element is " + max + " at position (" + maxRow + ", " + maxColumn + ")");
    }
}
