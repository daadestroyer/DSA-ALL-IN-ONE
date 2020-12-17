package Babbar.CrackerSheet.Matrix_02;

import java.util.ArrayList;
import java.util.Scanner;

public class App01_SpiralTraverseOnAMatrix {
    static ArrayList<Integer> spiralPrint(int[][] matrix, int r, int c) {
        int top = 0;
        int left = 0;
        int right = matrix[top].length - 1;
        int bottom = matrix.length - 1;
        int count = (bottom + 1) * (right + 1);
        int dir = 1;
        ArrayList<Integer> list = new ArrayList<>();

        while (left <= right && top <= bottom) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = left; i <= right; i++) {
                        list.add((matrix[top][i]));
                        count--;
                    }
                }
                dir = 2;
                top++;
            }
            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        list.add((matrix[i][right]));
                        count--;
                    }
                }
                dir = 3;
                right--;
            }
            if (count > 0) {
                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        list.add((matrix[bottom][i]));
                        count--;
                    }
                }
                dir = 4;
                bottom--;
            }
            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        list.add((matrix[i][left]));
                        count--;
                    }
                }
                dir = 1;
                left++;
            }
        }
        return list;
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
        System.out.println(spiralPrint(matrix, r, c));

    }
}
/*
4 4
1 2 3 4
5 6 7 8
9 10 11 12
13 14 15 16
3 5
6 6 2 28 2
12 26 3 28 7
22 25 3 4 23

*/
