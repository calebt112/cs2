/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name: Thompson Caleb
 * Description: Homework 02 - Progression and other specialized classes
 */

abstract class Progression {

    protected double value;
    protected static final double DEFAULT_VALUE = 0;

    Progression() {
        this(DEFAULT_VALUE);
    }

    Progression(double value) {
        this.value = value;
    }

    double getValue() {
        return value;
    }

    abstract void next();
}

class ArithmeticProgression extends Progression {

    protected static final double DEFAULT_VALUE = 0;
    protected static final double DEFAULT_DIFFERENCE = 1;

    double value, difference;

    ArithmeticProgression(double value, double difference) {
        this.value = value;
        this.difference = difference;
    }

    ArithmeticProgression() {
        value = DEFAULT_VALUE;
        difference = DEFAULT_DIFFERENCE;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    void next() {
        value += difference;
    }
}

class GeometricProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;
    protected static final double DEFAULT_RATIO = 2;
    static double value, ratio;
    GeometricProgression(double value, double ratio){
        this.value = value;
        this.ratio = ratio;
    }

    GeometricProgression(){
        ratio = DEFAULT_RATIO;
        value = DEFAULT_VALUE;
    }

    @Override
    public double getValue() {
        return value;
    }

    @Override
    void next() {
       value *= ratio;
    }
}

class FibonacciProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;
    static double value;

    FibonacciProgression(){
        value = DEFAULT_VALUE;
    }

    private static double fibo(double value){
        if (value <= 2)
            return 1;
        else
            return fibo(value-1) + fibo(value-2);
    }
    @Override
    public double getValue() {
        return value;
    }

    @Override
    void next(){
        if (value <= 2)
            value = 1;
        else
            value = FibonacciProgression.next(value-1) + next(value-2);
    }
}

