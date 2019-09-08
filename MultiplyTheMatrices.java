package com.matrices;

public class MultiplyTheMatrices {
    static void multiplyMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][]) {
        if (m1 != n2) {
            System.out.print("-1");
        } else {
            int[][] res = new int[n1][m2];
            for (int i = 0; i < n1; i++) {
                int j = 0, k = 0;
                for (; j < m2; j++) {
                    for (; k < m1; k++) {
                        res[i][j] += (arr1[i][k] * arr2[k][j]);
                    }
                }
            }

            for (int i = 0; i < res.length; i++) {
                for (int j = 0; j < res[i].length; j++) {
                    System.out.print(res[i][j] + " ");
                }
            }
        }

    }
}
