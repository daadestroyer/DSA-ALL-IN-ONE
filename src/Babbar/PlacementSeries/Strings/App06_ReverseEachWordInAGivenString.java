package Babbar.PlacementSeries.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App06_ReverseEachWordInAGivenString {


    static String reverseEachWord(String s) {
        String[] arr = s.split(" ");
        String revString = "";

        for (String S : arr) {
            String revWord = "";

            for (int i = S.length() - 1; i >= 0; i--) {
                revWord += S.charAt(i);
            }
            revString += revWord + " ";
        }

        s = revString;
        return s.trim();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s + " " + s.length());
        String ans = reverseEachWord(s);
        System.out.println(ans + " " + ans.length());
    }
}
