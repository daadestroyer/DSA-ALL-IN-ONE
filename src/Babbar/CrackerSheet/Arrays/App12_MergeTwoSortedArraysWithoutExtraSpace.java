package Babbar.CrackerSheet.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class App12_MergeTwoSortedArraysWithoutExtraSpace {

    static class FastScanner {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer("");

        public String next() {
            while (!st.hasMoreTokens())
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            return st.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            try {
                return br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return null;
        }

        public boolean hasNext() {
            String next = null;
            try {
                next = br.readLine();
            } catch (Exception e) {
            }
            if (next == null) {
                return false;
            }
            st = new StringTokenizer(next);
            return true;
        }
    }
    // BRUTE FORCE APPROACH
    static void mergeArrayBruteForce(int[] arr1, int[] arr2) {

        int[] temp = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;

        for (int k = 0; k < temp.length; k++) {
            if (i < arr1.length && j < arr2.length) {
                if (arr1[i] > arr2[j]) {
                    temp[k] = arr2[j];

                    j++;
                } else {
                    temp[k] = arr1[i];

                    i++;
                }
            } else {
                if (i == arr1.length) {
                    temp[k] = arr2[j];

                    j++;
                } else {
                    temp[k] = arr1[i];
                    i++;

                }
            }

        }
        // 0 1 2 3  5 6 7 8 9
        i = 0;
        j = 0;

        for (int k = 0; k < temp.length; ) {
            while (i < arr1.length) {
                arr1[i] = temp[k];

                i++;
                k++;
            }
            while (j < arr2.length) {
                arr2[j] = temp[k];

                j++;
                k++;
            }
        }


        for (int i1 : arr1) {
            System.out.print(i1 + " ");
        }
        for (int i1 : arr2) {
            System.out.print(i1 + " ");
        }
    }

    // OPTIMIZED APPROACH
    static void mergeArrayOptimizedApproach(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[0]) {
                int t = arr1[i];
                arr1[i] = arr2[0];
                arr2[0] = t;


                int firstElement = arr2[0];
                int k;
                for (k = 1; k < arr2.length && arr2[k] < firstElement; k++) {
                    arr2[k - 1] = arr2[k];
                }
                arr2[k - 1] = firstElement;

            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

    }

    public static void main(String[] args) {
        FastScanner sc = new FastScanner();
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] a1 = new int[n];
        int[] a2 = new int[m];

        for (int i = 0; i < a1.length; i++) {
            a1[i] = sc.nextInt();
        }
        for (int i = 0; i < a2.length; i++) {
            a2[i] = sc.nextInt();
        }
        // mergeArrayBruteForce(a1, a2);
        mergeArrayOptimizedApproach(a1, a2);
    }
}
