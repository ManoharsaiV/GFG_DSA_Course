package com.arrays;

import java.util.Arrays;

public class RearrangeArrayAlternatively {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rearrange(arr, 5);
        System.out.println(Arrays.toString(arr));


    }

    public static void rearrange(int arr[], int n) {
        int max_index = n - 1, min_index = 0;
        int max_element = arr[n - 1] + 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] += (arr[max_index] % max_element) * max_element;
                max_index--;
            } else {
                arr[i] += ((arr[min_index] % max_element)) * max_element;
                min_index++;
            }
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= max_element;
        }

        String s = "";
        for (int k = 0; k < n; k++) {
            s = s.concat(String.valueOf(arr[k])).concat(" ");
        }


    }
}
