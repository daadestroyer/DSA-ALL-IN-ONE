package Babbar.CrackerSheet.Arrays;

import java.math.*;
import java.util.Scanner;

public class App10_FactorialOfALargeNumber {

    static BigInteger factorialOfALargeNumber(int n) {
        BigInteger f = BigInteger.ONE; // f=1
        for (int i = 1; i <= n; i++) {

            f = f.multiply(BigInteger.valueOf(i)); // f = f * i;
        }
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            System.out.println(factorialOfALargeNumber(n));
        }
    }
}
