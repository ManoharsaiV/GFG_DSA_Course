package com.hashing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class UnionOfTwoArrays {

    private static int union(String line1, String line2, String line3) {
        String[] in1 = line1.split(" ");
        int sizeOfArray1 = Integer.parseInt(in1[0]);
        int sizeOfArray2 = Integer.parseInt(in1[1]);
        String[] in2 = line2.split(" ");
        int[] array1 = new int[sizeOfArray1];
        for (int i = 0; i < sizeOfArray1; i++) {
            array1[i] = Integer.parseInt(in2[i]);
        }
        String[] in3 = line3.split(" ");
        int[] array2 = new int[sizeOfArray2];
        for (int i = 0; i < sizeOfArray2; i++) {
            array2[i] = Integer.parseInt(in3[i]);
        }
        Set<Integer> set1 = new LinkedHashSet<>();
        for (int i = 0; i < sizeOfArray1; i++) {
            if (!set1.contains(array1[i])) {
                set1.add(array1[i]);
            }
        }
        for (int i = 0; i < sizeOfArray2; i++) {
            if (!set1.contains(array2[i])) {
                set1.add(array2[i]);
            }
        }


        return set1.size();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
            while (testCases-- > 0) {
                String line1 = scanner.nextLine();
                String line2 = scanner.nextLine();
            String line3 = scanner.nextLine();
            System.out.println(union(line1, line2, line3));
        }
        scanner.close();
    }


}
