package SS13_SearchingAlgorithm.BaiTap.Option_LongestSubstring;

import java.util.Arrays;
import java.util.Scanner;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào một chuỗi: ");
        String input = scanner.nextLine();

        String[] substrings = getSubstrings(input);
        Arrays.sort(substrings, (s1, s2) -> s2.length() - s1.length());

        System.out.println("Chuỗi con dài nhất: " + substrings[0]);
    }

    private static String[] getSubstrings(String input) {
        int n = input.length();
        int count = n * (n + 1) / 2;
        String[] substrings = new String[count];
        int index = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                substrings[index++] = input.substring(i, j);
            }
        }
        return substrings;
    }
}