package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class App06_FindMissingAndRepeating {

    static int[] findTwoElementBruteForce(int arr[], int n) {
        Arrays.sort(arr);
        int repeating = 0;
        int missing = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                repeating = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != i) {
                missing = i;
            }
        }

        if (missing == 0) {
            missing = arr.length;
        }


        return new int[]{repeating, missing};
    }

    static int[] findTwoElementOptimized(int arr[], int n) {

        HashMap<Integer, Boolean> hm = new HashMap<>();
        int missing = 0;
        int repeating = 0;
        for (Integer i : arr) {
            if (hm.get(i) == null) {
                hm.put(i, true);
            } else {
                repeating = i;
            }
        }
        for (int i = 1; i <= arr.length; i++) {

            if (hm.get(i) == null) {
                missing = i;
            }
        }
        return new int[]{repeating, missing};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        // int[] a = findTwoElementBruteForce(ar, ar.length);
           int[] a = findTwoElementOptimized(ar, ar.length);

        System.out.println(Arrays.toString(a));

    }
}
/*
2
2 2
[2, 1]

3
1 3 3
[3, 2]

14
12 7 5 1 13 1 10 8 11 9 2 4 3 6
[1, 14]

3
3 1 3
[3,2]

6
4 3 6 2 1 1
[1,5]
*/