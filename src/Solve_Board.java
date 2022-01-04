public class Solve_Board {

    public static String[][] solveBoard(String[][] board) {

        for (int row=0; row<board.length; row++) {
            for (int col=0; col<board[row].length; col++) {

                if (checkIfPossible(board, row, col)) {
                    Main.placeQueen(board, row, col);
                }

            }
        }


        return board;
    }

    private static boolean checkIfPossible(String[][] board, int row, int col) {

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
