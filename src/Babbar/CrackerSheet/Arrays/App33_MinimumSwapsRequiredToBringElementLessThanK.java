package Babbar.CrackerSheet.Arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
1. Find count of all elements which are less than or equals to ‘k’. Let’s say the count is ‘cnt’
2. Using two pointer technique for window of length ‘cnt’, each time keep track of how many elements in this range are greater than ‘k’.
   Let’s say the total count is ‘bad’.
3. Repeat step 2, for every window of length ‘cnt’ and take minimum of count ‘bad’ among them. This will be the final answer.
*/
public class App33_MinimumSwapsRequiredToBringElementLessThanK {

    static int minimumSwapRequiredToBringElementLessThanK(int[] ar, int k) {
        int good = 0;
        for (int i : ar) {
            if (i <= k) {
                good++;
            }
        }

        int bad = 0;
        for (int i = 0; i < good; i++) {
            if (ar[i] > k) {
                bad++;
            }
        }

        int ans = bad;

        for (int i = 0, j = good; j < ar.length; i++, j++) {
            if (ar[i] > k) {
                --bad;
            }
            if (ar[j] > k) {
                ++bad;
            }
            ans = Math.min(ans, bad);
        }


        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int[] ar = new int[S];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        System.out.println(minimumSwapRequiredToBringElementLessThanK(ar, k));

    }
}
/*
7
2 7 9 5 8 7 4
6
*/