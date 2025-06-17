package com.kirangs;

import java.util.Scanner;

/*
You are given an integer n.
You need to check if the number is a perfect number or not.
Return true if it is a perfect number, otherwise, return false.

A perfect number is a number whose proper divisors
add up to the number itself.
 */
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Is Perfect number : " + isPerfect(n));
        System.out.println("Is Perfect number : " + isPerfect_Optimal(n));
        scanner.close();
    }

    //Time : O(sqrt(n))
    private static boolean isPerfect_Optimal(int n) {
        int properDivisorsSum = 1;
        for (int i = 2; (i * i) <= n; i++) {
            if (n % i == 0) {
                properDivisorsSum += i;
                if (i != (n / i)) {
                    properDivisorsSum += (n / i);
                }
            }
        }
        return n == properDivisorsSum;
    }

    //Time : O(n), Space : O(1)
    private static boolean isPerfect(int n) {
        int properDivisorsSum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                properDivisorsSum += i;
            }
        }
        return n == properDivisorsSum;
    }
}
