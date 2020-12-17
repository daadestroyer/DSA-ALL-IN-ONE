package Babbar.CrackerSheet.Arrays_01;

import java.util.ArrayList;
import java.util.Scanner;

public class App27_ArraySubsetOfAnotherArray {
    static boolean arraySubsetOfAnotherArrayOptimized(int[] a1, int[] a2) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            list.add(a1[i]);
        }

        for (int i = 0; i < a2.length; i++) {
            if (!list.contains(a2[i])) {
                return false;
            }
        }
        return true;
    }

    static boolean arraySubsetOfAnotherArrayBruteForce(int[] a1, int[] a2, int m, int n) {
        int i = 0; // i is for a2
        int j = 0; // j is for a1

        for (i = 0; i < a1.length; i++) {
            for (j = 0; j < m; j++) {
                if (a2[i] == a1[j]) break;

                if (j == m) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();
            int[] a1 = new int[s1];
            int[] a2 = new int[s2];

            for (int i = 0; i < a1.length; i++) {
                a1[i] = sc.nextInt();
            }
            for (int i = 0; i < a2.length; i++) {
                a2[i] = sc.nextInt();
            }
            String res = arraySubsetOfAnotherArrayBruteForce(a1, a2, a1.length, a2.length) ? "Yes" : "No";
            System.out.println(res);

        }
    }
}
/*

 */