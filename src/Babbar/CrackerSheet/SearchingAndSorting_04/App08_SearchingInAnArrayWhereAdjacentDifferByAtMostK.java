package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App08_SearchingInAnArrayWhereAdjacentDifferByAtMostK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] ar = new int[s];
        for (int i = 0; i < ar.length; i++) {
            ar[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < ar.length; i++) {
            if(ar[i] == x){
                System.out.println(i);
                break;
            }
        }
    }
}
/*
5
4 5 6 7 6
1 6

6
20 40 50 70 70 60
20 60
*/
