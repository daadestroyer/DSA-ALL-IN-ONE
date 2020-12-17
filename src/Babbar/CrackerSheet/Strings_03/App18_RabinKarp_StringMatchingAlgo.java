package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App18_RabinKarp_StringMatchingAlgo {

    static int prime = 119;

    // TC : O(N)
    static long createHashValue(String s, int n) {
        long result = 0;
        for (int i = 0; i < n; i++) {
            result += Character.getNumericValue(s.charAt(i)) * Math.pow(prime, i);
        }
        return result;
    }

    static long removeFirstHashValue(String s, int oldIndex, int newIndex, long oldHashValue, int patternLength) {
        // first subtract the ASCII of the first character of old String
        long newHash = oldHashValue - Character.getNumericValue(s.charAt(oldIndex));

        // then divided the whole hash with the given prime number
        newHash /= prime;

        // then add the power of prime in newHash
        newHash += Character.getNumericValue(s.charAt(newIndex)) * Math.pow(prime, patternLength - 1);
        return newHash;
    }

    static boolean checkEqual(String s1, String s2, int start1, int end1, int start2, int end2) {
        if (end1 - start1 != end2 - start2) {
            return false;
        }
        while (start1 <= end1 && start2 <= end2) {
            if (s1.charAt(start1) != s2.charAt(start2)) {
                return false;
            }
            start1++;
            start2++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        String pattern = sc.next();


        long patternHash = createHashValue(pattern, pattern.length());
        long stringHash = createHashValue(string, pattern.length()); // checking first 3 substring

        for (int i = 0; i < string.length() - pattern.length(); i++) {
            if (patternHash == stringHash && checkEqual(string, pattern, i,  i+pattern.length() - 1, 0, pattern.length() - 1)) {
                System.out.println(i);
            }
            if (i < string.length() - pattern.length()) {
                stringHash = removeFirstHashValue(string, i, i + pattern.length(), stringHash, pattern.length());
            }
        }
    }
}
/*
GEEKSFORGEEKS
GEEK

*/