package com.hashing;

import java.util.Arrays;
import java.util.Scanner;

public class LinearProbingInHashing {
    static void linearProbing(int hash_table[], int hash_size, int arr[], int array_size) {
        for (int i = 0; i < array_size; i++) {
            int index = arr[i] % hash_size;
            if (hash_table[index] == -1) {
                hash_table[index] = arr[i];
            } else {
                int j = 1;
                while (j < hash_size) {
                    int new_index = index;
                    new_index = (new_index + j) % hash_size;
                    if (hash_table[new_index] == -1) {
                        hash_table[new_index] = arr[i];
                        break;
                    } else {
                        j++;
                    }
                }
            }
        }
        //System.out.println(Arrays.toString(hash_table));

    }

    public static void main(String[] args) {
        int hash_size = 21;
        int[] hash_table = new int[hash_size];
        Arrays.fill(hash_table,-1);
        int[] arr = new int[7];
        Scanner scanner = new Scanner(System.in);
        String[] in = scanner.nextLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        linearProbing(hash_table, hash_size, arr, arr.length);
    }
}
