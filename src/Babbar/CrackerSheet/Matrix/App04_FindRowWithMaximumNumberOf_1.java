package Babbar.CrackerSheet.Matrix;

import java.util.Scanner;

public class App04_FindRowWithMaximumNumberOf_1 {
    static int rowWithMax1sBruteForce(int arr[][]) {
        int ans = 0;
        int max = 0;
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 1)
                    max++;
            }
            if (max > ans) {
                ans = max;
                res = i;
            }
            max = 0;
        }
        return res;
    }

    static int rowWithMax1sOptimized(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j][i] == 1) {
                    return j;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] matrix = new int[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                matrix[row][col] = sc.nextInt();
            }
        }
//        System.out.println(rowWithMax1sBruteForce(matrix));
        System.out.println(rowWithMax1sOptimized(matrix));
    }
}
/*
4 4
0 1 1 1
0 0 1 1
1 1 1 1
0 0 0 0
2 2
0 0
1 1

*/