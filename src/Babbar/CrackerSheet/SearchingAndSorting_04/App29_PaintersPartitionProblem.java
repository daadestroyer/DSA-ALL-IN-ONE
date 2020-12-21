package Babbar.CrackerSheet.SearchingAndSorting_04;

import java.util.Scanner;

public class App29_PaintersPartitionProblem {

    static boolean isItPossible(int[] boards,int totalPainter,int noOfBoards,int mid){
        int painter = 1;
        int boardsPainted = 0;

        for(int i=0 ; i<boards.length ;){
            if(boardsPainted+boards[i]<=mid){
                boardsPainted+=boards[i];
                i++;
            }
            else{
                painter++;
                boardsPainted=0;
                if(painter>totalPainter){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfPainter = sc.nextInt();
        int noOfBoards = sc.nextInt();

        int hi = 0;
        int[] boards = new int[noOfBoards];
        for (int i = 0; i < boards.length; i++) {
            boards[i] = sc.nextInt();
            hi += boards[i];
        }

        int lo = 0;
        int ans = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (isItPossible(boards, noOfPainter, noOfBoards, mid)) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        System.out.println(ans);

    }

}
/*
2 4
10 10 10 10

2 4
10 20 30 40

*/