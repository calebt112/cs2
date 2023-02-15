/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Students Names: Thompson Caleb, Hammer Chris
 * Description: Lab 03 - Fraction
 */

/**
 * A Fraction is defined by two integers: the numerator and the denominator.
 */
public class Fraction {

    // TODOd #5: define numerator and denominator as instance variables

    public static int DEFAULT_VALUE = 1;
    public static int numerator;
    public static int denominator;

    // TODOd #6: implement the default constructor
    /**
     * Sets both the numerator and denominator to one.
     */
    public Fraction() {
        numerator = 1;
        denominator = 1;
    }

    // TODOd #7: implement the constructor that only takes the numerator
    /**
     * Accepts a value for the numerator, setting the denominator to one.
     * @param numerator
     */
    public Fraction(int numerator) {
        this.numerator = numerator;
        this.denominator = 1;
    }

    // TODOd #8: implement the constructor that takes both the numerator and the denominator
    /**
     * Allows the user to set both the numerator and denominator; however, if the informed denominator is zero,
     * this constructor should set it to one instead.
     * @param numerator
     * @param denominator
     */
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            this.denominator = 1;
        }
        else {
            this.denominator = denominator;
        }
    }

    // TODOd #9: implement getNumerator
    public int getNumerator() {
        return numerator;
    }

    // TODOd #10: implement getDenominator
    public int getDenominator() {
        return denominator;
    }

    // TODOd #11: implement setNumerator
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    // TODOd #12: implement setDenominator (do not to allow having the denominator be set to zero)
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    // TODOd #13: implement getValue
    /**
     * Returns the value of the fraction (as a floating-point value); in other words, this method returns the results
     * of dividing its numerator by its denominator;
     */

    public double getValue() {
        double value = (double) (numerator / denominator);
        return value;
    }

    /**
     * A helper method that returns the “Greatest Common Divisor" of the numerator and the denominator of the fraction object.
     */

    private int gcd() {
        int a = Math.abs(this.numerator);
        int b = Math.abs(this.denominator);
        while (b != 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return a;
    }

    /**
     * Divides the fraction’s numerator and denominator by the gcd of the numbers; also, if the numerator is positive and
     * the denominator is negative, this method switch signs between them; finally, if the numerator and the denominator
     * are both negatives, this method cancels their signs, making them both positive.
     */

    void simplify() {
        int gcd = this.gcd();
        this.numerator /= gcd;
        this.denominator /= gcd;
        if (numerator == 0)
            denominator = 1;
        else if ((this.numerator > 0 && this.denominator < 0) || (this.numerator < 0 && this.denominator < 0)) {
            this.numerator *= -1;
            this.denominator *= -1;
        }
    }

    // TODOd #14: implement isNegative
    /**
     * returns true if the value of the fraction is less than zero; false otherwise;
     * @return true/false depending on whether the fraction is negative or not
     */
    public boolean isNegative() {
        return (getValue() < 0);
    }

    // TODOd #15: implement isProper
    /**
     * Returns true if the function is proper; false otherwise; a fraction is considered proper if the absolute value
     * of its numerator is smaller than the absolute value of its denominator.
     * @return true/false depending on whether the fraction if proper or not
     */
    public boolean isProper() {
        return (Math.abs(numerator) < Math.abs(denominator));
    }
}
