/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 03 - KochSnowflakeFrame class
 */

import javax.swing.*;
import java.awt.*;

public class KochSnowflakeFrame extends JFrame {

    static final int WIDTH  = 1024;
    static final int HEIGHT = 600;

    KochSnowflakeFrame(int xStart, int yStart, int depth, double size, Color color) {
        setSize(WIDTH, HEIGHT);
        setTitle("Kock Snowflake");
        setContentPane(new KcSnFl(xStart, yStart, depth, size, color));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        // TODO: instantiate a KochSnowflakeFrame object to visualize your drawings
        new KcSnFlFrame(300, 420, 3, 18, Color.BLACK);
        //new KochSnowflakeFrame(20, 20, 3, 20, Color.BLACK);
    }

}