public class Main {

    private static final String QUEEN = "Q";

    public static void main(String[] args) {
	    // creating board
        String[][] board = createBoard(4);

        printBoard(board);

        placeQueen(board, 0, 1);
        placeQueen(board, 2, 3);
        printBoard(board);
    }

    public static boolean isValid(String[][] board, int row, int col) {
        return checkRow(board, row) && checkColumn(board, col) &&
                checkPosDiagonal(board, row, col) && checkNegDiagonal(board, row, col);
    }

    public static boolean checkRow(String[][] board, int row) {
        for (int i=0; i<board.length; i++) {
            if (board[row][i].equals(QUEEN)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkColumn(String[][] board, int col) {
        for (int i=0; i<board.length; i++) {
            if (board[i][col].equals(QUEEN)) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkPosDiagonal(String[][] board, int row, int col) {
        int line = col + row;

        for (int i=0; i< board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (j+i == line) {
                    if (board[i][j].equals(QUEEN)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static boolean checkNegDiagonal(String[][] board, int row, int col) {
        int line = col - row;
        for (int i=0; i< board.length; i++) {
            for (int j=0; j<board.length; j++) {
                if (j-i == line) {
                    if (board[i][j].equals(QUEEN)) {
                        return false;
                    }
                }

            }
        }
        return true;
    }

    public static String[][] createBoard(int numb) {

        String[][] board = new String[numb][numb];

        for (int i=0; i < board.length; i++) {                  // rows
            for (int j=0; j<board[0].length; j++) {             // columns
                board[i][j] = ".";
            }
        }

        return board;
    }

    public static void printBoard(String[][] board) {

        for (int i=0; i < board.length; i++) {
            for (int j=0; j<board[0].length; j++) {
                if (j != board[0].length-1) {
                    System.out.print(board[i][j] +" | ");
                } else {
                    System.out.println(board[i][j]);
                }
            }
        }
        System.out.print("\n");
    }

    public static void placeQueen(String[][] board, int row, int col) {
        board[row][col] = QUEEN;
    }
}
