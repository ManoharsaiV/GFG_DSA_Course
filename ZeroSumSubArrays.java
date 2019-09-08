package com.hashing;

import java.util.Scanner;

public class ZeroSumSubArrays {
    /**
     * First line of the input contains an integer T denoting the number of test cases. Each test case consists of two lines.
     * First line of each test case contains an Integer N denoting the size of the array,
     * and the second line contains N space separated integers.
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            System.out.println(countSuchArrays(line1,line2));
        }
        scanner.close();

    }

    private static int countSuchArrays(String line1, String line2) {
        int length = Integer.parseInt(line1);
        String[] dummy = line2.split(" ");
        int[] arr = new int[dummy.length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(dummy[i]);
        }
        int count = 0;
        for (int i = 0; i < length; i++) {
            int sumSoFar = arr[i];
            if (sumSoFar == 0) {
                count++;
            }
            for (int j = i + 1; j < length; j++) {
                sumSoFar += arr[j];
                if (sumSoFar == 0) {
                    count++;
                }
            }
        }

        return count;

    }

}
