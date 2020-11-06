package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

public class App04_SelectionSort {

    static void selectionSort(int[] arr) {
        for (int counter = 0; counter < arr.length; counter++) {
            int min = counter;
            for (int i = counter + 1; i < arr.length; i++) {
                if (arr[i] < arr[min]) {
                    min = i;
                }
            }
            int temp = arr[min];
            arr[min] = arr[counter];
            arr[counter] = temp;

        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i] = scanner.nextInt();
        }
        selectionSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
