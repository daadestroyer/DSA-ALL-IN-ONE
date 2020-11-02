package Babbar.CrackerSheet;

import java.util.Scanner;

public class App03_KthSmallestElement {
    static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int lo = low;
        int hi = high;
        int mid = (lo + hi) / 2;
        int pivot = arr[mid];

        while (lo <= hi) {
            while (arr[lo] < pivot) {
                lo++;
            }
            while (arr[hi] > pivot) {
                hi--;
            }
            if (lo <= hi) {
                int temp = arr[lo];
                arr[lo] = arr[hi];
                arr[hi] = temp;
                lo++;
                hi--;
            }
        }
        quickSort(arr, low, hi);
        quickSort(arr, lo, high);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int S = sc.nextInt();

            int[] arr = new int[S];
            for (int i = 0; i < S; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            quickSort(arr, 0, arr.length - 1);
            System.out.println(arr[k - 1]);
        }


    }
}
