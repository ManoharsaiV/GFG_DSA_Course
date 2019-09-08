package com.arrays;

public class FindTheRowWithMaximumNumberOfOnes {
    private static int rowWithMaxOnes(int[][] arr) {
        int maxCount = 0, index = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 1) {
                    count++;
                }
            }
            if (count > maxCount) {
                index = i;
                maxCount = count;
            }
        }

        return index;
    }

    public static void main(String[] args) {
        int mat[][] = {{0, 0, 0, 1, 0, 0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}};
        System.out.println("Index of row with maxi 1s is "
                + rowWithMaxOnes(mat));
    }

}
