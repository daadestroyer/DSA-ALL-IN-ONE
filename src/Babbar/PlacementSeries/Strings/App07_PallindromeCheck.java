package Babbar.PlacementSeries.Strings;

import java.util.Scanner;

public class App07_PallindromeCheck {

    static String pallindromeCheck(String str) {
        String revString = "";
        int i = str.length() - 1;

        while (i >= 0) {
            revString += str.charAt(i);
            i--;

        }
        if (revString.equals(str)) return "YES";
        return "NO";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(pallindromeCheck(str));
    }

}
