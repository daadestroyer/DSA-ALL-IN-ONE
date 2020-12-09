package Babbar.CrackerSheet.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App23_BoyersMoorePatternSearchingAlgo {

    static void badCharHerustic(char[] str, int size, int badchar[]) {
        for (int i = 0; i < badchar.length; i++) {
            badchar[i] = -1;
        }
        for (int i = 0; i < size; i++) {
            badchar[(int) str[i]] = i;
        }
        System.out.println(Arrays.toString(badchar));
    }

    static void search(char[] text, char[] pat) {
        int m = pat.length;
        int n = text.length;

        int badchar[] = new int[256];
        badCharHerustic(pat, m, badchar);
    }

    public static void main(String[] args) {
        char[] txt = "ABAAABCD".toCharArray();
        char[] pat = "ABC".toCharArray();
        search(txt, pat);
    }
}
