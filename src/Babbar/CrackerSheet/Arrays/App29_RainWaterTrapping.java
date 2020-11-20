package Babbar.CrackerSheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App29_RainWaterTrapping {
    // TC: O(N) SC:O(N)
    static int rainWaterTrapping(int[] ar) {
        int[] left = new int[ar.length];
        int[] right = new int[ar.length];

        int water = 0;
        left[0] = ar[0];
        for (int i = 1; i < ar.length; i++) {
            left[i] = Math.max(left[i - 1], ar[i]);
        }
        right[ar.length - 1] = ar[ar.length - 1];
        for (int i = ar.length - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], ar[i]);
        }

        for (int i = 0; i < ar.length; i++) {
            water += Math.min(left[i], right[i]) - ar[i];
        }
        return water;
    }

    static int rainWaterTrappingWithoutSpace(int[] ar) {
        int water = 0;
        int left_max = 0;
        int right_max = 0;
        int lo = 0;
        int hi = ar.length - 1;

        while (lo <= hi) {
            // condition to prevent overflow
            if (ar[lo] < ar[hi]) {
                if (ar[lo] > left_max) {
                    left_max = ar[lo];
                } else {
                    water += left_max - ar[lo];
                }
                lo++;
            } else {
                if (ar[hi] > right_max) {
                    right_max = ar[hi];
                } else {
                    water += right_max - ar[hi];
                }
                hi--;
            }
        }

        return water;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt();
            int[] ar = new int[S];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
           // System.out.println(rainWaterTrapping(ar));
            System.out.println(rainWaterTrappingWithoutSpace(ar));
        }
    }

}
/*
12
0 1 0 2 1 0 1 3 2 1 2 1
12
0 1 0 2 1 0 1 3 2 1 2 1
*/