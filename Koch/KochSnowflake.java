/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 03 - KochSnowflake class
 */

import javax.swing.*;
import java.awt.*;

public class KochSnowflake extends JPanel {

    private int depth;
    private double size;
    private int xPixel, yPixel;
    private double direction; // remember: this value is in degrees (not radians!)
    private Color color;

    static final int MIN_DEPTH = 0;
    static final double MIN_SIZE = 10;

    KochSnowflake(int xPixel, int yPixel, int depth, double size, Color color) {
        super();
        // TODOd: finish implementation according to instructions
        if (xPixel < 0) {
            this.xPixel = 0;
        } else {
            this.xPixel = xPixel;
        }
        if (yPixel < 0) {
            this.yPixel = 0;
        } else {
            this.yPixel = yPixel;
        }
        if (depth < MIN_DEPTH) {
            this.depth = MIN_DEPTH;
        } else {
            this.depth = depth;
        }
        if (size < MIN_SIZE) {
            this.size = MIN_SIZE;
        } else {
            this.size = size;
        }
        this.color = color;
        direction = 0;
    }

    // TODOd: implement helper method according to instructions    
    private void drawLine(Graphics g) {

        int xPixelNew = (int) (xPixel + Math.cos(Math.toRadians(direction)) * size);
        int yPixelNew = (int) (yPixel + Math.sin(Math.toRadians(direction)) * size);

        g.drawLine(xPixel, yPixel, xPixelNew, yPixelNew);

        xPixel = xPixelNew;
        yPixel = yPixelNew;
    }

    // TODOd: implement helper method according to instructions
    private void rotate(int degrees) {
        direction += degrees;
    }

    // TODOd: implement drawCurve according to instructions
    private void drawCurve(Graphics g, int depth) {
        if (depth == 0) {
            drawLine(g);
        } else {
            drawCurve(g, depth-1);
            rotate(-60);
            drawCurve(g, depth-1);
            rotate(120);
            drawCurve(g, depth-1);
            rotate(-60);
        }

    }

    // TODOd: implement drawSnowflake according to instructions
    private void drawSnowflake(Graphics g) {

        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
        rotate(-120);
        drawCurve(g, depth);
    }

    @Override
    public void paintComponent(Graphics g) {
        g.setColor(color);
        drawSnowflake(g);
        // drawCurve(g, depth);
    }
}