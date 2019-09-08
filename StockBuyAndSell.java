package com.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StockBuyAndSell {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String[] in = scanner.nextLine().split(" ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(in[i]);
        }
        stockBuySell(arr, n);

    }

    static void stockBuySell(int price[], int n) {
        List<Integer> analysis = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                if (price[i] < price[i + 1]) {
                    analysis.add(i);
                }
            } else if (i >= 1 && i < n - 1) {
                if (price[i] > price[i - 1] && price[i] > price[i + 1]) {
                    analysis.add(i);
                } else if (price[i] < price[i - 1] && price[i] < price[i + 1]) {
                    analysis.add(i);
                }
            } else if (i == n - 1) {
                if (price[i] > price[i - 1]) {
                    analysis.add(i);
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        if (analysis.size() == 0) {
            System.out.print("No Profit");
        } else if (analysis.size() == 1) {
            sb.append("(").append(String.valueOf(analysis.get(0) - 1)).append(" ").append(String.valueOf(analysis.get(0))).append(")").append(" ");
            System.out.println(sb);
        } else {
            for (int i = 0; i < analysis.size(); i += 2) {
                sb.append("(").append(String.valueOf(analysis.get(i))).append(" ").append(String.valueOf(analysis.get(i + 1))).append(")").append(" ");
                System.out.print(sb);
                sb = new StringBuilder();
            }

        }

    }
}
