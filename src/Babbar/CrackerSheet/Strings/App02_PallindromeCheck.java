package Babbar.CrackerSheet.Strings;

import java.util.Scanner;

public class App02_PallindromeCheck {

    static int isPlaindrome(String S) {
        String str = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            str += S.charAt(i);
        }
        if(str.equals(S))return 1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(isPlaindrome(s));
    }
}
