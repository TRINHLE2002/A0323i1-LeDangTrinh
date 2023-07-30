package SS14_SortAlgorithm.BaiTap;

import java.util.Arrays;

public class BT1_InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7, 5, 2, 4, 3, 9};

        System.out.println("Mảng chưa sắp xếp: " + Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            System.out.println("Bước " + i + ": " + Arrays.toString(arr));
        }

        System.out.println("Mảng đã sắp xếp: " + Arrays.toString(arr));
    }
}
