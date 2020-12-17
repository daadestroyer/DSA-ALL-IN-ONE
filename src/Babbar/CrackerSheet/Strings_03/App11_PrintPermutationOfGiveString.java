package Babbar.CrackerSheet.Strings_03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App11_PrintPermutationOfGiveString {
    static ArrayList<String> getPermutation(String str) {
        if (str.length() == 0) {
            ArrayList<String> base_case = new ArrayList<String>();
            base_case.add("");
            return base_case;
        }
        char current_char = str.charAt(0);
        String rest_of_string = str.substring(1);

        ArrayList<String> rec_res = getPermutation(rest_of_string);
        ArrayList<String> my_result = new ArrayList<String>();

        for (String s : rec_res) {
            for (int i = 0; i <= s.length(); i++) {
                String val = s.substring(0, i) + current_char + s.substring(i);
                my_result.add(val);
            }
        }
        Collections.sort(my_result);
        return my_result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            String str = sc.next();
            ArrayList<String> res = getPermutation(str);
            for(String string : res) {
                System.out.print(string+" ");
            }
            System.out.println();
        }
    }
}
