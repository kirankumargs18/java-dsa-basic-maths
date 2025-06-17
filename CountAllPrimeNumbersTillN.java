package com.kirangs;

import java.util.Scanner;

public class CountAllPrimeNumbersTillN {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Number of Prime Numbers : " + primeUptoN(n));
    }
    //Time : O(n*sqrt(n))
    //Space : O(1)
    private static int primeUptoN(int n) {
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                count = count + 1;
            }
        }
        return count;
    }

    //Time : O(sqrt(n))
    //Space : O(1)
    private static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
