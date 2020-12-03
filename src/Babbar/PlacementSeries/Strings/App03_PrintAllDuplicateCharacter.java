package Babbar.PlacementSeries.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App03_PrintAllDuplicateCharacter {

    // TC : O(N)  | SC : O(N)
    static void duplicateCharacter(String S) {
        int[] count = new int[26];

        for (char ch : S.toCharArray()) {
            count[ch - 97]++;
        }

        for (int i = 0; i < count.length; i++) {
            int num = count[i];
            if (num > 1) {
                System.out.print((char)(i+97)+" ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        duplicateCharacter(str);
    }
}
