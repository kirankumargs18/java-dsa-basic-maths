package com.kirangs;

import java.util.Scanner;

/*

You are given an integer n. You need to check whether it is an armstrong number or not.
Return true if it is an armstrong number, otherwise return false.

An armstrong number is a number which is equal to the sum of the digits of the number,
raised to the power of the number of digits.
 */
public class CheckIfNumberIsArmStrong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Is Armstrong number : " + isArmstrong(n));
        scanner.close();
    }

    //Time : O(logN), Space : O(1)
    private static boolean isArmstrong(int n) {
        double sum = 0;
        int noOfDigits = getNumberOfDigits(n);
        int temp = n;
        while (temp > 0) {
            int currDigit = temp % 10;
            sum = sum + Math.pow(currDigit, noOfDigits);
            temp = temp / 10;
        }
        return n == sum;
    }

    private static int getNumberOfDigits(int n) {
        if (n == 0) {
            return 1;
        }
        int totalDigits = 0;
        int temp = n;
        while (temp > 0) {
            totalDigits += 1;
            temp = temp / 10;
        }
        return totalDigits;
    }
}
