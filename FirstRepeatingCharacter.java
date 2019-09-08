package com.hashing;

import java.util.HashSet;
import java.util.Set;

public class FirstRepeatingCharacter {
    public static void main(String[] args) {

    }

    private static char countFirstRepeated(String str) {
        char[] c = str.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char ch : c) {
            if (!set.contains(ch)) {
                set.add(ch);
            } else {
                return ch;
            }

        }

        return 'a';


    }

}
