public class Main {

    public static void main(String[] args) {
	    // creating board
        String[][] board = createBoard(4);

        printBoard(board);

        placeQueen(board, 3, 3);
        printBoard(board);
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
