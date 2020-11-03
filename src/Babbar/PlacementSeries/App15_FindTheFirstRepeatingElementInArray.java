package Babbar.PlacementSeries;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class App15_FindTheFirstRepeatingElementInArray {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();

        while (t-- > 0) {
            int S = scan.nextInt();
            int[] arr = new int[S];
            int min = -1;
            HashMap<Integer, Integer> mapping = new HashMap<>();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scan.nextInt();
                if (mapping.containsKey(arr[i])) {
                    mapping.put(arr[i], mapping.get(arr[i]) + 1);
                } else {
                    mapping.put(arr[i], 1);
                }
            }
            for (int i = 0; i < arr.length; i++) {
                if (mapping.get(arr[i]) > 1) {
                    min = i + 1;
                    break;
                }
            }
            System.out.println(min);
        }
    }
}
/*
4
7
1 5 3 4 3 5 6
4
1 2 3 4
5
1 2 2 1 3
6
1 1 2 2 3 3



*/