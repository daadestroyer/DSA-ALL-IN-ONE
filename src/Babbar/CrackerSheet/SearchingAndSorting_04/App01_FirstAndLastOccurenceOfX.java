package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App01_FirstAndLastOccurenceOfX {

    static void firstAndLastOccurenceBruteForce(int[] ar, int element) {
        int first = -1;
        int last = -1;

        for (int i = 0; i < ar.length; i++) {
            if (ar[i] == element && first == -1) {
                first = i;
            }
            if (ar[i] == element) {
                last = i;
            }
        }

        System.out.println(first + " and " + last);
    }

    static int lowerBound(int[] ar, int element) {
        int low = 0;
        int high = ar.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (element == ar[mid]) {
                index = mid;
                high = mid - 1;
            } else if (element > ar[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }

    static int upperBound(int[] ar, int element) {
        int low = 0;
        int high = ar.length - 1;
        int index = -1;
        while (low <= high) {
            int mid = (low + high) / 2;

            if (element == ar[mid]) {
                index = mid;
                low = mid + 1;
            } else if (element > ar[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int s = sc.nextInt();
            int element = sc.nextInt();
            int[] ar = new int[s];

            for (int i = 0; i < ar.length; i++) {
                ar[i] = sc.nextInt();
            }
            //firstAndLastOccurenceBruteForce(ar, element);

            System.out.println(lowerBound(ar, element) + " " + upperBound(ar, element));
        }
    }
}

/*
2
9 5
1 3 5 5 5 5 67 123 125
9 7
1 3 5 5 5 5 7 123 125
*/
