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
public class BaiTap3_GopMang {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tạo hai mảng với kích thước cho trước
        int[] arr1 = new int[5];
        int[] arr2 = new int[4];

        // Nhập giá trị cho các phần tử trong mảng 1
        System.out.println("Enter elements for array 1:");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scanner.nextInt();
        }

        // Nhập giá trị cho các phần tử trong mảng 2
        System.out.println("Enter elements for array 2:");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scanner.nextInt();
        }

        // Tạo mảng thứ 3 với kích thước bằng tổng kích thước của hai mảng trước đó
        int[] arr3 = new int[arr1.length + arr2.length];

        // Gán các phần tử của mảng 1 vào mảng 3
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }

        // Gán các phần tử của mảng 2 vào mảng 3
        for (int i = 0; i < arr2.length; i++) {
            arr3[arr1.length + i] = arr2[i];
        }

        // In ra mảng 3 sau khi gộp
        System.out.println("Array 3 after merging:");
        for (int num : arr3) {
            System.out.print(num + " ");
        }
    }
}
