/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student: Caleb Thompson
 * Description: Homework 01 - DieDriver
 */

public class DieDriver {
    public static void main(String[] args) {
        
        Die Die = new Die(8);

        System.out.println(Die);

        for (int i = 0; i < 10; i++) {
            Die.roll();
            System.out.println(Die.value);
        }
    }
}