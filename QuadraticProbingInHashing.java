package com.hashing;

public class QuadraticProbingInHashing {
    static void quadraticProbing(int hash_table[], int hash_size, int arr[], int array_size) {
        for (int i = 0; i < array_size; i++) {
            int index = arr[i] % hash_size;
            if (hash_table[index] == -1) {
                hash_table[index] = arr[i];
            } else {
                int j = 1;
                while (j < hash_size) {
                    int new_index = (int) ((index + Math.pow(j, 2)) % hash_size);
                    if (hash_table[new_index] == -1) {
                        hash_table[new_index] = arr[i];
                        break;
                    } else {
                        j++;
                    }
                }
            }

        }

    }
}
