package com.bitmagic;


import java.math.BigInteger;

public class PowerOf2 {
    public static boolean isPowerofTwo(BigInteger n) {
        if(n.equals(BigInteger.valueOf(0))){
            return false;
        }

        if (n.and(n.subtract(BigInteger.valueOf(1))).equals(BigInteger.valueOf(0))) {
            return true;
        }
        return false;

    }
}
