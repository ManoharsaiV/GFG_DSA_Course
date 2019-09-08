package com.hashing;


import java.util.LinkedHashSet;
import java.util.Set;

public class PrintNonRepeatedElements {
    static void printNonRepeated(int arr[], int n) {
        Set<Integer> hashSet = new LinkedHashSet<>();
        Set<Integer> dummy = new LinkedHashSet<>();

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

        for (int i : dummy) {
            System.out.print(i + " ");
        }

    }
}
