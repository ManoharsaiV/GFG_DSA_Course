package com.hashing;

import java.util.Arrays;

import java.util.Scanner;

public class SubArraysWithEqual1Sand0S {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            System.out.println(countSuchArrays(line1, line2));
        }
        scanner.close();


    }


    /**
     * takes an array
     *
     * @param arr
     * @return true if the array has equal number of 1's and 0's, false if the arrays has unequal number of 0's and 1's
     */
    private static boolean check(int[] arr) {
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count1++;
            } else {
                count0++;
            }
        }

        if (count0 == count1) {
            return true;
        }

        return false;
    }


    private static int countSuchArrays(String line1, String line2) {
        int count = 0;
        int length = Integer.parseInt(line1);
        String[] dummy = line2.split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(dummy[i]);
        }
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (check(Arrays.copyOfRange(arr, i, j + 1))) {
                    count++;
                }
            }
        }


        return count;
    }


}


