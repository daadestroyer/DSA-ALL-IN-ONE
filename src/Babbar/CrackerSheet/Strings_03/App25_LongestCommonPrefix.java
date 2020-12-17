package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class     App25_LongestCommonPrefix {
    static String longestCommonPrefix(String[] str) {
        if (str.length == 0 || str == null) return "";

        return longestCommonPrefix(str, 0, str.length - 1);
    }

    static String longestCommonPrefix(String[] str, int left, int right) {
        if (left == right) {
            return str[left];
        } else {
            int mid = (left + right) / 2;
            String lcpL = longestCommonPrefix(str, left, mid);
            String lcpR = longestCommonPrefix(str, mid + 1, right);

            return commonPrefix(lcpL, lcpR);
        }
    }

    static String commonPrefix(String left, String right) {
        int min = Math.min(left.length(), right.length());

        for (int i = 0; i < min; i++) {
            if (left.charAt(i) != right.charAt(i)) {
                return left.substring(0, i);
            }
        }
        return left.substring(0, min);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String[] str = new String[s];
        for (int i = 0; i < str.length; i++) {
            str[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(str));
    }
}
/*
4
leetcode leet lee le
3
flower flow flight

3
dog racecar car



*/