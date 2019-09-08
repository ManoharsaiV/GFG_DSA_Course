package com.matrices;

import com.matrices.TransposeOfAMatrix;

import java.util.Scanner;

public class RotateBy90Degree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = Integer.parseInt(scanner.nextLine());
        String[] in = scanner.nextLine().split(" ");
        int[][] arr = new int[len][len];
        int k = 0;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                arr[i][j] = Integer.parseInt(in[k++]);
            }
        }

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        arr = transpose(arr, len);
        arr = reverseColumns(arr);


        System.out.println();
        System.out.println();
        System.out.println();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }


    public static int[][] transpose(int a[][], int n) {
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

        return dummy;

    }

    public static int[][] reverseColumns(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int temp = 0;

        int[][] result = new int[rows][cols];

        for (int row = rows - 1; row >= 0; row--) {
            for (int col = 0; col < cols; col++) {
                result[row][col] = matrix[temp][col];
            }
            temp++;
        }
        return result;
    }

    static void rotateby90(int a[][], int n) {
        int[][] result = transpose(a, n);
        int[][] rotatedMatrix = reverseColumns(result);
        a = rotatedMatrix;
    }
}
