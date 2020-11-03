package Babbar.PlacementSeries;

import java.util.HashMap;
import java.util.Scanner;

public class App16_FindTheFirstNonRepeatingElementInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int S = scanner.nextInt();
        int[] arr = new int[S];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();

            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.get(arr[i])==1){
                System.out.println(arr[i]);
                System.exit(0);
            }
        }

    }
}
/*
6
9 4 9 6 7 4
*/