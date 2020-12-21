package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App24_BookAllocationProblem {

    static boolean isItPossible(int[] pages, int noOfBooks, int noOfStudents, int mid) {
        int students = 1;
        int pagesRead = 0;

        for (int i = 0; i < pages.length; ) {
            if (pagesRead + pages[i] <= mid) {
                pagesRead += pages[i];
                i++;
            } else {
                students++;
                pagesRead = 0;
                if (students > noOfStudents) {
                    return false;
                }
            }
        }

        return true;
    }

    public static int findPages(int[] a, int n, int m) {
        // login
        int lo = 0;
        int hi = 0;
        for (int i : a) {
            hi += i;
        }
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isItPossible(a, n, m, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfBooks = sc.nextInt();
        int noOfStudents = sc.nextInt();

        int[] pages = new int[noOfBooks];
        for (int i = 0; i < pages.length; i++) {
            pages[i] = sc.nextInt();
        }
        System.out.println(findPages(pages, noOfBooks, noOfStudents));

    }
}
/*
4 2
12 34 67 90

3 2
15 17 20
*/