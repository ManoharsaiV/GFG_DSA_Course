package com.bitmagic;

public class BitDifference {
    public static int countBitsFlip(int a, int b) {
        int xorNum = a ^ b;
        int count = 0;
        while (xorNum > 0) {
            xorNum = (xorNum & (xorNum - 1));
            count++;
        }

        return count;


    }
}
