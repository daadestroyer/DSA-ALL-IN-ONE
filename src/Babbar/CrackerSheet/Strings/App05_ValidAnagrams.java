package Babbar.CrackerSheet.Strings;

import java.util.Arrays;
import java.util.Scanner;

public class App05_ValidAnagrams {
    // TC : O(N)^ SC : O(1)
    static boolean isAnagramBruteForce(String a, String b) {
        boolean[] visited = new boolean[b.length()];
        boolean isAnagram = false;

        if (a.length() == b.length()) {
            for (int i = 0; i < a.length(); i++) {
                char ch = a.charAt(i);
                isAnagram = false;
                for (int j = 0; j < b.length(); j++) {
                    if (b.charAt(j) == ch && !visited[j]) {
                        isAnagram = true;
                        visited[j] = true;
                        break;
                    }
                }
                if (!isAnagram) {
                    break;
                }
            }
        }
        if (isAnagram) return true;
        else return false;
    }

    static boolean isAnagramOptimizedLevel1(String a, String b) {
        if ((a.length() == 0) && (b.length() == 0)) return true;
        char[] c1 = a.toCharArray();
        char[] c2 = b.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        boolean isAnagram = Arrays.equals(c1, c2);
        return isAnagram;
    }

    static boolean isAnagramMostOptimized(String a, String b) {
        if( (a.length() ==0) && (b.length() == 0))return true;
        int[] count = new int[256];
        boolean isAnagram = true;
        for (char ch : a.toCharArray()) {
            int idx = (int) ch;
            count[idx]++;
        }

        for (char ch : b.toCharArray()) {
            int idx = (int) ch;
            count[idx]--;
        }

        for (int i : count) {
            if(i!=0){
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        // System.out.println(isAnagramBruteForce(a, b));
        // System.out.println(isAnagramOptimizedLevel1(a, b));
        System.out.println(isAnagramMostOptimized(a,b));
    }
}
