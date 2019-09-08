package com.hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWith0Sum {
    static boolean findsum1(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            int sumSoFar = arr[i];
            if (sumSoFar == 0) {
                return true;
            }
            for (int j = i + 1; j < n; j++) {
                sumSoFar += arr[j];
                if (sumSoFar == 0) {
                    return true;
                }
            }
        }

        return false;

    }

    static boolean findsum(int arr[], int n) {


        return false;
    }
}



