package Babbar.CrackerSheet.Strings_03;

import java.util.ArrayList;
import java.util.Scanner;

public class App10_SubSequencesOfGivenString {

    static ArrayList<String> getSubSeq(String str) {

        if (str.length() == 0) {
            ArrayList<String> basecase = new ArrayList<String>();
            basecase.add("");
            return basecase;
        }

        char current_char = str.charAt(0);
        String rest_Of_String = str.substring(1);

        ArrayList<String> res = new ArrayList<String>();
        ArrayList<String> rec_res = getSubSeq(rest_Of_String);

        for (String val : rec_res) {
            if (!res.contains(val)) res.add(val);
            res.add(current_char + val);
        }

        return res;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        ArrayList<String> list = getSubSeq(s);
        list.remove("");
        for(String str : list){
            System.out.print(str+" ");
        }


    }
}
