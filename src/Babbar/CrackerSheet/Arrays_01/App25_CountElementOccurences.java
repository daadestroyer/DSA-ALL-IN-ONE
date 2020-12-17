package Babbar.CrackerSheet.Arrays_01;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App25_CountElementOccurences {

    static void countElementOccurences(int[] ar, int k) {
        int count = 0;
        int occur = ar.length / k;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            int num = ar[i];
            if (!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        for (Map.Entry<Integer,Integer> m : map.entrySet()) {
            if(m.getValue()>occur){
                System.out.println(m.getKey());
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int[] ar = new int[S];
        int k = sc.nextInt();
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }

         countElementOccurences(ar, k) ;
    }
}
/*
12 4
1 1 2 2 3 5 4 2 2 3 1 1 1
8 4
3 1 2 2 1 2 3 3
*/