package Babbar.CrackerSheet.Strings;

import java.util.Scanner;

public class App04_OneStringRotationOfAnother {
    static boolean oneStringRotationOfAnother(String s1, String s2) {
        return (s1.length() == s2.length()) && ((s1 + s1).indexOf(s2) != -1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();
        String s2 = sc.next();

        System.out.println(oneStringRotationOfAnother(s1, s2));
    }
}
/*
ABCD
CDAB
--> true

ABCD
ACBD
--> false
*/
