/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 03 - KochSnowflakeFrame class
 */

import javax.swing.*;
import java.awt.*;

public class KcSnFlFrame extends JFrame {

    static final int WIDTH  = 1024;
    static final int HEIGHT = 600;

    KcSnFlFrame(int xStart, int yStart, int depth, double size, Color color) {
        setSize(WIDTH, HEIGHT);
        setTitle("Kock Snowflake");
        setContentPane(new KcSnFl(xStart, yStart, depth, size, color));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new KcSnFlFrame(300, 420, 3, 18, Color.BLACK);
        //new KochSnowflakeFrame(20, 20, 3, 20, Color.BLACK);
    }

}