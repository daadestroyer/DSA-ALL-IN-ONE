package Babbar.CrackerSheet;

import java.util.Arrays;
import java.util.Scanner;

public class App05_MoveAllTheNegativeElementsToOneSideOfArray {

    static void moveElementsToOneSideOfArray(int[] arr, int left, int right) {
        while (left <= right) {
            // if left and right elements are negative increase left and right
            if (arr[left] < 0 && arr[right] < 0) {
                left++;
            }
            // if left is positive and right is negative then swap and left++ right--
            else if (arr[left] > 0 && arr[right] < 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            } else if (arr[left] > 0 && arr[right] > 0) {
                right--;
            } else {
                left++;
                right--;
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
        moveElementsToOneSideOfArray(arr, 0, arr.length - 1);
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
