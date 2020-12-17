package Babbar.CrackerSheet.Arrays_01;

import java.util.Scanner;

public class App15_NextPermutation {

    static void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }

    static void reverse(int[] A, int i, int j) {
        while (i < j) {
            swap(A, i++, j--);
        }
    }

    static void nextPermutation(int[] arr) {
        // 1 3 5 4 2 | length = 5 | start from last 2nd index

        int i = arr.length - 2;
        while (i >= 0 && arr[i] >= arr[i + 1]) i--; // i=1

        if (i >= 0) {
            int j = arr.length - 1;
            while (arr[j] <= arr[i]) j--; // j=3
            swap(arr, i, j);
        }
        reverse(arr, i + 1, arr.length - 1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt();
            int[] arr = new int[S];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            nextPermutation(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
        }
    }
}
