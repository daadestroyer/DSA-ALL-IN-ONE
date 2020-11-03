package Babbar.CrackerSheet;

import java.util.Scanner;

public class App07_CyclicallyRotateArrayOneByOne {
    static void rotateArray(int[] arr) {
        int temp = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        while (T-- > 0) {
            int S = scanner.nextInt();
            int[] arr = new int[S];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }

            rotateArray(arr);
            for (int i : arr) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
