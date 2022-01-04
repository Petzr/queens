public class Main {

    public static void main(String[] args) {
	    // creating board
        String[] board = createBoard(4);
    }

    public static String[] createBoard(int numb) {
        String[] board = new String[numb];

        for (int i=0; i < board.length; i++) {
            board[i] = ".";
        }

        return board;
    }
}
