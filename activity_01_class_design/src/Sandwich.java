/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 01 - Sandwich
 */

public class Sandwich {

    private String name;
    private int calories;
    private double price;
    final int MIN_CALORIES = 0;
    final int MIN_PRICE = 0;

    public Sandwich(String name, int calories, double price) {
        this.name = name;
        if(calories <= MIN_CALORIES)
            this.calories = MIN_CALORIES;
        else
            this.calories = calories;
        if(price <= MIN_PRICE)
            this.price = MIN_PRICE;
        else
            this.price = price;
    }
}
