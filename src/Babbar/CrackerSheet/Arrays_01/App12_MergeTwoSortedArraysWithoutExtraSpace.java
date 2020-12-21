package Babbar.CrackerSheet.Arrays_01;

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
        for (int i : arr1) {
            System.out.print(i + " ");
        }
        for (int i : arr2) {
            System.out.print(i + " ");
        }

    }

    // Leetcode | Easy 88
    static void mergeTwoSortedArrayLeetcode(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) return;

        int end = nums1.length-1;
        int p1 = m-1;
        int p2 = n-1;

        while(p1>=0 && p2>=0){
            nums1[end--] = nums2[p2] > nums1[p1] ? nums2[p2--] : nums1[p1--];
        }
        while(p2>=0){
            nums1[end--] = nums2[p2--];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
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
        //mergeTwoSortedArrayLeetcode(a1, n, a2, m);
    }
}
/*
4 5
1 3 5 7
0 2 6 8 9

2 3
10 12
5 18 20

3 3
1 2 3
2 5 6
*/