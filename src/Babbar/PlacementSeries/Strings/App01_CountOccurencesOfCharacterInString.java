package Babbar.PlacementSeries.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App01_CountOccurencesOfCharacterInString {

    // Brute Force : TC : O(N)^ | SC : O(N)

    // Optimized Solution is to use hashmap
    static void getOccuringChar(String str) {
        int[] count = new int[26];


        for (char ch : str.toCharArray()) {
            count[ch - 97]++;
        }

        char[] ch = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            int find = 0;

            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == ch[j]) {
                    find++;
                }
            }
            if (find == 1) {
                System.out.println("Number of occurrences of " + str.charAt(i) + " = " + count[ch[i] - 97]);

            }
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        getOccuringChar(str);
    }
}
/*


 */