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
public class TH2_InterestCalculator {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for(int i = 0; i < month; i++){
        totalInterest += money * (interestRate/100)/12 * month;
        System.out.println("Total of interest: " + totalInterest);
}
    }
}
