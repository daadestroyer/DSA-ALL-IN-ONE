package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App07_MajorityElement {
    static int majorityElement(int a[], int size) {
        int not = size / 2;
        boolean flag = false;
        int[] count = new int[1000001];

        for (int i = 0; i < a.length; i++) {
            int no = a[i];
            count[no]++;

            if (count[no] > not && flag == false) {
                return no;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        System.out.println(majorityElement(ar, ar.length));
    }
}
