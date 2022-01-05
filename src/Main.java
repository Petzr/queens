public class Main {

    public static void main(String[] args) {

        int n = 4;
	    // creating board
        String[][] board = createBoard(n);

        printBoard(board);

        placeQueen(board, 0, 2);
        printBoard(Solve_Board.solveBoard(board, n));
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
        board[row][col] = "Q";
    }
}
