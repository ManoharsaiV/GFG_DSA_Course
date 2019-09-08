package com.bitmagic;

public class GrayCode {
    public static int greyConverter(int n) {
        String[] bin = Integer.toBinaryString(n).split("");
        int[] nA = new int[bin.length];
        for (int i = 0; i < nA.length; i++) {
            nA[i] = Integer.parseInt(bin[i]);
        }
        int[] grayArray = new int[nA.length];
        grayArray[0] = nA[0];
        for (int i = 1; i < grayArray.length; i++) {
            grayArray[i] = (nA[i] ^ nA[i - 1]);
        }
        int len = grayArray.length;
        int i = len - 1, k = 0, decimal = 0;
        while (i >= 0) {
            decimal += (grayArray[i] * Math.pow(2, k));
            k++;
            i--;
        }

        return decimal;

    }

}
