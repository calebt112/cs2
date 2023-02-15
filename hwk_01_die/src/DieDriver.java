/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student:
 * Description: Homework 01 - DieDriver
 */

public class DieDriver {

    public static void main(String[] args) {
        Die die1 = new Die(8);
        for(int i = 0; i < 10; i++) {
            die1.roll();
            System.out.println(die1);
        }
    }
}
