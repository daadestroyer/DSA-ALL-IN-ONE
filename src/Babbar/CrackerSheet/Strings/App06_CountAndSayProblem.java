package Babbar.CrackerSheet.Strings;

import java.util.Scanner;

public class App06_CountAndSayProblem {

    static String countAndSay(int n) {
        if (n == 1) return "1";
        String ans = "1";

        for (int i = 2; i <= n; i++) {
            ans = count(ans);
        }
        return ans;
    }

    static String count(String s) {
        char ch = s.charAt(0);
        int count = 1;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                sb.append(count).append(ch);
                ch = s.charAt(i);
                count = 1;
            }
            else{
                count++;
            }
        }
        sb.append(count).append(ch);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countAndSay(n));
    }
}
/*
3322251
*/