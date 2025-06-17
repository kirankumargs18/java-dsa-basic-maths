package com.kirangs;

import java.util.Scanner;

public class LargestDigitInANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = largestDigit(n);
        System.out.println("Largest Digit : " + result);
        scanner.close();
    }

    //Time : O(noOfDigits) or O(logbase10(num)+1)
    //Space : O(1)
    private static int largestDigit(int n) {
        int largestDigit = 0;
        int temp = n;
        while (temp > 0) {
            int currDigit = temp % 10;
            if (currDigit > largestDigit) {
                largestDigit = currDigit;
            }
            temp = temp / 10;
        }
        return largestDigit;
    }
}
