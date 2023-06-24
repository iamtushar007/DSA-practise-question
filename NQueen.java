public class NQueen {

    static boolean isQueenPlacedOnSafeArea(boolean[][] board, int row, int col) {
        // Check-1 Checking on above row
        for (int i = row; i >= 0; i--) {
            if (board[i][col] == true) {
                return false;
            }
        }
        // Check-2 checking for the upper left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // Check-3 Right Diagonal check
        for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }

    static int countNumberofWays(boolean board[][], int currentRow) {
        int count = 0;
        // Termination Case
        if (currentRow == board.length) {
            return 1; // 1 Possibilty at least
        }

        // from the Row (need to traverse each column)
        for (int column = 0; column < board[currentRow].length; column++) {
            // place the queen on column but before placing check if the queen is safe or
            // not
            if (isQueenPlacedOnSafeArea(board, currentRow, column)) {
                board[currentRow][column] = true;// placing the queen on board
                // after placing a queen,move to the next row
                int result = countNumberofWays(board, currentRow + 1);
                count = count + result;
                // Stack Fall (Backtracking)
                board[currentRow][column] = false;
                // Undo the Option
            }
        }
        return count;
    }

    public static void main(String[] args) {
        final int N = 2;
        boolean chessBoard[][] = new boolean[N][N];// All values are filled with false i.e. no queens are placed
        int count = countNumberofWays(chessBoard, 0);
        System.out.println(count);
    }
}
