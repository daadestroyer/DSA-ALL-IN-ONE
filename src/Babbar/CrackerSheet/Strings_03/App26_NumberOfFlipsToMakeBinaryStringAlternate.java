package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App26_NumberOfFlipsToMakeBinaryStringAlternate {

    static int minFlips(String s) {
        int count = 0;
        int i = 0;
        int j = 1;
        int min = Integer.MAX_VALUE;
        while (j < s.length()) {
            if (Character.getNumericValue(s.charAt(i)) == 0 && Character.getNumericValue(s.charAt(j)) == 0) {
                count++;
            }
            if (Character.getNumericValue(s.charAt(i)) == 1 && Character.getNumericValue(s.charAt(j)) == 1) {
                count++;

                System.out.println(count);
            }
            min = Math.min(min, count);
            System.out.println("min is = " + min);
            i++;
            j++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();


        System.out.println("min count = " + minFlips(s));
    }
}
