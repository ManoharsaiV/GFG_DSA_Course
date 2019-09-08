package com.hashing;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class RelativeSorting {
    /**
     * First line of input contains number of testcases.
     * For each testcase, first line of input contains length of arrays N and M and
     * next two line contains N and M elements respectively.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-- > 0) {
            String sizes = br.readLine();
            String array1 = br.readLine();
            String array2 = br.readLine();
            List<Integer> li = new ArrayList<>();
            li = relativeSort(sizes, array1, array2);
            String s = "";
            for (Integer i : li) {
                s = s.concat(String.valueOf(i)).concat(" ");
            }
            System.out.println(s);

        }
        br.close();

    }

    private static List<Integer> relativeSort(String sizes, String array1, String array2) {
        String[] size = sizes.split(" ");
        int n = Integer.parseInt(size[0]);
        int m = Integer.parseInt(size[1]);

        String[] a1 = array1.split(" ");
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = Integer.parseInt(a1[i]);
        }

        String[] a2 = array2.split(" ");
        int[] arr2 = new int[m];
        for (int i = 0; i < m; i++) {
            arr2[i] = Integer.parseInt(a2[i]);
        }


        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!hMap.containsKey(arr1[i])) {
                hMap.put(arr1[i], 1);
            } else {
                hMap.put(arr1[i], hMap.get(arr1[i]) + 1);
            }
        }

        List<Integer> finalList = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            if (hMap.containsKey(arr2[i])) {
                int howManyTimesToAdd = hMap.get(arr2[i]);
                while (howManyTimesToAdd-- > 0) {
                    finalList.add(arr2[i]);
                }
                hMap.remove(arr2[i]);
            }
        }

        Map<Integer, Integer> tMap = new TreeMap<>();


        tMap.putAll(hMap);


        for (Map.Entry<Integer, Integer> entry : tMap.entrySet()) {
            int times = entry.getValue();
            while (times-- > 0) {
                finalList.add(entry.getKey());
            }
        }

        return finalList;
    }
}
