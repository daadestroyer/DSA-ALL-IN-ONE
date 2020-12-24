package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App25_EKO {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfTrees = sc.nextInt();
        long wood = sc.nextInt();
        long lo = 0;
        long hi = 0;
        int[] treesHeight = new int[noOfTrees];
        for (int i = 0; i < treesHeight.length; i++) {
            treesHeight[i] = sc.nextInt();
            if (treesHeight[i] > hi) {
                hi = treesHeight[i];
            }
        }

        long ans = 0;

        while (lo <= hi) {
            long mid = (lo + hi) / 2;
            long woodres = 0;

            for (int i : treesHeight) {
                if (i - mid > 0) {
                    woodres += i - mid;
                }
            }
            if (woodres == wood) {
                hi = mid;
                break;
            } else if (woodres > wood) {
                lo = mid + 1;

            } else {
                hi = mid - 1;
            }

        }
        System.out.println(hi);
    }

}
/*
4 7
20 15 10 17
-->15

5 20
4 42 40 26 46
-->36
*/