package Babbar.CrackerSheet.Matrix_02;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App10_CommonElementsInAllRowsOfAGivenMatrix {

    static void printCommonElements(int mat[][], int M, int N) {

        Map<Integer, Integer> mp = new HashMap<>();

        // initalize 1st row elements with value 1
        for (int j = 0; j < N; j++)
            mp.put(mat[0][j], 1);

        // traverse the matrix
        for (int i = 1; i < M; i++) {
            for (int j = 0; j < N; j++) {
                // If element is present in the map and
                // is not duplicated in current row.
                if (mp.containsKey(mat[i][j]) && mp.get(mat[i][j]) == i) {
                    // increment count of the element in map by 1
                    mp.put(mat[i][j], i + 1);
                    if (i == M - 1) {

                        System.out.print(mat[i][j]+" ");
                    }
                }
            }
        }
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        for (int row = 0; row < r; row++) {
            for (int col = 0; col < c; col++) {
                mat[row][col] = sc.nextInt();
            }
        }

         printCommonElements(mat, r, c);
    }

}
/*
4 5
1 2 1 4 8
3 7 8 5 1
8 7 7 3 1
8 1 2 7 9


*/