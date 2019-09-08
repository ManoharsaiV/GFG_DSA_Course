package com.matrices;

public class PrintMatrixInSnakePattern {
    static void print(int arr[][], int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    sb.append(String.valueOf(arr[i][j])).append(" ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    sb.append(String.valueOf(arr[i][j])).append(" ");
                }
            }
        }

        System.out.print(sb);

    }

}
