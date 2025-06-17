package com.kirangs;

import java.util.Scanner;

/*

You are given two integers n1 and n2.
You need find the Greatest Common Divisor (GCD) of the two given numbers.
Return the GCD of the two numbers.

The Greatest Common Divisor (GCD) of two integers is the largest positive integer that divides both of the integers.

 */
public class GcdOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.println("GCD : " + GCD(n1, n2));
        System.out.println("GCD : " + GCD_1(n1, n2));
        System.out.println("GCD : " + GCD_2(n1, n2));
        System.out.println("GCD : " + GCD_3(n1, n2));
    }

    //Time : O(log(min(n1,n2))
    //space : O(1)
    private static int GCD_3(int n1, int n2) {
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

    //Euclidean Algorithm
    //GCD(a,b) = GCD(a-b,b) a> b, if a=0 and b is the gcd
    private static int GCD_1(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        int min = Math.min(n1, n2);
        return GCD_1(Math.max(n1, n2) - min, min);
    }

    private static int GCD_2(int n1, int n2) {
        if (n1 == 0) {
            return n2;
        }
        int min = Math.min(n1, n2);
        return GCD_1(Math.max(n1, n2) % min, min);
    }



    //Time : O(min(n1,n2))
    //Space : O(1)
    private static int GCD(int n1, int n2) {
        int gcd = 1;
        for (int i = Math.min(n1, n2); i >= 2; i--) {
            if (n1 % i == 0 && n2 % i == 0) {
                return i;
            }
        }
        return gcd;
    }
}
