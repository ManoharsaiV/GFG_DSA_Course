package com.bitmagic;

public class MaximunAndValue {
    // naive
    public static int maxAND(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((arr[i] & arr[j]) > max) {
                    max = (arr[i] & arr[j]);
                }
            }
        }

        return max;

    }


}
