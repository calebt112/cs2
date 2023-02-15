/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - Die
 */

import java.util.Random;

public class Die {

    private static final int MIN_SIDES     = 2;
    private static final int DEFAULT_SIDES = 6;
    private static final int INIT_VALUE    = 1;
    private static int value;
    private static int sides;

    public Die(int sides) {
        if (sides < MIN_SIDES)
            this.sides = DEFAULT_SIDES;
        else
            this.sides = sides;
        value = INIT_VALUE;
    }

    public Die() {
        sides = DEFAULT_SIDES;
        value = INIT_VALUE;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }

    @Override
    public String toString() {
        return "Die{" + "value= " + value + ", sides= " + sides + "}";
    }
}