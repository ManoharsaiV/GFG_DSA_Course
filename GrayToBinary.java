package com.bitmagic;

public class GrayToBinary {
    public static int grayToBinary(int n) {
        String[] grayB = Integer.toBinaryString(n).split("");
        int[] gray = new int[grayB.length];
        for (int i = 0; i < grayB.length; i++) {
            gray[i] = Integer.parseInt(grayB[i]);
        }

        int len = gray.length;
        int[] bin = new int[len];
        bin[0] = gray[0];
        for (int i = 1; i < bin.length; i++) {
            if (gray[i] == 0) {
                bin[i] = bin[i - 1];
            } else {
                if (bin[i - 1] == 0) {
                    bin[i] = 1;
                } else if (bin[i - 1] == 1) {
                    bin[i] = 0;
                }
            }
        }
        //System.out.println(Arrays.toString(bin));
        int i = len - 1, k = 0, binDecimal = 0;
        while (i >= 0) {
            binDecimal += (bin[i] * Math.pow(2, k));
            k++;
            i--;
        }

        return binDecimal;

    }
}
