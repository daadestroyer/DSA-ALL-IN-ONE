package Babbar.PlacementSeries;

import java.util.Scanner;

public class App07_CountNoOfOccurrencesOfANumberInArray {

    static int binarySearch(int[] arr, int low, int high, int x) {
        if (low > high) {
            return -1;
        }
        int mid = (low + high) / 2;

        if (arr[mid] == x) {
            return mid;
        } else if (arr[mid] > x) {
            return binarySearch(arr, low, mid - 1, x);
        } else {
            return binarySearch(arr, mid + 1, high, x);
        }

    }

    static int countOccurrences(int[] arr, int low, int high, int x) {
        int idx = binarySearch(arr, low, high, x);

        if (idx == -1) {
            return 0;
        }
        // count element on left side
        int count = 1;
        int left = idx - 1;
        while (left >= 0 && arr[left] == x) {
            count++;
            left--;
        }
        // count element on right side
        int right = idx + 1;
        while (right < arr.length && arr[right] == x) {
            count++;
            right++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i] = sc.nextInt();
        }
        int x = sc.nextInt();
        System.out.println(countOccurrences(arr, 0, arr.length - 1, x));
    }

}
