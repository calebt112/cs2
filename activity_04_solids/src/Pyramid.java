/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - Pyramid
 */

class Pyramid extends Solid {

    private double base;
    private double height;
    private double length;

    public Pyramid(double base, double height, double length) {
        if(base <= 0)
            this.base = Solid.DEFAULT_MEASURE;
        else
            this.base = base;
        if(height <= 0)
            this.height = Solid.DEFAULT_MEASURE;
        else
            this.height = height;
        if(length <= 0)
            this.length = Solid.DEFAULT_MEASURE;
        else
            this.length = length;
    }

    public Pyramid() {
        this(Solid.DEFAULT_MEASURE, Solid.DEFAULT_MEASURE, Solid.DEFAULT_MEASURE);
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double volume() {
        return (base * height * length) / 3;
    }

    @Override
    public String toString() {
        return "Pyramid: " + super.toString() + " base = " + base + " height = " + height + " length = " + length;
    }
}
