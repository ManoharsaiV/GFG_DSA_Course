package com.bitmagic;

public class CountTotalSetBits {
    public static int countSetBits(int n) {
        int count = 0, temp = 0;
        while (n > 0) {
            temp = n;
            while (temp > 0) {
                temp = (temp & (temp - 1));
                count++;
            }
            n--;
        }


        return count;

    }
}
