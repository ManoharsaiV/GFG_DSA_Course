package com.hashing;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class WinnerOfAnElection {
    static void winner(String arr[], int n) {
        Set<String> sortedSet = new TreeSet<>();
        for (int i = 0; i < n; i++) {
            sortedSet.add(arr[i]);
        }


        System.out.println(sortedSet);

        String[] arrS = new String[sortedSet.size()];
        sortedSet.toArray(arrS);
        if (n == sortedSet.size()) {
            System.out.print(arrS[0] + " 1");
        } else {
            String result = "";
            int count = 0;
            for (String s : arrS) {
                int temp = 0, i = 0;
                String tempS = "";
                String winnerS = "";
                for (; i < n; i++) {
                    if (arr[i].equals(s)) {
                        tempS = arr[i];
                        temp++;
                    }
                }
                if (temp > count) {
                    count = temp;
                    winnerS = tempS;
                    result = "".concat(winnerS).concat(" ").concat(String.valueOf(count)).concat(" ");
                }

            }
            System.out.print(result);
        }


    }


}
