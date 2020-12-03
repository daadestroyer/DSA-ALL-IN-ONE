package Babbar.CrackerSheet.Strings;

import java.util.Scanner;

public class App20_MobileNumericKeypadSequence {

    static String generateKeypadSequence(String s) {
        StringBuffer output = new StringBuffer();
        String[] keypad = {
                "2", "22", "222",
                "3", "33", "333",
                "4", "44", "444",
                "5", "55", "555",
                "6", "66", "666",
                "7", "77", "777", "7777",
                "8", "88", "888",
                "9", "99", "999", "9999"
        };
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                output.append(0);
            } else {
                int idx = s.charAt(i) - 'A';
                output.append(keypad[idx]);
            }
        }
        return output.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        String s = sc.next();
        System.out.println(generateKeypadSequence(s));
    }
}
