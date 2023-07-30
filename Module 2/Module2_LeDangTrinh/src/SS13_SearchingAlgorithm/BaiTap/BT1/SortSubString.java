package SS13_SearchingAlgorithm.BaiTap.BT1;

import java.util.Arrays;
import java.util.Scanner;

public class SortSubString {
    public static String getSubString(String s) {
        String subString = "";
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || s.charAt(i) != s.charAt(i - 1)) {
                subString += s.charAt(i);
            }
        }
            return subString;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập chuỗi cần sắp xếp: ");
        String inputstring = sc.nextLine();
        char[] charArray = inputstring.toCharArray();
        Arrays.sort(charArray);
        String sortedString = new String(charArray);
        System.out.println("Chuỗi sắp xếp theo thứ tự tăng dần là: ");
        System.out.println(getSubString(sortedString));
    }
}
