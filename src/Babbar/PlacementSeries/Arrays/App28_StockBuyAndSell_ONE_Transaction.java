package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

// Buy and sell stock one transaction allowed calculate maximum profit
public class App28_StockBuyAndSell_ONE_Transaction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] prices = new int[S];

        for (int i = 0; i < prices.length; i++) {
            prices[i] = sc.nextInt();
        }
        int least_price = Integer.MAX_VALUE;
        int max_profit = 0;
        int profit_if_sold_today = 0;

        for (int i : prices) {
            if (i < least_price) {
                least_price = i;
            }
            profit_if_sold_today = i - least_price;

            if (profit_if_sold_today > max_profit) {
                max_profit = profit_if_sold_today;
            }
        }
        System.out.println(max_profit);
    }
}
