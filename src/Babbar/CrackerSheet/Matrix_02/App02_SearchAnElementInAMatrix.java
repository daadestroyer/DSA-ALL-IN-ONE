package Babbar.CrackerSheet.Matrix_02;

import java.util.Scanner;

public class App02_SearchAnElementInAMatrix {
    static boolean searchMatrixBruteForce(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            System.out.println("hello");
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target)
                    return true;
            }
        }
        return false;
    }

    static boolean searchMatrixOptimizedApproach(int[][] matrix, int target) {
        int i = 0;
        int j = matrix[0].length - 1;

        while (i < matrix.length && j >= 0) {
            if (matrix[i][j] == target) {
                return true;
            }
            if (target < matrix[i][j]) j--; // if target is less than current number move left colom
            else i++; // if target is greater than current number move bottom row
        }
        return false;
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
        int target = sc.nextInt();
        // System.out.println(searchMatrixBruteForce(matrix, target));
        System.out.println(searchMatrixOptimizedApproach(matrix, target));
    }
}
/*
3 4
1 3 5 7
10 11 16 20
23 30 34 50
3


1 2
1 3
3
*/