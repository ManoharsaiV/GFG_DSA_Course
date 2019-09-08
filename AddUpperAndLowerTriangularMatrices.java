package com.matrices;



public class AddUpperAndLowerTriangularMatrices {
    static void sumMatrix(int mat[][], int n) {
        int lower = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                lower += mat[i][j];
            }
        }
        int upper = 0;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                upper += mat[i][j];
            }

        }


        System.out.println(upper);
        System.out.println(lower);
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(upper)).append(" ").append(String.valueOf(lower));
        System.out.print(sb);
    }

    public static void main(String[] args) {
        int[][] arr = {{6, 5, 4}, {1, 2, 5}, {7, 9, 7}};
        sumMatrix(arr, 3);

    }
}
