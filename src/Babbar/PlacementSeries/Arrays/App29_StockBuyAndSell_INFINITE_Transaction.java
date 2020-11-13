package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

// Buy and sell stock infinite transaction allowed calculate overall profit at every upstrokes
public class App29_StockBuyAndSell_INFINITE_Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] a = new int[s];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int buying_day = 0;
        int sell_day = 0;
        int profit = 0;

        for (int i = 1; i < a.length; i++) {
            if (a[i] >= a[i - 1]) {
                sell_day++;
            } else {
                profit = profit + a[sell_day] - a[buying_day];

                buying_day = i;
                sell_day = i;
            }

        }
        profit = profit + a[sell_day] - a[buying_day];
        System.out.println(profit);
    }
}
/*
7
100 180 260 310	40 535 695
* */