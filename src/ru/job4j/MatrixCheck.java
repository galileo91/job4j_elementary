package ru.job4j;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int i=0; i < board[row].length; i++) {
            if (board[row][i] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int i = 0; i < board.length; i++) {
            if (board[i][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int i = 0; i < board.length; i++) {
            rsl[i] = board[i][i];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int i = 0; i < board.length; i++) {
            if (board[i][i] == 'X' && (
                    (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X' && board[3][i] == 'X' && board[4][i] == 'X')
                    || (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X' && board[i][3] == 'X' && board[i][4] == 'X'))) {
                result = true;
                break;
            }
        }
        return result;
    }
}
