package Babbar.CrackerSheet;

import java.util.ArrayList;
import java.util.Scanner;

public class App08_CommonElementsInThreeSortedArrays {
    static ArrayList<Integer> commonElements(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length && k < arr3.length) {
            if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                if (!list.contains(arr1[i])) list.add(arr1[i]);
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr2[j] < arr3[k]) {
                j++;
            } else {
                k++;
            }
        }
        if(list.size()==0){
            list.add(-1);
            return list;
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S1 = sc.nextInt();
        int S2 = sc.nextInt();
        int S3 = sc.nextInt();

        int[] arr1 = new int[S1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int[] arr2 = new int[S2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        int[] arr3 = new int[S3];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i] = sc.nextInt();
        }
        ArrayList<Integer> integers = commonElements(arr1, arr2, arr3);
        for (Integer integer : integers) {
            System.out.print(integer + " ");
        }
    }
}
/*
6 5 8
1 5 10 20 40 80
6 7 20 80 100
3 4 15 20 30 70 80 120

3 3 3
1 2 3
4 5 6
7 8 9
* */