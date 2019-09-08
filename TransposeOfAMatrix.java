package com.matrices;

import java.util.Arrays;

public class TransposeOfAMatrix {
    // using extra space O(n * m)
   public static void transpose(int a[][], int n) {
        int[][] dummy = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                dummy[i][j] = a[j][i];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = dummy[i][j];
            }
        }

    }

    // with constant extra space but didn't work
    private static void transposeOfMat(int[][] arr, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            //System.out.println();
        }
    }
}
