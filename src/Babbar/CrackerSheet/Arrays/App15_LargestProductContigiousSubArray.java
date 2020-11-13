package Babbar.CrackerSheet.Arrays;

import java.util.Scanner;

public class App15_LargestProductContigiousSubArray {

    static long maxProduct(int[] arr) {
        long curr_max = arr[0];
        long curr_min = arr[0];
        long final_max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            long temp = curr_max;
            curr_max = Math.max(Math.max(curr_max * arr[i], curr_min * arr[i]), arr[i]);
            curr_min = Math.min(Math.min(temp * arr[i], curr_min * arr[i]), arr[i]);

            if (curr_max > final_max) {
                final_max = curr_max;
            }
        }
        return final_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(maxProduct(arr));
    }
}
