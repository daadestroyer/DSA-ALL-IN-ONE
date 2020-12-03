package Babbar.CrackerSheet.Strings;

import java.util.Scanner;

public class App01_ReverseString {

    public static void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;
        while (left < right) {
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        reverseString(s.toCharArray());
    }
}
