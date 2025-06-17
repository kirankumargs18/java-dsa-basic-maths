package com.kirangs;

import java.util.Scanner;

public class CountAllDigitsInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countDigit(n);
        System.out.println("Number of Digits : " + result);
        scanner.close();
    }

    //Time : O(noOfDigits) or O(logbase10(num)+1)
    //Space : O(1)
    private static int countDigit(int n) {
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
