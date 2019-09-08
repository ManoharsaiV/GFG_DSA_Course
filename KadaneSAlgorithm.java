package com.arrays;

import java.util.Arrays;

public class KadaneSAlgorithm {
    int maxSubarraySum(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                count++;
            }
        }
        if (count == n) {
            Arrays.sort(arr);
            return arr[n - 1];
        }

        int maxTillNow = 0, maxEndingHere = 0;
        for (int i = 0; i < n; i++) {
            maxEndingHere = maxEndingHere + arr[i];
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
            if (maxTillNow < maxEndingHere) {
                maxTillNow = maxEndingHere;
            }
        }


        return maxTillNow;


    }

}
