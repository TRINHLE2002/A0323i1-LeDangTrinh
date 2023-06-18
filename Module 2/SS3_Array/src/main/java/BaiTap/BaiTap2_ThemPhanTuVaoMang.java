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
public class BaiTap2_ThemPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Khai báo và khởi tạo mảng
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = arr.length;

        // Nhập phần tử cần chèn và vị trí cần chèn
        System.out.print("Enter element to insert: ");
        int x = scanner.nextInt();
        System.out.print("Enter index to insert: ");
        int index = scanner.nextInt();

        // Kiểm tra vị trí cần chèn có hợp lệ hay không
        if (index < 0 || index > n) {
            System.out.println("Cannot insert element!");
        } else {
            // Tạo mảng mới để lưu các phần tử của mảng ban đầu cùng với phần tử mới được chèn vào
            int[] newArr = new int[n + 1];
            int i = 0;
            for (int num : arr) {
                if (i == index) {
                    newArr[i] = x;
                    i++;
                }
                newArr[i] = num;
                i++;
            }
            if (i == index) {
                newArr[i] = x;
            }

            // In ra mảng sau khi chèn phần tử mới
            System.out.print("New array: ");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        }
    }
}
