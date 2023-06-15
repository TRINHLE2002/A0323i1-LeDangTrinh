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
public class Bai2_UngDungDocSoThanhChu {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a non-negative integer up to 3 digits: ");
        int number = input.nextInt();

        if (number < 0 || number > 999) {
            System.out.println("Out of ability");
            return;
        }

        String result = "";

        int ones = number % 10;
        int tens = (number / 10) % 10;
        int hundreds = number / 100;

        if (hundreds > 0) {
            result += onesPlaceToString(hundreds) + " hundred";
            if (tens > 0 || ones > 0) {
                result += " and ";
            }
        }

        if (tens == 1) {
            result += tenToNineteenToString(ones);
        } else {
            result += tensPlaceToString(tens);
            if (tens > 0 && ones > 0) {
                result += " ";
            }
            result += onesPlaceToString(ones);
        }

        System.out.println(result);
    }

    public static String onesPlaceToString(int n) {
        switch (n) {
            case 0:
                return "zero";
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "";
        }
    }

    public static String tenToNineteenToString(int n) {
        switch (n) {
            case 0:
                return "ten";
            case 1:
                return "eleven";
            case 2:
                return "twelve";
            case 3:
                return "thirteen";
            case 4:
                return "fourteen";
            case 5:
                return "fifteen";
            case 6:
                return "sixteen";
            case 7:
                return "seventeen";
            case 8:
                return "eighteen";
            case 9:
                return "nineteen";
            default:
                return "";
        }
    }

    public static String tensPlaceToString(int n) {
        switch (n) {
            case 2:
                return "twenty";
            case 3:
                return "thirty";
            case 4:
                return "forty";
            case 5:
                return "fifty";
            case 6:
                return "sixty";
            case 7:
                return "seventy";
            case 8:
                return "eighty";
            case 9:
                return "ninety";
            default:
                return "";
        }
    }
}
