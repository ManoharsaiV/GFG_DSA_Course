package com.hashing;

import java.util.ArrayList;
import java.util.Arrays;

public class SubArrayRangeWithAGivenSum {
    static int subArraySum(int arr[], int n, int sum) {
        System.out.println(Arrays.toString(arr));
        int count = 0;
        for (int i = 0; i < n; i++) {
            String s = "";
            int sumSoFar = arr[i];
            if (sumSoFar == sum) {
                count++;
            }
            for (int j = i + 1; j < n; j++) {
                sumSoFar += arr[j];
                if (sumSoFar == sum) {
                    count++;
                }
            }

        }

        return count;

    }

    public static void main(String[] args) {
        String s = "5 47 40 37 -19 41 -24 -47 17 2 -22 -9 32 -19 -2 -35 45 -34 -1 9 -26 49 -43 -3 10 9 -6 -6 -26 8 -38 29 -42 4 16 -11 -5 -6 44 15 46 -28 8 -20 -45 -44 -5 -50 25 -3 10 49 -4 -31 49 9 28 45 5 4 4 17 -17 12 -28 1 3 -31 45";
        String[] a = s.split(" ");
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        int sum = -3;

        System.out.println(subArraySum(arr, arr.length, sum));

    }
}


