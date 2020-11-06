package Babbar.PlacementSeries.Arrays;

import java.util.HashMap;
import java.util.Scanner;

public class App12_CountPairWithGivenSum {
    static int getPairsCount(int[] arr, int n, int k) {
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(k - arr[i])) {
                count = count + map.get(k - arr[i]);
            }
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        while (t-- > 0) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scan.nextInt();
            }

            System.out.println(getPairsCount(arr, n, k));
        }
    }
}
/*
2
4 6
1 5 7 1
4 2
1 1 1 1
* */