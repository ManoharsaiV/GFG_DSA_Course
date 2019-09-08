package com.hashing;

import java.util.ArrayList;

public class SeperateChainingInHashing {

    public static void separateChaining(int arr[], int n, ArrayList<ArrayList<Integer>> hashTable, int hashSize) {

        for (int i = 0; i < n; i++) {
            int index = arr[i] % hashSize;
            if (hashTable.get(index).isEmpty()) {
                ArrayList<Integer> aList = new ArrayList<>();
                hashTable.set(index, aList);
                aList.add(arr[i]);
            } else {
                ArrayList<Integer> aL = hashTable.get(index);
                aL.add(arr[i]);
            }
        }

    }
}
