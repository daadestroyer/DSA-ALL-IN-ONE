package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App05_MiddleOfThree {
    static int middle(int A, int B, int C) {
        int min1 = Math.min(A, B);
        int min2 = Math.min(B, C);
        int finalmin = Math.max(min1, min2);
        return finalmin;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(middle(a,b,c));
    }
}
/*
978 518 300
162 934 200
*/