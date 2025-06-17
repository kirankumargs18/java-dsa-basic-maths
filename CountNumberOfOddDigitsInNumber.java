package com.kirangs;

import java.util.Scanner;

public class CountNumberOfOddDigitsInNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = countOddDigit(n);
        System.out.println("Number of odd Digits : " + result);
        scanner.close();
    }

    //Time : O(noOfDigits) or O(logbase10(num)+1)
    //Space : O(1)
    private static int countOddDigit(int n) {
        int totalOddDigits = 0;
        int temp = n;
        while (temp > 0) {
            int currDigit = temp % 10;
            if (currDigit % 2 != 0) {
                totalOddDigits += 1;
            }
            temp = temp / 10;
        }
        return totalOddDigits;
    }
}
