package com.kirangs;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("isPalindrome : " + isPalindrome(n));
        scanner.close();
    }

    //Time : O(noOfDigits) or O(logbase10(num)+1)
    //Space : O(1)
    private static boolean isPalindrome(int n) {
        int reverse = 0;
        int temp = n;
        while (temp > 0) {
            int digit = temp % 10;
            reverse = (reverse * 10) + digit;
            temp = temp / 10;
        }
        return n == reverse;
    }
}
