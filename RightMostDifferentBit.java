package com.bitmagic;

public class RightMostDifferentBit {
    public static int posOfRightMostDiffBit(int m, int n) {
        if (m == n) {
            return -1;
        }

        String mBin = Integer.toBinaryString(m);
        String nBin = Integer.toBinaryString(n);
        System.out.println(mBin);
        System.out.println();
        System.out.println(nBin);


        if (mBin.length() != nBin.length()) {
            int dif = Math.abs(mBin.length() - nBin.length());
            while (dif > 0) {
                if (mBin.length() < nBin.length()) {
                    mBin = "0".concat(mBin);
                    dif--;
                } else {
                    nBin = "0".concat(nBin);
                    dif--;
                }
            }
        }
        System.out.println(mBin);
        System.out.println(nBin);
        int i = mBin.length() - 1, j = nBin.length() - 1, k = 1;

        while (i >= 0 && j >= 0) {
            if (mBin.charAt(i) != nBin.charAt(j)) {
                return k;
            } else {
                i--;
                j--;
                k++;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int n = 52 ^ 4;
        System.out.println(n);
        System.out.println(Integer.toBinaryString(n));
    }
}
