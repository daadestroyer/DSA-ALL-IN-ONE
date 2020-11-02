package Babbar.CrackerSheet;

import java.util.Scanner;

public class App01_ReverseArray {

    static void reverseArray(int[] arr , int start , int end){
        // 5 4 3 2 1

        if(start>=end){
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArray(arr,start+1,end-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int S = scan.nextInt();
        int[] arr = new int[S];
        for (int i = 0; i < S; i++) {
            arr[i]=scan.nextInt();
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        reverseArray(arr,0,arr.length-1);
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
