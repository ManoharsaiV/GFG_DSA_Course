package com.hashing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class CheckIfTwoArraysAreEqualOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();
            System.out.println(checkIfEqual(line1, line2, line3));
        }
        scanner.close();
    }

    private static int checkIfEqual(String line1, String line2, String line3) {
        int sizeOfArray = Integer.parseInt(line1);
        String[] in2 = line2.split(" ");
        long[] array1 = new long[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array1[i] = Long.parseLong(in2[i]);
        }
        String[] in3 = line3.split(" ");
        long[] array2 = new long[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array2[i] = Long.parseLong(in3[i]);
        }
        Set<Long> set1 = new LinkedHashSet<>();
        Set<Long> set2 = new LinkedHashSet<>();

        for (int i = 0; i < sizeOfArray; i++) {
            set1.add(array1[i]);
        }

        for (int i = 0; i < sizeOfArray; i++) {
            set2.add(array2[i]);
        }

        if (set1.equals(set2)) {
            return 1;
        }

        return 0;


    }
}
