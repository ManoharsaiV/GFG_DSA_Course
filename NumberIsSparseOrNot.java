package com.bitmagic;

public class NumberIsSparseOrNot {
    public static boolean isSparse(int n){
        String nBin = Integer.toBinaryString(n);


        if(!nBin.contains("11")){
            return true;
        }

        return false;


    }

    /**  for (int i = 0; i < nBin.length(); i++) {
        if(i == 0 && nBin.charAt(i) == '1'){
            if(nBin.charAt(i + 1) != '1'){
                return false;
            }
        }else if(i > 0 && i < nBin.length()-1){

        }
    }*/
}
