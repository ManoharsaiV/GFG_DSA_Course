package com.hashing;

import java.util.*;

public class PositiveNegativePair {

    /**
     * First line of input contains number of testcases T.
     * For each testcase, first line contains an integer N, number of elements in the array.
     * Next line contains N space separated array elements.
     */


    private static StringBuilder checkForSuchPairs(String line1, String line2) {
        int length = Integer.parseInt(line1);
        String[] dummy = line2.split(" ");
        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            arr[i] = Integer.parseInt(dummy[i]);
        }

        Set<Integer> posSet = new TreeSet<>();
        Set<Integer> negSet = new TreeSet<>();

        for (int i = 0; i < length; i++) {
            if (arr[i] > 0) {
                posSet.add(arr[i]);
            } else {
                negSet.add(arr[i]);
            }
        }
        StringBuilder sb = new StringBuilder();

        if (posSet.size() == 0 || negSet.size() == 0) {
            sb = new StringBuilder(String.valueOf(0));
            return sb;

        }


        Set<Integer> modifiedSet = new LinkedHashSet<>();

        for (Integer i : posSet) {
            modifiedSet.add(i);
        }

        for (Integer i :
                negSet) {
            modifiedSet.add(i);

        }

        Set<Integer> dummySet = new TreeSet<>();
        for (int i = 0; i < length; i++) {
            dummySet.add(arr[i]);
        }

        for (Integer i : modifiedSet) {
            if (i != 0 && dummySet.contains(-i)) {
                sb.append(String.valueOf(i)).append(" ").append(String.valueOf(-i)).append(" ");
                dummySet.remove(i);
                dummySet.remove(-i);
            }
        }

        if (sb.length() == 0) {
            sb = new StringBuilder(String.valueOf(0));
            return sb;
        }


        return sb;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            System.out.println(checkForSuchPairs(line1, line2));
        }
        scanner.close();

    }
}
