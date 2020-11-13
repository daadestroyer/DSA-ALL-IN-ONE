package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

public class App25_LargestContigiousSumArray {

    static int largestContigiousSumArray(int[] arr) {
        int curr_sum = arr[0];
        int overall_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (curr_sum >= 0) {
                curr_sum += arr[i];
            } else {
                curr_sum = arr[i];
            }
            if (curr_sum > overall_sum) {
                overall_sum = curr_sum;
            }
        }
        return overall_sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(largestContigiousSumArray(arr));
    }
}
