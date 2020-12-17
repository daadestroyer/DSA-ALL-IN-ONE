package Babbar.CrackerSheet.Strings_03;

import java.util.Scanner;

public class App22_WordSearch_Backtracking {

    public static boolean searchWord(char[][] board, int row, int col, int count, String word) {
        if (count == word.length()) return true;

        if (row == -1 || row >= board.length || col == -1 || col == board[0].length || board[row][col] != word.charAt(count)) {
            return false;
        }

        char temp = board[row][col];
        board[row][col] = '*';
        boolean found = searchWord(board, row + 1, col, count + 1, word) ||  // vertical downward call
                searchWord(board, row - 1, col, count + 1, word) ||  // vertical upward call
                searchWord(board, row, col + 1, count + 1, word) || // horizontal right call
                searchWord(board, row, col - 1, count + 1, word);    // horizontal lefts call

        board[row][col] = temp;

        return found;
    }

    public static boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if ((board[i][j] == word.charAt(0)) && searchWord(board, i, j, 0, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();


        char[][] board = new char[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        String word = sc.next();
        System.out.println(exist(board, word));
    }
}
/*
3 4
A B C E
S F C S
A D E E
ABCCED

3 4
A B C E
S F C S
A D E E
SEE

3 4
A B C E
S F C S
A D E E
ABCB

3 13
G E E K S F O R G E E K S
G E E K S Q U I Z G E E K
I D E Q A P R A C T I C E
G E E K S
*/
