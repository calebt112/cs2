/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 01 - Die
 */

public class Die {

    private int sides;
    private int value;
    final int MIN_SIDES = 2;

    public Die(int sides) {
        if (sides <= MIN_SIDES)
            this.sides = MIN_SIDES;
        else
            this.sides = sides;
        value = 1;
    }

    public Die() {
        sides = 6;
        value = 1;
    }

    public int getValue() {
        return value;
    }

    public int roll(){
        value = (int)(Math.random() * sides) + 1;
        return value;
    }
}
