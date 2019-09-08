package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given an array A[] of N positive integers. The task is to find the maximum of j - i subjected to the constraint of A[i] <= A[j].
 */

public class MaximumIndex {
    static int maxIndexDiff(int arr[], int n) {
        int result = 0;
        List<Integer> aList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int max = 0, temp = 0;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    temp = j - i;
                }
                if (temp > max) {
                    max = temp;
                }
            }
            if (max > result) {
                result = max;
                aList.add(result);
            }
        }

        Collections.sort(aList);

        if (aList.size() == 0) {
            return 0;
        }

        return aList.get(aList.size() - 1);
    }
}
