package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App22_KthElementOfTwoSortedArrays {

    static int kthElementOfTwoSortedArray(int[] arr1, int[] arr2, int target) {
        int[] merge = new int[arr1.length + arr2.length];
        int i = 0, j = 0;
        int k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                merge[k++] = arr1[i++];
            } else {
                merge[k++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            merge[k++] = arr1[i++];
        }
        while (j<arr2.length){
            merge[k++] = arr2[j++];
        }
        return merge[target-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int target = sc.nextInt();
        int[] arr1 = new int[s1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[s2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println(kthElementOfTwoSortedArray(arr1, arr2, target));
    }
}
