package Babbar.CrackerSheet.Arrays_01;

import java.util.Arrays;
import java.util.Scanner;

public class App37_RearrangeArrayAlternately {
    // TC : O(N) SC : O(1)
    static void rearrangeArrayAlternatelyBruteForce(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int[] temp = arr.clone();
        int i = 0;
        int k = 0;

        while (lo <= hi && k < arr.length) {
            if (k < arr.length)
                arr[k] = temp[hi--];
            k++;
            if (k < arr.length)
                arr[k] = temp[lo++];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    // TC : O(N)  SC : O(1)
    static void rearrangeArrayAlternatelyBruteForceOptimized(int[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        int[] temp = arr.clone();
        int i = 0;
        int k = 0;

        while (lo <= hi && k < arr.length) {
            if (k < arr.length)
                arr[k] = temp[hi--];
            k++;
            if (k < arr.length)
                arr[k] = temp[lo++];
            k++;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int[] ar = new int[S];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        rearrangeArrayAlternatelyBruteForce(ar);
    }
}
/*
6
1 2 3 4 5 6
9
350 863 1902 2328 2854 3915 6800 8955 9877
*/