package Babbar.CrackerSheet.Strings_03;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class App03_FindDuplicateCharactersInString {
    // TC : O(NlogN)sorting + O(N)traversing  SC : O(1)
    static void removeDuplicateCharacterBruteForce(String S) {
        char[] ch = S.toCharArray();
        String str = "";
        Arrays.sort(ch);
        int i = 0;
        int j = 1;

        while (j < ch.length) {
            if (ch[i] == ch[j]) {
                i++;
                j++;
            } else {
                str += ch[i];
                i++;
                j++;
            }
        }
        str += (ch[ch.length - 1]);

        S = str.trim();
        System.out.println(S);
    }

    // TC : O(N)   SC : O(N)
    static void removeDuplicatesOptimizedApproach(String S) {
        LinkedHashSet<Character> lhs = new LinkedHashSet<>();
        String str = "";
        for (int i = 0; i < S.length(); i++) {
            lhs.add(S.charAt(i));
        }
        Iterator itr = lhs.iterator();
        while (itr.hasNext()) {
            str += itr.next();
        }
        S = str;
        System.out.println(S);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        //removeDuplicateCharacterBruteForce(S);
        removeDuplicatesOptimizedApproach(S);
    }
}

/*
abcbded
--> bd

geeksforgeeks
--> efgkors

abcbdafgfi
--> abcdfgi
*/