package Babbar.PlacementSeries.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App04_ReverseStringInPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        char[] ch = s.toCharArray();

        int lo = 0;
        int hi = ch.length - 1;

        while (lo < hi) {
            char temp = ch[lo];
            ch[lo] = ch[hi];
            ch[hi] = temp;
            lo++;
            hi--;
        }

        for(char c : ch){
            System.out.print(c);
        }
    }
}
