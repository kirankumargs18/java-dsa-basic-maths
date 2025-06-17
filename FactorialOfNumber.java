package com.kirangs;

import java.util.Scanner;

public class FactorialOfNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = factorial(n);
        System.out.println("Factorial : " + result);
        scanner.close();
    }

    //Time : O(n)
    //Space : O(1)
    private static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }
}
