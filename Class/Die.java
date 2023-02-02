/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student: Caleb Thompson
 * Description: Homework 01 - Die
 */
import java.util.Random;

public class Die {

    // Member Variables
    private static final int MIN_SIDES     = 2;
    private static final int DEFAULT_SIDES = 6;
    private static final int INIT_VALUE    = 1;
    int sides;
    int value;

    // Constructors
    public Die(int sides) {
        if (sides < 2)
            this.sides = MIN_SIDES;
        else
            this.sides = sides;
        value = INIT_VALUE;
    }

    public Die() {
        sides = DEFAULT_SIDES;
        value = INIT_VALUE;
    }

    // Methods
    public int getValue() {
         return value;
    }

    public void roll() {
        Random rand = new Random();
        value = rand.nextInt(sides) + 1;
    }
 
    @Override
    public String toString() {
        return "Die{sides: " + sides + ",value: " + value + "}";
    }
}