package com.hashing;

import java.util.HashSet;
import java.util.Set;

public class CountNonRepeatedElementsInAnArray {
    static long countNonRepeated(int arr[], int n) {
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> dummy = new HashSet<>();
        for (int i = 0; i < n; i++) {
            if (!dummy.contains(arr[i])) {
                dummy.add(arr[i]);
            }
        }

        for (int i = 0; i < n; i++) {
            if (!hashSet.contains(arr[i])) {
                hashSet.add(arr[i]);
            } else {
                dummy.remove(arr[i]);
            }
        }


        return dummy.size();


    }
}
