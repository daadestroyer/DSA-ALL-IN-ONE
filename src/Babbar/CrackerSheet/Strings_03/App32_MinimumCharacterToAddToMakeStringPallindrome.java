package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App32_MinimumCharacterToAddToMakeStringPallindrome {

    static boolean checkPallindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (s.charAt(i) != s.charAt(j)) return false;

            i++;j--;
        }
        return true;
    }

    static int minimumCharacterAdd(String s) {
        int flag = 0;
        int cnt = 0;

        while (s.length() > 0) {
            if (checkPallindrome(s)) {
                flag = 1;
                break;
            } else {
                cnt++;
                s = s.substring(0, s.length() - 1);
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(minimumCharacterAdd(s));
    }
}
/*
ABC
2

AACECAAAA
2

BABABAA
2
*/