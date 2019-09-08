package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class CountFrequencies {

    private static Map<Integer, Integer> countFreq(int[] arr) {
        Map<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!hMap.containsKey(arr[i])) {
                hMap.put(arr[i], 1);
            } else {
                hMap.put(arr[i], hMap.get(arr[i]) + 1);
            }
        }



        return hMap;

    }

    public static void main(String[] args) {
        int[] arr = {23, 11, 12, 23, 12, 11, 11, 23};
        System.out.println(countFreq(arr));
    }

}
