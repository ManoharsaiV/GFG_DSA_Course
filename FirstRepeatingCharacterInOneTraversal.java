package com.hashing;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatingCharacterInOneTraversal {
    private static int firstRepeatingCharacter(String str) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (!hMap.containsKey(str.charAt(i))) {
                hMap.put(str.charAt(i), 1);
            } else {
                hMap.put(str.charAt(i), hMap.get(str.charAt(i)) + 1);
            }

        }



        return -1;

    }

    public static void main(String[] args) {
        System.out.println(firstRepeatingCharacter("geeksforgeeks"));

    }
}
