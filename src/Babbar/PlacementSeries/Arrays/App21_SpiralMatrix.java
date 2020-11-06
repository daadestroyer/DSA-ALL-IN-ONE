package Babbar.PlacementSeries.Arrays;

import java.util.Scanner;

public class App21_SpiralMatrix {
    static void spirtalMatrix(int[][] arr) {
        int top = 0;
        int bottom = arr.length - 1;
        int left = 0;
        int right = arr[top].length - 1;
        int dir = 1;
        int count = (bottom + 1) * (right + 1);

        while (left <= right && top <= bottom) {
            if (count > 0) {
                if (dir == 1) {
                    for (int i = left; i <= right; i++) {
                        System.out.print(arr[top][i] + " ");
                        count--;
                    }
                    dir = 2;
                    top++;
                }
            }

            if (count > 0) {
                if (dir == 2) {
                    for (int i = top; i <= bottom; i++) {
                        System.out.print(arr[i][right] + " ");
                        count--;
                    }
                    dir = 3;
                    right--;
                }
            }
            if (count > 0) {

                if (dir == 3) {
                    for (int i = right; i >= left; i--) {
                        System.out.print(arr[bottom][i] + " ");
                        count--;
                    }
                    dir = 4;
                    bottom--;
                }
            }
            if (count > 0) {
                if (dir == 4) {
                    for (int i = bottom; i >= top; i--) {
                        System.out.print(arr[i][left] + " ");
                        count--;
                    }
                    dir = 1;
                    left++;
                }
            }

        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int R = sc.nextInt();
            int C = sc.nextInt();


            int[][] matrix = new int[R][C];
            for (int row = 0; row < R; row++) {
                for (int col = 0; col < C; col++) {
                    matrix[row][col] = sc.nextInt();
                }
            }
            spirtalMatrix(matrix);
            System.out.println();

        }

    }
}
