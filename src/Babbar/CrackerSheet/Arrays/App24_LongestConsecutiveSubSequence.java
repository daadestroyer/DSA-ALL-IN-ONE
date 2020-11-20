package Babbar.CrackerSheet.Arrays;

import java.util.HashSet;
import java.util.Scanner;

public class App24_LongestConsecutiveSubSequence {
    public static void main(String[] args) {
        /* Brute Force : TC-> O(nLogn) : SC-> O(1)
        // --------------------------------------
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();

        int[] a = new int[S];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a); // NLog(N)

        int count = 0;
        int ans = 0;


        // 1 2 3 4 7 8 9
        for (int i = 0; i < a.length - 1; i++) {
            if (i > 0 && (a[i] == a[i - 1] + 1)) {
                count++;
            } else {
                count = 1;
            }
            ans = Math.max(ans, count);
        }
        System.out.println(ans);

    }
    */

        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        HashSet<Integer> set = new HashSet<>();
        int[] a = new int[S];
        for (int i = 0; i < S; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        int len = 0;
        int ans = 0;

        for (int i : a) {
            if(!set.contains(i-1)){
                int curr_num = i;
                len= 1;

                while (set.contains(curr_num+1)){
                    curr_num+=1;
                    len++;
                }
            }
            ans = Math.max(ans,len);
        }
        System.out.println(ans);

    }
}
