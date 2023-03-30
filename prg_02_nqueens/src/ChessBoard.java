/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s): Caleb Thompson
 * Description: Prg 02 - ChessBoard
 */

public class ChessBoard {

    private boolean board[][];
    private static final int MIN_SIZE = 4;
    private static final int DEFAULT_SIZE = 8;
    private static final int MAX_SIZE = 15;

    // TODOd #1: properly initialize a chess board, making sure that its size is in [MIN_SIZE, MAX_SIZE]
    public ChessBoard(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE) {
            size = DEFAULT_SIZE;
            board = new boolean[size][size];
        } else {
            board = new boolean[size][size];
        }
    }

    // TODOd #2: if the chess board's size is not given, assume DEFAULT_SIZE
    public ChessBoard() {
        this(DEFAULT_SIZE);
    }

    // TODOd #3: return the chess board's size (i.e., the length of its board)
    public int size() {
        return board.length;
    }

    // TODOd #4: set a queen at given location (i, j)
    public void setQueen(int i, int j) {
        board[i][j] = true;
    }

    // TODOd #5: return true/false depending whether there is a queen at the given location (i, j)
    public boolean hasQueen(int i, int j) {
        return board[i][j];
    }

    // TODOd #6: return true/false depending whether there is a queen at the given row
    public boolean hasQueen(int i) {
        for(int j = 0; j < board.length; i++)
            if(board[i][j])
                return true;
        return false;
    }

    // TODO (suggested): return true/false depending whether the chess board configuration passes the diagonal test
    // (i.e., no queen is attacking another on any diagonal)
    private boolean checkDiagonals() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == true) {                  // if there's a queen at (i,j)
                    for (int k = 1; k < board.length; k++) {
                        if (i+k < board.length && j+k < board.length && board[i+k][j+k] == true) {
                            return false; // same diagonal to the bottom-right
                        }
                        if (i-k >= 0 && j+k < board.length && board[i-k][j+k] == true) {
                            return false; // same diagonal to the top-right
                        }
                        if (i+k < board.length && j-k >= 0 && board[i+k][j-k] == true) {
                            return false; // same diagonal to the bottom-left
                        }
                        if (i-k >= 0 && j-k >= 0 && board[i-k][j-k] == true) {
                            return false; // same diagonal to the top-left
                        }
                    }
                }
            }
        }
        return true; // no two queens on the same diagonal
    }

    // TODO (suggested): return true/false depending whether the chess board configuration passes the row/column test
    // (i.e., no queen is attacking another on any row/column)
    private boolean checkRowsColumns() {
        for (int i = 0; i < board.length; i++) {
            int queensInRow = 0;
            int queensInColumn = 0;
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == true) {
                    queensInRow++; // increment count of queens in this row
                }
                if (board[j][i] == true) {
                    queensInColumn++; // increment count of queens in this column
                }
            }
            if (queensInRow > 1 || queensInColumn > 1) {
                return false; // more than one queen in this row or column
            }
        }
        return true; // no two queens on the same row or column
    }

    // TODO #7: return true/false depending whether the chess board is valid (i.e., no queen is attacking any other queen)
    public boolean isValid() {
        return false;
    }

    // TODOd #8: return the number of queens currently in the chess board
    public int queens() {
        int count = 0;
        for(int i = 0; i < board.length; i++)
            for(int j = 0; j < board.length; j++)
                if(board[i][j])
                    count++;
        return count;
    }

    // TODO #9: return true/false depending whether the chess board is solved (i.e., the chess board is valid and the number of queens is equal to the board's size)
    public boolean isSolved() {
        if(isValid())
            if(queens() == board.length)
                return true;
        return false;
    }


    // TODO #10: clone the current chess board (i.e., return another ChessBoard object with the same configuration of the current board)
    @Override
    protected Object clone() throws CloneNotSupportedException {
       return null;
    }

    // returns a string representation of the chess board (given for debugging purposes)
    @Override
    public String toString() {
        String out = "  |";
        for (int j = 0; j < board.length; j++)
            out += " " + j + " |";
        out += "\n--|";
        for (int j = 0; j < board.length; j++)
            out += "---|";
        out += "\n";
        for (int i = 0; i < board.length; i++) {
            out += i + " |";
            for (int j = 0; j < board.length; j++)
                if (board[i][j])
                    out += " Q |";
                else
                    out += "   |";
            out += "\n--|";
            for (int j = 0; j < board.length; j++)
                out += "---|";
            out += "\n";
        }
        return out;
    }

    public static void main(String[] args) {
        ChessBoard cb1 = new ChessBoard(5);
        cb1.setQueen(0, 0);
        cb1.setQueen(2, 2);
//        cb1.setQueen(2, 4);
//        cb1.setQueen(3, 1);
//        cb1.setQueen(4, 3);

        System.out.println(cb1);
        System.out.println(cb1.checkRowsColumns());
        System.out.println(cb1.checkDiagonals());
        System.out.println(cb1.isValid());

    }
}