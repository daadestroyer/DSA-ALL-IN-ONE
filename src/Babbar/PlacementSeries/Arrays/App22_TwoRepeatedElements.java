package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

public class App22_TwoRepeatedElements {
    // 1 2 1 3 4 3
    static void twoRepeatedElements(int[] arr) {

        int[] count = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (count[arr[i]] == 1) {
                System.out.print(arr[i] + " ");
            } else {
                count[arr[i]]++;
            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int S = sc.nextInt();
            int[] arr = new int[S+2];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            twoRepeatedElements(arr);
            System.out.println();
        }
    }
}



