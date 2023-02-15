/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 01 - Sandwich
 */

public class Sandwich {
    private String name;
    private double price;
    private int calories;

    public Sandwich(String name, double price, int calories) {
        this.name = name;

        if(price < 0)
            price = 0;
        this.price = price;

        if(calories< 0)
            calories = 0;
        this.calories = calories;
    }

    public boolean isHealthy() {
        return calories < 250;
    }

    @Override
    public String toString() {
        return name + " $" + price + " (" + calories + " calories)";
    }
}
