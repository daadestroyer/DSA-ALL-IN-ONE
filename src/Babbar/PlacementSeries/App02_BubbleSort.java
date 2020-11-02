package Babbar.PlacementSeries;

import java.util.Scanner;

public class App02_BubbleSort {

    static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
