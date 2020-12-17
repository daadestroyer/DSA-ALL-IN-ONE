package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class App02_SearchInRotatedSortedArray {
    public static  int search(int[] nums, int target) {
        int rightIndex = nums.length - 1;
        for(int index = 0; index <= nums.length/2; index++){
            if(rightIndex >= index){
                if(target == nums[index]){
                    return index;
                }else if(target == nums[rightIndex]){
                    return rightIndex;
                }
            }
            rightIndex--;
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

        System.out.println(search(ar,t));
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