package com.hashing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class HashingForPair1 {
    public static int sumExists(int arr[], int sizeOfArray, int sum) {
        Set<Integer> lhs1 = new LinkedHashSet<>();
        Set<Integer> lhs2 = new LinkedHashSet<>();
        for (int i = 0; i < sizeOfArray; i++) {
            lhs1.add(arr[i]);
        }

        for (int i = 0; i < sizeOfArray; i++) {
            lhs2.add(arr[i]);
        }

        for (Integer i : lhs1) {
            lhs2.remove(i);
            if(lhs2.contains(sum - i)){
                return 1;
            }
        }


        return 0;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = Integer.parseInt(scanner.nextLine());
        String[] line = scanner.nextLine().split(" ");
        int sum = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(line[i]);
        }

        System.out.println(sumExists(arr, length, sum));
        scanner.close();
    }
}
