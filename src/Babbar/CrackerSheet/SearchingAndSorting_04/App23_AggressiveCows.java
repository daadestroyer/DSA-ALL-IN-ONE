package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Arrays;
import java.util.Scanner;

public class App23_AggressiveCows {

    static boolean isItPossible(int[] stallsPosition, int totalCows, int noOfStalls, int mid) {
        int noOfCowPlaced = 1;
        int cowPlacedAtLocation = stallsPosition[0];

        for (int i = 1; i < stallsPosition.length; i++) {
            if (stallsPosition[i] - cowPlacedAtLocation >= mid) {
                noOfCowPlaced++;
                cowPlacedAtLocation = stallsPosition[i];

                if (noOfCowPlaced == totalCows) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfStalls = sc.nextInt();
        int noOfCows = sc.nextInt();

        int[] stallsPosition = new int[noOfStalls];
        for (int i = 0; i < stallsPosition.length; i++) {
            stallsPosition[i] = sc.nextInt();
        }
        Arrays.sort(stallsPosition);
        int lo = 0; // min dist b/w two cow = 0
        int hi = stallsPosition[stallsPosition.length - 1]-stallsPosition[0]; // max dist b/w two cow = 8
        int ans = 0;

        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isItPossible(stallsPosition, noOfCows, noOfStalls, mid)) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        System.out.println(ans);
    }
}
/*
5 3
1
2
8
4
9
*/