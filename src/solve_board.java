public class solve_board {

    public static String[][] solveBoard(String[][] board) {

        for (int row=0; row<board.length; row++){
            for (int col=0; col<board[0].length; col++) {

                if (isEmpty(board[row][col])) {
                    if (checkIfPossible(board, row, col)) {
                        board[row][col] = "Q";
                    }
                }
            }
        }

        return board;
    }

    public static boolean isEmpty(String board) {
        return !board.equals("Q");
    }

    public static boolean checkIfPossible(String[][] board, int row, int col) {

        for (int c=0; c<board.length; c++) {
            if (board[row][c].equals("Q")) {
                return false;
            }
        }
        for (int r=0; r<board.length; r++) {
            if (board[r][col].equals("Q")) {
                return false;
            }
        }

        return true;
    }
}
