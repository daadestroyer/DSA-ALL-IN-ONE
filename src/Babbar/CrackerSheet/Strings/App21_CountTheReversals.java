package Babbar.CrackerSheet.Strings;

import java.util.Scanner;
import java.util.Stack;

public class App21_CountTheReversals {
    static double countTheReversals(String s) {
        if (s.length() % 2 != 0) return -1;


        Stack<Character> stack = new Stack<>();
        int open = 0, close = 0;
        for (char ch : s.toCharArray()) {
            if (ch == '}' && !stack.isEmpty()) {
                if (stack.peek() == '{') {
                    stack.pop();
                } else {
                    stack.push(ch);
                }
            } else {
                stack.push(ch);
            }
        }

        System.out.println(stack);
        while (!stack.isEmpty()) {
            char ch = stack.pop();
            if (ch == '{') open++;
            else close++;
        }
        System.out.println("open = "+open+" close = "+close);
        return (close / 2 + open / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        int t = sc.nextInt();
//        while (t-- > 0) {
//            String s = sc.next();
//            int res = (int) countTheReversals(s);
//            System.out.println(res);
//        }

        System.out.println((3/2 + 1/2));
    }
}
