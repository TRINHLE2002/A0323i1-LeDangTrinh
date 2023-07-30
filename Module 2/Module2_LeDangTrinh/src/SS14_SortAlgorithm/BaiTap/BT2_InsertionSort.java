package SS14_SortAlgorithm.BaiTap;

import java.util.Arrays;

public class BT2_InsertionSort {
    public static void insertionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int key = list[i];
            int j = i - 1;
            if (j >= 0 && key < list[j]) {
                list[j + 1] = list[j];
                j--;
            }
            list[j + 1] = key;
            System.out.println("Chạy " + i + ": "+ Arrays.toString(list));
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 1, 0, 4, 3};
        System.out.println("Mảng ban đầu: " + Arrays.toString(arr));
        insertionSort(arr);
    }
}
