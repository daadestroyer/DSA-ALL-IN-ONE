package Babbar.PlacementSeries;

import java.util.Scanner;

public class App08_SortAndArrayWithoutUsingAnySortingAlgo {
    static void sortArray(int[] arr) {
        // first count the no of 0's 1's 2's
        int zero=0,one=0,two=0;
        for (int i = 0; i < arr.length; i++) {
            int element = arr[i];

            switch(element) {
                case 0 :
                    zero++;break;
                case 1 :
                    one++;break;
                case 2 :
                    two++;break;
            }
        }
        // update the array
        int i=0;
        while(zero!=0) {
            arr[i]=0;
            zero--;
            i++;
        }
        while(one!=0) {
            arr[i]=1;
            one--;
            i++;
        }
        while(two!=0) {
            arr[i]=2;
            two--;
            i++;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            sortArray(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
            t--;
        }
    }
}
