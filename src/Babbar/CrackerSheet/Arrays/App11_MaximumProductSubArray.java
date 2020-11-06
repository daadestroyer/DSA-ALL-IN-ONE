package Babbar.CrackerSheet.Arrays;

import java.util.Scanner;

public class App11_MaximumProductSubArray {
    static Long subArrayWithMaxSum(int[] arr) {

        long current_max = arr[0];
        long final_max = arr[0];

        for (int i = 1; i <= arr.length; i++) {


            if (current_max > final_max) {
                final_max = current_max;
            }
        }

        return final_max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(subArrayWithMaxSum(arr));
    }
}
/*
5
6 -3 -10 0 2 -> 180
5
-8 5 3 1 6 -> 90
4
0 1 -5 7 -> 7
*/