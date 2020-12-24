package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App21_SearchInARotatedArray {
    public static int search(int[] nums , int target){
        int hi = nums.length-1;

        for (int i = 0; i <= nums.length/2 && hi >= i; i++) {
            if(nums[hi] == target)
                return hi;
            else {
                if(nums[i] == target)
                    return i;

            }


            hi--;

        }
        return -1;
    }


    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int s = sc.nextInt();
            int[] nums = new int[s];
            for(int i=0 ; i<nums.length ; i++){
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            System.out.println(search(nums,target));
        }
    }
}
