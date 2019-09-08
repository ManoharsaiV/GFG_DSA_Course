package com.bitmagic;

public class FindFirstSetBit {
    public static int getFirstSetBitPos(int n) {
        if (n == 0) {
            return 0;
        }
        String bin = Integer.toBinaryString(n);
        System.out.println(bin);
        for (int i = bin.length() - 1, j = 1; i >= 0; i--, j++) {
            if (bin.charAt(i) == '1') {
                return j;
            }
        }

        return 0;

    }

// did not try this one

    private static int getFirstSetBitPosition(int n) {
        if (n >= 1) {
            int a = (n) ^ (n - 1);
            return (int) Math.log1p(a);
        } else
            return 0;

    }

}
