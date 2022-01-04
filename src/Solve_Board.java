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

        // a - b
        // 0  1  2  3
        //-1  0 -2 -3
        //-2 -1  0  1
        //-3 -2 -1  0

        // -a - b
        // 0 -1 -2 -3
        //-1 -2 -3 -4
        //-2 -3 -4 -5
        //-3 -4 -5 -6

        return true;
    }
}
