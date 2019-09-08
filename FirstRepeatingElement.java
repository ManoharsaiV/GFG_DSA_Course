package com.hashing;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRepeatingElement {

    private static int firstIndexOfRepeatingElement(String line, int length) {
        String[] in = line.split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        Set<Integer> lhs = new LinkedHashSet<>();

        int index = Integer.MAX_VALUE;
        for (int i = 0; i < length; i++) {
            if (!lhs.contains(arr[i])) {
                lhs.add(arr[i]);
            } else {
                for (int j = 0; j < length; j++) {
                    if (arr[j] == arr[i] && j < index) {
                        index = j;
                        break;
                    }
                }
            }
        }
        if (index < Integer.MAX_VALUE) {
            return index + 1;
        }

        return -1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            int length = Integer.parseInt(scanner.nextLine());
            String line = scanner.nextLine();
            System.out.println(firstIndexOfRepeatingElement(line, length));
        }

        scanner.close();
    }
}
