package Babbar.CrackerSheet.Arrays_01;

import java.util.Scanner;

public class App08_LargestContigiousSumArray {

    static int largestContigiousSumArray(int[] arr) {
        int current_sum = arr[0];
        int overall_sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (current_sum >= 0) {
                current_sum += arr[i];
            } else {
                current_sum = arr[i];
            }
            if (current_sum > overall_sum) {
                overall_sum = current_sum;
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
