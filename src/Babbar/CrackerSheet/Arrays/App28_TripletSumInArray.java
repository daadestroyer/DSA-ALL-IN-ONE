package Babbar.CrackerSheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App28_TripletSumInArray {
    static int tripletSumInArray(int[] arr , int sum){
        for (int low = 0; low < arr.length; low++) {
            int mid = low+1;
            int high = arr.length-1;
            while (mid < high){
                if(arr[low]+arr[mid]+arr[high]==sum){
                    return 1;
                }
                else if(arr[mid]+arr[low]+arr[high]>sum){
                    high--;
                }
                else {
                    mid++;
                }
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-->0){
            int S = sc.nextInt();
            int X = sc.nextInt();
            int[] arr = new int[S];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            System.out.println(tripletSumInArray(arr,X));
        }
    }
}
