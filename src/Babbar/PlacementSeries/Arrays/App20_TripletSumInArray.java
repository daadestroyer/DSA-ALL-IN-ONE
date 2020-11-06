package Babbar.PlacementSeries.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class App20_TripletSumInArray {
    static void tripletSumInArray(int[] arr , int sum) {
        for (int low = 0; low < arr.length; low++) {
            int mid = low+1;
            int high = arr.length-1;

            while (mid < high){
                if(arr[low]+arr[mid]+arr[high]==sum){
                    System.out.println(arr[low]+" "+arr[mid]+" "+arr[high]);
                    low++;
                    mid++;
                }
                else if(arr[low]+arr[mid]+arr[high]>sum)high--;
                else mid++;
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0){
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);

            tripletSumInArray(arr,x);
        }
    }
}
/*
2
6 13
1 4 45 6 10 8
5 10
1 2 4 3 6

1
6 0
-1 0 1 2 -1 -4
*/