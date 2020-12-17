package Babbar.CrackerSheet.Arrays_01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class App14_MergeIntervals {
    static int[][] mergeIntervals(int[][] intervals) {
        List<int[]> res = new ArrayList<>();

        if (intervals.length == 0 || intervals == null) {
            return res.toArray(new int[0][]);
        }
        // way to sort array in Java 8
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        int start = intervals[0][0];
        int end = intervals[0][1];

        for (int[] i : intervals) {
//            System.out.println("i[0] = "+i[0]);

            if (i[0] <= end) {
                end = Math.max(end, i[1]); // end pointer ko move karte rho
            } else {
                res.add(new int[]{start, end});
                start = i[0];
                end = i[1];
            }
        }
        res.add(new int[]{start, end});
//        int[][] ans = new int[res.size()][];
//        for (int i = 0; i < res.size(); i++) {
//            ans[i] = res.get(i);
//        }

         // shortcut
        return res.toArray(new int[0][]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        int[][] ints = mergeIntervals(arr);
        for (int[] anInt : ints) {
            for (int i : anInt) {
                System.out.print(i+" ");
            }
        }
    }
}
