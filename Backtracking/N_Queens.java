
public class N_Queens {
    public static void print(char board[][]) {
        System.out.println("---------Chess Board---------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    // utility function to check wether a Queen is attacked by another Queen or not
    // .
    public static boolean isSafe(char board[][], int row, int col) {
        // case of vertical up attack
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q')
                return false;
        }
        // case of attack from upper left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }
        // case of attack from upper right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j <= board.length - 1; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }
        return true;
    }

    public static void NQueen(char board[][], int row) {
        if (row == board.length) {
            print(board);
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                NQueen(board, row + 1);
                // backtracking step
                // removing the queen at the existing place
                board[row][j] = 'x';
            }
        }
    }

    public static void main(String[] args) {
        char board[][] = new char[4][4];
        // initialise the chees board
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = 'x';
            }
        }
        NQueen(board, 0);
    }
}
