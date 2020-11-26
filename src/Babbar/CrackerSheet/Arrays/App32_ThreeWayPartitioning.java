package Babbar.CrackerSheet.Arrays;

import java.util.Scanner;

public class App32_ThreeWayPartitioning {
    static void threeWayPartition(int array[], int a, int b) {
        int start = 0;
        int end = array.length - 1;

        for (int i = 0; i <= end; ) {
            if (array[i] < a) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                i++;
                start++;
            } else if (array[i] > b) {
                int temp = array[end];
                array[end] = array[i];
                array[i] = temp;
                end--;
            } else {
                i++;
            }

        }

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] ar = new int[S];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int a = sc.nextInt();
        int b = sc.nextInt();
        threeWayPartition(ar, a, b);
    }
}

/*
5
1 2 3 3 4
*/