package Babbar.CrackerSheet.Arrays_01;

import java.util.Scanner;

public class App34_PallindromicArray {
    static boolean checkPallindromic(int S) {
        String s = Integer.toString(S);
        int i = 0;
        int j = s.length() - 1;

        while (i <= j) {
            if (Character.getNumericValue(s.charAt(i)) != Character.getNumericValue(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    static int pallindromicArray(int[] a) {

        for (int i : a) {
            boolean flag = checkPallindromic(i);
            if (!flag) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int S = sc.nextInt();
            int[] ar = new int[S];
            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            System.out.println(pallindromicArray(ar));
        }
    }
}
