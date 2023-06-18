/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ThucHanh;

/**
 *
 * @author DELL
 */
import java.util.Scanner;
public class TH5_DemSoLuongSinhVien {
    public static void main(String[] args) {
        int size;
 int[] array;
 Scanner scanner = new Scanner(System.in);
 do {
     System.out.print("Enter a size:");
     size = scanner.nextInt();
     if (size > 30)
         System.out.println("Size should not exceed 30");
 } while (size > 30);
 array = new int[size];
 int i = 0;
 while (i < array.length) {
     System.out.print("Enter a mark for student " + (i + 1) + ": ");
     array[i] = scanner.nextInt();
     i++;
 }
 int count = 0;
System.out.print("List of mark: ");
 for (int j = 0; j < array.length; j++) {
     System.out.print(array[j] + "\t");
     if (array[j] >= 5 && array[j] <= 10)
         count++;
 }
 System.out.print("\n The number of students passing the exam is " + count);
    }
}
