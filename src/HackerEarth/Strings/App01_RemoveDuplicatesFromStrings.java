package HackerEarth.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App01_RemoveDuplicatesFromStrings {
    static void removeDuplicates(String S) {
        int[] count = new int[26];
        char[] ch = S.toCharArray();

        for (char c : ch) {
            count[c - 97]++;
        }
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < ch.length; i++) {
            char chr = ch[i];
            int idx = chr-97;
            if(count[idx]>0){
                sb.append(chr);
                count[idx] = 0;
            }
        }

        S = sb.toString();
        System.out.println(S);
    }

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        removeDuplicates(S);

    }
}
