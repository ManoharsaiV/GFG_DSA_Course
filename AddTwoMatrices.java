package com.matrices;

public class AddTwoMatrices {
    static void sumMatrix(int n1, int m1, int n2, int m2, int arr1[][], int arr2[][]) {
        StringBuilder sb = new StringBuilder();
        if (n1 != n2 && m1 != m2 || (n1 != n2 || m1 != m2)) {
            System.out.print("-1");
        } else {
            for (int i = 0; i < n1; i++) {
                for (int j = 0; j < m1; j++) {
                    arr1[i][j] += arr2[i][j];
                    sb.append(String.valueOf(arr1[i][j]));
                }
            }
            System.out.print(sb);

        }


    }
}
