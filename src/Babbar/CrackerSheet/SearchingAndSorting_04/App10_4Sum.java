package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App10_4Sum {

    static List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length==0)
            return res;

        Arrays.sort(nums);
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int target2 = target -  (nums[j] + nums[i]);
                int front = j + 1;
                int back = n - 1;

                while (front < back) {
                    int twosum = nums[front] + nums[back];

                    if (twosum < target2) front++;
                    else if (twosum > target2) back--;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[front]);
                        list.add(nums[back]);
                        res.add(list);

                        // processing the duplicates for number 3
                        while (front < back && nums[front] == list.get(2)) ++front;

                        // processing the duplicates for number 4
                        while (front < back && nums[back] == list.get(3)) --back;

                    }
                }
                // processing the duplicates for number 2
                while (j + 1 < nums.length && nums[j + 1] == nums[j]) ++j;

            }
            // processing the duplicates for number 1
            while (i + 1 < nums.length && nums[i + 1] == nums[i]) ++i;


        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] ar = new int[n];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        List<List<Integer>> a = fourSum(ar, k);
        for (List<Integer> i : a) {
            System.out.println(i);
        }
    }
}

/*
5 3
0 0 2 1 1

6 0
1 0 -1 0 -2 2
*/