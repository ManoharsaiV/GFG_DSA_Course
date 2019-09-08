package com.arrays;

import java.util.Arrays;

public class ArrayInsertAtIndex {
    public void insertAtIndex(int arr[], int sizeOfArray, int index, int element) {
        if (index == sizeOfArray - 1) {
            arr[index] = element;
        } else {
            int[] aux = new int[sizeOfArray];
            for (int i = index + 1; i < sizeOfArray; i++) {
                aux[i] = arr[i - 1];
            }
            arr[index] = element;
            for (int i = index + 1; i < sizeOfArray; i++) {
                arr[i] = aux[i];
            }

        }


    }

    public static void main(String[] args) {

    }


}
