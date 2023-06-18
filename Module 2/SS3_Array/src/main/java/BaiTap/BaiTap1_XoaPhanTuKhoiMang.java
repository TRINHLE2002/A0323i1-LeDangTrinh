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
public class BaiTap1_XoaPhanTuKhoiMang {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo và khởi tạo mảng
        int[] arr = {10, 4, 6, 7, 8, 6, 0, 0, 0, 0};
        int n = arr.length;

        // Nhập phần tử cần xoá
        System.out.print("Enter element to delete: ");
        int x = scanner.nextInt();

        // Tìm vị trí của phần tử cần xoá
        int index_del = -1; // Khởi tạo giá trị ban đầu của biến index_del
        for (int i = 0; i < n; i++) {
            if (arr[i] == x) {
                index_del = i;
                break;
            }
        }

        // Nếu không tìm thấy phần tử cần xoá
        if (index_del == -1) {
            System.out.println("Element not found!");
        } else {
            // Xoá phần tử cần xoá khỏi mảng
            for (int i = index_del; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--; // Giảm số lượng phần tử trong mảng đi 1

            // In ra mảng sau khi xoá
            System.out.print("New array: ");
            for (int num : arr) {
                if (num != arr[n]) {
                    System.out.print(num + " ");
                }
            }
        }
    }
 }
