package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App34_RecursivelyRemoveAllAdjacentDuplicates {

    static String removeDuplicates(String ques, String ans) {
        if (ques.length() == 0) {
            return ans;
        }
        char cc = ques.charAt(0);
        String ros = ques.substring(1);

        if (ans.length() > 0) {
            if (cc == ans.charAt(ans.length() - 1)) {
                return removeDuplicates(ros, ans);
            }
        }
        return removeDuplicates(ros, ans + cc);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(removeDuplicates(s, ""));
        }
    }
}
