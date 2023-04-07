/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: Prg 02 - ChessBoard
 */

public class ChessBoard {

    private boolean board[][];
    private static final int MIN_SIZE = 4;
    private static final int DEFAULT_SIZE = 8;
    private static final int MAX_SIZE = 15;

    // TODOd #1: properly initialize a chess board, making sure that its size is in [MIN_SIZE, MAX_SIZE]
    public ChessBoard(int size) {
        if (size < MIN_SIZE || size > MAX_SIZE)
            size = DEFAULT_SIZE;
        else {
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

    public void removeQueen(int i, int j) {
        board[i][j] = false;
    }

    // TODOd #5: return true/false depending whether there is a queen at the given location (i, j)
    public boolean hasQueen(int i, int j) {
        return board[i][j];
    }

    // TODOd #6: return true/false depending whether there is a queen at the given row
    public boolean hasQueen(int i) {
        for (int j = 0; j < board.length; j++)
            if (board[i][j])
                return true;
        return false;
    }

    // TODOd (suggested): return true/false depending whether the chess board configuration passes the diagonal test
    // (i.e., no queen is attacking another on any diagonal)
    private boolean checkDiagonals() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    // Check top-right diagonal
                    for (int k = 1; i - k >= 0 && j + k < board.length; k++) {
                        if (board[i - k][j + k]) return false;
                    }

                    // Check bottom-right diagonal
                    for (int k = 1; i + k < board.length && j + k < board.length; k++) {
                        if (board[i + k][j + k]) return false;
                    }

                    // Check top-left diagonal
                    for (int k = 1; i - k >= 0 && j - k >= 0; k++) {
                        if (board[i - k][j - k]) return false;
                    }

                    // Check bottom-left diagonal
                    for (int k = 1; i + k < board.length && j - k >= 0; k++) {
                        if (board[i + k][j - k]) return false;
                    }
                }
            }
        }
        return true;
    }


    // TODOd (suggested): return true/false depending whether the chess board configuration passes the row/column test
    // (i.e., no queen is attacking another on any row/column)
    private boolean checkRowsColumns() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j]) {
                    // Check row
                    for (int k = 0; k < board.length; k++) {
                        if (k != j && board[i][k]) return false;
                    }
                    // Check column
                    for (int k = 0; k < board.length; k++) {
                        if (k != i && board[k][j]) return false;
                    }
                }
            }
        }
        return true;
    }

    // TODOd #7: return true/false depending whether the chess board is valid (i.e., no queen is attacking any other queen)
    public boolean isValid() {
        return checkRowsColumns() && checkDiagonals();
    }

    // TODOd #8: return the number of queens currently in the chess board
    public int queens() {
        int count = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if (board[i][j])
                    count++;
            }
        }
        return count;
    }

    // TODOd #9: return true/false depending whether the chess board is solved (i.e., the chess board is valid and the number of queens is equal to the board's size)
    public boolean isSolved() {
        return isValid() && queens() == board.length;
    }


    // TODOd #10: clone the current chess board (i.e., return another ChessBoard object with the same configuration of the current board)
    @Override
    protected Object clone() throws CloneNotSupportedException {
       ChessBoard clone = new ChessBoard();
         for (int i = 0; i < board.length; i++) {
              for (int j = 0; j < board.length; j++) {
                clone.board[i][j] = this.board[i][j];
              }
         }
            return clone;
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
        ChessBoard board = new ChessBoard(5);
        board.setQueen(0, 0);
        board.setQueen(1, 2);
        board.setQueen(2, 4);
        board.setQueen(3, 1);
        board.setQueen(3, 3);

        System.out.println(board);
        System.out.println(board.isSolved());






    }


}