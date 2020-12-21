package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App03_SearchInRotatedSortedArray {

    public static int search(int[] nums, int target) {
        int hi = nums.length - 1;

        for (int i = 0; i <= nums.length / 2; i++) {
            if (hi >= i) {
                if (nums[hi] == target) {
                    return hi;
                } else {
                    if (nums[i] == target) {
                        return i;
                    }
                }
            }

            hi--;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int t = sc.nextInt();

        System.out.println(search(ar, t));
    }
}
/*
7
4 5 6 7 0 1 2
0
7
4 5 6 7 0 1 2
3
1
1
0
*/