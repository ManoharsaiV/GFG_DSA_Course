package com.hashing;

import java.util.Arrays;

public class UnionOfTwoUnsortedArrays {
    private static int[] union(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        for (int i = 0; i < arr1.length; i++) {
            arr[i] = arr1[i];
        }
        for (int i = 0, j = arr.length; i < arr2.length && j < arr.length; i++, j++) {
            arr[j] = arr2[i];
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(union(arr1, arr2)));
    }

}
