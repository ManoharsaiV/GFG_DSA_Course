package com.arrays;

import java.util.Arrays;

public class RearrangeAnArrayWithOutExtrasSpace {
    public static void main(String[] args) {
        long[] arr = {4, 0, 2, 1, 3};
        int n = arr.length;
        arrange(arr, n);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arrange(arr, n)));
    }

    static long[] arrange(long arr[], int n) {
        /**    long[] res = new long[n];
         for (long i = 0; i < n; i++) {
         res[(int) i] = arr[(int) arr[(int) i]];
         }

         return res; */

        Arrays.sort(arr);
        int max_Element = (int) (arr[n - 1] + 1);
        for (int i = 0; i < n; i++) {
            arr[i] = arr[(int) arr[i]] + arr[i];
        }

        for (int i = 0; i < n; i++) {

        }

        return arr;


    }
}
