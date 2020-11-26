package Babbar.CrackerSheet.Arrays;

import java.util.Scanner;

public class App31_SmallestSubArrayWithSumGreaterThanGivenValue {

    static int smallestSubArrayWithSunGreaterThanGivenValue(int[] ar, int k) {
        int min_length = ar.length + 1;

        for (int start = 0; start < ar.length; start++) {
            int curr_sum = ar[start];

            if (ar[start] > k) {
                return 1;
            }
            for (int end = start + 1; end < ar.length; end++) {
                curr_sum += ar[end];

                if (curr_sum > k && (end - start + 1) < min_length) {
                    min_length = end - start + 1;
                }
            }
        }
        return min_length;
    }

    static int smallestSubArrayWithSunGreaterThanGivenValue1(int[] ar, int k) {
        int min_length = ar.length + 1;
        int start = 0;
        int end = 0;
        int curr_sum = 0;

        while (end < ar.length) {
            while (curr_sum <= k && end < ar.length) {
                curr_sum += ar[end++];
            }
            // curr_sum > k
            while (curr_sum > k && start < ar.length) {
                if (end - start < min_length) {
                    min_length = end - start;

                }
                curr_sum = curr_sum - ar[start++];
            }
        }
        return min_length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt();
            int k = sc.nextInt();
            int[] ar = new int[S];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(smallestSubArrayWithSunGreaterThanGivenValue1(ar, k));
        }
    }
}
/*

6 51
1 4 45 6 0 19
*/