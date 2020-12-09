package Babbar.CrackerSheet.Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App27_FindTheSecongMostRepeatedWordInAString {

    static String repeatedWord(String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String S : arr) {
            if (map.containsKey(S)) {
                map.put(S, map.get(S) + 1);
            } else {
                map.put(S, 1);
            }
        }

        int maxidx = 0;
        int mindix = 0;
        String ans = "";
        for (Map.Entry<String, Integer> hm : map.entrySet()) {
            if (hm.getValue() > maxidx) {
                mindix = maxidx;
                maxidx = hm.getValue();
            }
            else if (hm.getValue()>mindix){
                mindix = hm.getValue();
            }

        }
        for (Map.Entry<String, Integer> hm : map.entrySet()) {
            if(hm.getValue()==mindix){
                ans = hm.getKey();
                break;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String[] ar = new String[s];

        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.next();
        }
        System.out.println(repeatedWord(ar));
    }
}
/*
6
aaa bbb ccc bbb aaa aaa

6
geek for geek for geek aaa

7
ghi ghi aaa ghi ghi ghi ghi
*/
