package Babbar.CrackerSheet.Strings_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App30_SmallestWindowThatContainAllCharacter {

    static int smallestWindow(String s) {
        int len = 0;
        List<Character> list = new ArrayList<>();
        for (char c : s.toCharArray()) {
            if (!list.contains(c)) {
                list.add(c);
            }
        }
        int size = list.size();
        int start = 0;




        return size;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            System.out.println(smallestWindow(s));
        }
    }
}
