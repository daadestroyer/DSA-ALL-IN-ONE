package Babbar.CrackerSheet.Strings_03;

import java.util.*;

public class App33_PrintAnagramsTogether {

    static List<List<String>> groupAnagrams(String[] words) {
        HashMap<String, List<String>> hm = new HashMap<>();

        for (String s : words) {
            char[] ch = s.toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);

            if (!hm.containsKey(sorted))
                hm.put(sorted, new ArrayList<String>());
            hm.get(sorted).add(s);

        }
        return new ArrayList<>(hm.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        String[] words = new String[s];
        for (int i = 0; i < words.length; i++) {
            words[i] = sc.next();
        }

        List<List<String>> l = groupAnagrams(words);
        for (List<String> s1 : l) {
            System.out.println(s1);
        }
    }
}
/*
5
act god cat dog tac
*/