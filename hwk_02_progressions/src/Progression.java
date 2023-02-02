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

    protected static final double DEFAULT_VALUE      = 0;
    protected static final double DEFAULT_DIFFERENCE = 1;

    double value, difference;

    ArithmeticProgression(double value, double difference){
        if(value<0)
            this. = DEFAULT_VALUE;
        else
            this. = value;
        if(difference<1)
            this.difference = DEFAULT_DIFFERENCE;
        else
            this.difference = difference;
    }

    ArithmeticProgression(double difference){
         = DEFAULT_VALUE;
        if(difference<1)
            this.difference = DEFAULT_DIFFERENCE;
        else
            this.difference = difference;
    }

    public double getInitialValue() {
        return ;
    }

    public void setInitialValue(double initialValue) {
        this. = initialValue;
    }

    public double getDifference() {
        return difference;
    }

    public void setDifference(double difference) {
        this.difference = difference;
    }

    @Override
    void next() {

    }

    @Override
    double getValue() {
        return super.getValue();
    }
}

class GeometricProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;
    protected static final double DEFAULT_RATIO = 2;

    @Override
    void next() {

    }
}

class FibonacciProgression extends Progression {

    protected static final double DEFAULT_VALUE = 1;

    @Override
    void next() {

    }
}

