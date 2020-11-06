package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;
/*
brute force solution
--------------------
sort the array and check for if(arr[i]==arr[i+1]) --> found

1st level optimization
----------------------
using hashmap

most optimized way
------------------
using floyd tortoize and mare cycle detection algorithm
*/
public class App13_FindTheDuplicateNumber_In_Array_Of_N_Plus_1_Integer {
    static int findDuplicate(int[] nums) {
        // take two pointer slow and fast
        // point both of then to 0th index
        int slow = nums[0];
        int fast = nums[0];

        // move slow pointer by 1 step and fast pointer by 2 step
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        while (slow != fast);

        // at some point both slow and fast pointer will collide at that point stop floyd cycle algorithm
        // again put the fast pointer to 0th index
        // move fast and slow by 1 step
        // wherever they collide will the duplicate no of us
        fast = nums[0];

        while(slow!=fast){
            slow=nums[slow];
            fast=nums[fast];
        }

        return fast;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findDuplicate(arr));

    }
}
