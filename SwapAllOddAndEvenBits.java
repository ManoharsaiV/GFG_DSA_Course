package com.bitmagic;




public class SwapAllOddAndEvenBits {


    public static int swapBits(int n) {
        String b = Integer.toBinaryString(n);
        if (b.length() < 8) {
            int diff = Math.abs(8 - b.length());
            while (diff > 0) {
                b = "0".concat(b);
                diff--;
            }
        }
        String[] bin = b.split("");
        int len = bin.length;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = Integer.parseInt(bin[i]);
        }
        // System.out.println(Arrays.toString(arr));


        for (int i = 0; i + 1 < len; i += 2) {
            if (i % 2 == 0) {
                final int i1 = arr[i] ^ arr[i + 1];
                arr[i] = i1;
                arr[i + 1] = i1;
                arr[i] = i1;
            }
        }
        //System.out.println(Arrays.toString(arr));

        int i = arr.length - 1, k = 0, decimal = 0;
        while (i >= 0) {
            decimal += (arr[i] * Math.pow(2, k));
            k++;
            i--;
        }

        return decimal;

    }

    public static void main(String[] args) {
        int n = 23;
        System.out.println(swapBits(n));
    }
}
