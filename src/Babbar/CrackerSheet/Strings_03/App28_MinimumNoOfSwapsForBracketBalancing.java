package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App28_MinimumNoOfSwapsForBracketBalancing {

    static int minimumNoOfSwaps(String s) {
        int bracket = 0;
        int imb = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '[') {
                ++bracket;


            } else if (ch == ']' && bracket > 0) {
                --bracket;

            } else if (ch == ']' && bracket == 0) {

                ++imb;

            }
        }

        return imb + bracket;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(minimumNoOfSwaps(s));

        }
    }
}
/*
[]][][
[[][]]

 */