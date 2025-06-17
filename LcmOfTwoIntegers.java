package com.kirangs;

import java.util.Scanner;

/*

You are given two integers n1 and n2.
You need find the Lowest Common Multiple (LCM) of the two given numbers.
Return the LCM of the two numbers.

The Lowest Common Multiple (LCM) of two integers is the lowest positive integer
that is divisible by both the integers.

 */
public class LcmOfTwoIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("LCM is " + LCM(n1, n2));
        System.out.println("LCM is " + LCM_1(n1, n2));
        System.out.println("LCM is " + LCM_2(n1, n2));
    }

    //Time : O(log(min(n1,n2))
    //space : O(1)
    private static int LCM_2(int n1, int n2) {
        return (n1 * n2) / GCD(n1, n2);
    }

    private static int GCD(int n1, int n2) {
        while (n1 != 0 && n2 != 0) {
            if (n1 > n2) {
                n1 = n1 % n2;
            } else {
                n2 = n2 % n1;
            }
        }
        if (n1 == 0) {
            return n2;
        }
        return n1;
    }

    //Time : O(n1*n2)
    //Space : O(1)
    private static int LCM_1(int n1, int n2) {
        int i = 1;
        int max = Math.max(n1, n2);
        int multiple = 1;
        do {
            multiple = i * max;
            if (multiple % n1 == 0 && multiple % n2 == 0) {
                return multiple;
            }
            i++;
        } while (true);
    }

    private static int LCM(int n1, int n2) {
        int i = Math.max(n1, n2);
        while (true) {
            if (i % n1 == 0 && i % n2 == 0) {
                return i;
            }
            i++;
        }
    }
}
