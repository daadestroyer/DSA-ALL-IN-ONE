package Babbar.PlacementSeries;

import org.omg.CORBA.INTERNAL;

import java.util.*;

public class App10_UnionAndIntersectionOfTwoArrays_WAY_1 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int S1 = sc.nextInt();
            int S2 = sc.nextInt();
            int[] arr1 = new int[S1];
            for (int i = 0; i < S1; i++) {
                arr1[i] = sc.nextInt();
                if (map.containsKey(arr1[i])) {
                    map.put(arr1[i], map.get(arr1[i]) + 1);
                } else {
                    map.put(arr1[i], 1);
                }
            }
            int[] arr2 = new int[S2];

            for (int i = 0; i < S2; i++) {
                arr2[i] = sc.nextInt();
                if (map.containsKey(arr2[i])) {
                    map.put(arr2[i], map.get(arr2[i]) + 1);
                } else {
                    map.put(arr2[i], 1);
                }
            }
            System.out.println(map);
            System.out.print("Union is : ");
            Set<Integer> union = map.keySet();
            for (Integer i : union) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.print("Intersection is : ");
            Set<Map.Entry<Integer, Integer>> intersection = map.entrySet();
            for (Map.Entry<Integer,Integer> entry : intersection){
                if(entry.getValue()==2){
                    System.out.print(entry.getKey()+" ");
                }
            }
            System.out.println();
            System.out.println("Size is : " + map.size());
        }
    }
}
/*
5 3
1 2 3 4 5
1 2 3


6 5
1 1 2 2 3 3
8 9 7 6 5

* */