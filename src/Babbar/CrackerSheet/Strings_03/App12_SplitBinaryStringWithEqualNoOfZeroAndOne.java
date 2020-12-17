package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App12_SplitBinaryStringWithEqualNoOfZeroAndOne {
    public static void main(String[] args) {
        // TC : O(N)  SC : O(1)
        
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int zero = 0;
        int one = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.getNumericValue(s.charAt(i)) == 1)
                one++;
            else
                zero++;

            if (zero == one) count++;

        }
        System.out.println(count);
    }
}
