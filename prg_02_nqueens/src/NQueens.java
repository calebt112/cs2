/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s): Caleb Thompson
 * Description: Prg 02 - NQueens
 */

import javax.swing.*;
import java.awt.*;
import java.io.IOException;

public class NQueens extends JFrame {

    private static final String TITLE        = "CS 2050 - NQueens Problem";
    private static final int    TITLE_HEIGHT = 30;
    public static final int     WIDTH        = 600;
    public static final int     HEIGHT       = WIDTH;
    private static final int    SLEEP_TIME   = 2050; // in ms
    private ChessPanel          chessPanel;
    private int                 size;

    public NQueens(int size) throws IOException {
        this.size = size;

        setSize(WIDTH, HEIGHT + TITLE_HEIGHT);
        setTitle(TITLE);

        // content pane
        Container contentPane = getContentPane();
        chessPanel = new ChessPanel();
        contentPane.add(chessPanel);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    // TODO #11: implement the exhaustive search algorithm to solve the NQueens problem, showing each chess board
    // configuration on the GUI, pausing SLEEP_TIME ms between configurations; this method should also
    // return the total number of chess board configurations found
    public int run() {
        Stack<ChessBoard> stack = new Stack<>();
        ChessBoard initialBoard = new ChessBoard(size);
        stack.push(initialBoard);
        int count = 0;

        while (!stack.isEmpty()) {
            ChessBoard currentBoard = null;
            try {
                currentBoard = stack.pop();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
            if (currentBoard.isSolved()) {
                count++;
                chessPanel.updateChessBoard(currentBoard);
                repaint();
                try {
                    Thread.sleep(SLEEP_TIME);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                int row = currentBoard.queens();
                for (int col = 0; col < size; col++) {
                    try {
                        ChessBoard newBoard = (ChessBoard) currentBoard.clone();
                        newBoard.setQueen(row, col);
                        if (newBoard.isValid()) {
                            stack.push(newBoard);
                        }
                    } catch (CloneNotSupportedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) throws IOException, CloneNotSupportedException {
        int size = Integer.parseInt(
                JOptionPane.showInputDialog("What size of the NQueens Problem do you want to simulate?"));
        int count = (new NQueens(size)).run();
        JOptionPane.showMessageDialog(null, count + " solutions found!");
    }
}
