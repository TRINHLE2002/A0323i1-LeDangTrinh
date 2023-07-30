package SS13_SearchingAlgorithm.BaiTap.OpTion_FIndAnyNumber;

import SS13_SearchingAlgorithm.ThucHanh.BinarySearch;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class FindAnyNumber {
    public static int binarySeach(int[] arr, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value) {
                return middle;
            } else if (value > arr[middle]) {
                left = middle + 1;
            }
            else {
            right = middle - 1;
        }
    }
      return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài của mảng ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Nhập phần tử của mảng ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));
        System.out.println("Nhập giá trị cần tìm: ");
        int value = sc.nextInt();
        int index = binarySeach(arr, 0, n - 1, value);
        if (index == -1) {
            System.out.println("Không tìm thấy giá trị " + value + " trong mảng.");
        } else {
            System.out.println("Giá trị " + value + " được tìm thấy tại vị trí " + index + " trong mảng.");
        }
    }
}
