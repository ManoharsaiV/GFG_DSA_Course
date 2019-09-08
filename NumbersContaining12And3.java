package com.hashing;

import java.util.*;

public class NumbersContaining12And3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = Integer.parseInt(scanner.nextLine());
        while (testCases-- > 0) {
            String line1 = scanner.nextLine();
            String line2 = scanner.nextLine();
            numbersFormedFromGivenSet(line1, line2);
        }
        scanner.close();
    }

    private static void numbersFormedFromGivenSet(String line1, String line2) {
        int sizeOfArray = Integer.parseInt(line1);
        String[] in2 = line2.split(" ");
        int[] array1 = new int[sizeOfArray];
        for (int i = 0; i < sizeOfArray; i++) {
            array1[i] = Integer.parseInt(in2[i]);
        }
        int count = 0;
        Arrays.sort(array1);
        for (int i = 0; i < sizeOfArray; i++) {
            if (checkIfItIsTheNumber(array1[i])) {
                count++;
                System.out.print(array1[i] + " ");
            }
        }

        if (count == 0) {
            System.out.print("-1");
        }
        System.out.println(" ");


    }


    private static boolean checkIfItIsTheNumber(int number) {
        if (number < 10 && !(number == 1 || number == 2 || number == 3)) {
            return false;
        }
        if (number == 1 || number == 2 || number == 3) {
            return true;
        } else {
            Set<Integer> lhs = new LinkedHashSet<>();
            while (number > 0) {
                lhs.add(number % 10);
                number /= 10;
            }

            if (!(lhs.contains(0) || lhs.contains(4) || lhs.contains(5) || lhs.contains(6) || lhs.contains(7) || lhs.contains(8) || lhs.contains(9))) {
                return true;
            }
        }


        return false;
    }


}
