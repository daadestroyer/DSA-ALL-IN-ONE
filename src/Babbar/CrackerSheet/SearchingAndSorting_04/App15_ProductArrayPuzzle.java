package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App15_ProductArrayPuzzle {

    public static long[] productExceptSelf(int arr[], int n) {
        long[] res = new long[n];

        for (int i = 0; i < arr.length; i++) {

            int prod = 1;
            int j = 0;

            while (j < arr.length) {
                if (i == j) j++;


                if (j < arr.length) {
                    prod = prod * arr[j];
                    j++;
                }

            }
            res[i] = prod;
        }

        return res;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        long[] res = productExceptSelf(ar, ar.length);
        System.out.println(Arrays.toString(res));
    }
}
/*
5
10 3 5 6 2
*/