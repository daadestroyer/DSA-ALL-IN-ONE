package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;
import java.util.Stack;

public class App16_BalancedParanthesis {

    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < x.length(); i++) {
            if (x.charAt(i) == '(' || x.charAt(i) == '{' || x.charAt(i) == '[') {
                stack.push(x.charAt(i));
            } else if (x.charAt(i) == ')' || x.charAt(i) == '}' || x.charAt(i) == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (x.charAt(i) == ')') {
                    if (stack.peek() == '(') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (x.charAt(i) == '}') {
                    if (stack.peek() == '{') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
                if (x.charAt(i) == ']') {
                    if (stack.peek() == '[') {
                        stack.pop();
                    } else {
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty() ? true : false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        System.out.println(ispar(s));
    }
}
/*
{(-)} BALANCE
(((-))) BALANCE
{[-]+(-)} BALANCE
{[} NOT BALANCE
*/