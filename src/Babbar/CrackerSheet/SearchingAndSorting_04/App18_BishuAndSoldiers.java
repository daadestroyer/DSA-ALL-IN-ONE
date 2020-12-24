package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App18_BishuAndSoldiers {

    static int binarySearch(int[] noOfPower, int power) {
        int lo = 0;
        int hi = noOfPower.length - 1;
        int idx = -1;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;

            if (noOfPower[mid] == power) {
                idx = mid;
                lo=mid+1;
            } else if (power > noOfPower[mid]) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return idx;
    }

    static int calculatPower(int[] noOfPower, int givenpower) {
        int[] powersum = new int[noOfPower.length];
        powersum[0] = noOfPower[0];

        for (int i = 1; i < noOfPower.length; i++) {
            powersum[i] = powersum[i - 1] + noOfPower[i];
        }


        int idx = binarySearch(noOfPower, givenpower);


        if (idx >= 0) {
            System.out.println(givenpower + " " + powersum[idx]);
        } else {
            System.out.println(powersum.length + " " + powersum[powersum.length - 1]);
        }

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nop = sc.nextInt();
        int[] noOfPowers = new int[nop];
        for (int i = 0; i < noOfPowers.length; i++) {
            noOfPowers[i] = sc.nextInt();
        }
        Arrays.sort(noOfPowers);
        int Q = sc.nextInt();
        while (Q-- > 0) {
            int power = sc.nextInt();
            calculatPower(noOfPowers, power);
        }
    }
}
