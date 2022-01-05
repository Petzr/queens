public class Solve_Board {

    public static String[][] solveBoard(String[][] board, int n) {

        for (int row=0; row < n; row++) {
            for (int col=0; col < n; col++) {

                if (checkIfPossible(board, row, col)) {
                    Main.placeQueen(board, row, col);
                } else if (col == n-1) {
                    row--;
                }

            }
        }

        return board;
    }

    public static void checkRow(String[][] board, int row, int n) {


    }

    private static boolean checkIfPossible(String[][] board, int row, int col) {

        // checking vertical
        for (int r=0; r<board.length; r++) {
            if (board[r][col].equals("Q")) {
                return false;
            }
        }

        // a - b
        // 0  1  2  3
        //-1  0  1  2
        //-2 -1  0  1
        //-3 -2 -1  0
        int x = col - row;


        // -a - b
        // 0 -1 -2 -3
        //-1 -2 -3 -4
        //-2 -3 -4 -5
        //-3 -4 -5 -6
        x = col + row;

        return true;
    }
}
