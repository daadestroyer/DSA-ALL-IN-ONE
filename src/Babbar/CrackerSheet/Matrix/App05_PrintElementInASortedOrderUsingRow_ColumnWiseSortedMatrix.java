package Babbar.CrackerSheet.Matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class App05_PrintElementInASortedOrderUsingRow_ColumnWiseSortedMatrix {

    static void printElement(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(matrix[0][0]);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                int num = matrix[i][j];
                if (num > list.get(list.size() - 1)) {
                    list.add(num);
                } else {
                    list.add(0, num);
                }
            }
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] matrix = new int[n][n];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = sc.nextInt();
                }
            }
            printElement(matrix);
            System.out.println();
        }
    }
}

/*
4
10 20 30 40
15 25 35 45
27 29 37 48
32 33 39 50 --> 10 15 20 25 27 29 30 32 33 35 37 39 40 45 48 50

3
1 3 4
2 6 7
5 8 9
*/