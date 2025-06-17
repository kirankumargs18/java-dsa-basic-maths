package com.kirangs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Input: n = 6
//
//Output = [1, 2, 3, 6]
//
//Explanation: The divisors of 6 are 1, 2, 3, 6.
public class DivisorsOfANumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] divisors = divisors(n);
        for (int divisor : divisors) {
            System.out.print(divisor + " ");
        }
        scanner.close();

    }

    //Time : O(sqrt(n) + dlogd)
    //Space : O(d)  d - number of divisors
    private static int[] divisors(int n) {
        List<Integer> divisorsList = new ArrayList<>();
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisorsList.add(i);
                if (i != (n / i)) {
                    divisorsList.add(n / i);
                }
            }
        }
        return divisorsList.stream()
                .mapToInt(Integer::intValue)
                .sorted()
                .toArray();
    }
}
