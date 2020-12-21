package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App12_CountTriplet {

    static long countTriplets(long arr[], int n, int sum) {
        Arrays.sort(arr);

        if (n < 3) return 0;

        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = n - 1;
            while (j < k) {
                if (arr[i] + arr[j] + arr[k] < sum) {
                    count += k - j;
                    j++;
                } else {
                    k--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        long[] ar = new long[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int X = sc.nextInt();
        System.out.println(countTriplets(ar, ar.length, X));
    }
}
