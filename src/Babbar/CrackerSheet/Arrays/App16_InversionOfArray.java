package Babbar.CrackerSheet.Arrays;

import java.util.Scanner;

public class App16_InversionOfArray {
    static long mergeInvCount(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left; // index of left sub array
        int j = mid; // index of right sub array
        int k = left;
        long inv_count = 0;

        while ((i <= mid - 1) && (j <= right)) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
                inv_count = inv_count + (mid - i);
            }
        }
        while (i <= mid - 1) {
            temp[k++] = arr[i++];
        }
        while (j <= right) {
            temp[k++] = arr[j++];
        }

        for (i = left; i <= right; i++) {
            arr[i] = temp[i];
        }


        return inv_count;
    }

    static long inversionCount(int[] arr, int[] temp, int left, int right) {
        long inv_count = 0;

        if (right > left) {
            int mid = (left + right) / 2;

            inv_count += inversionCount(arr, temp, left, mid);
            inv_count += inversionCount(arr, temp, mid + 1, right);


            inv_count += mergeInvCount(arr, temp, left, mid + 1, right);
        }
        return inv_count;
    }

    public static void main(String[] args) {
        /*
        // BRUTE-FORCE | TC : O(n)^ |  SC : O(1)
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] ar = new int[S];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

        int count = 0;

        System.out.println(count);
        */

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];
        int[] temp = new int[S];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(inversionCount(arr, temp, 0, arr.length - 1));


    }
}
/*
5
2 4 1 3 5
5
2 3 4 5 6
3
10 10 10
*/