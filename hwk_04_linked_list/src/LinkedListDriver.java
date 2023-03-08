/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student Name: Thompson Caleb
 * Description: Activity 06 - LinkedListDriver
 */

import java.util.Iterator;

public class LinkedListDriver {
    public static void main(String[] args) {

        // TODOd #2: create a linked list with the pets used in README.  Display the linked list, reverse it, and then display it again

        LinkedList<String> pets = new LinkedList<>();
        pets.add("Spike");
        pets.add("Rex");
        pets.add("Spots");
        pets.add("Sparky");
        System.out.println(pets);
        pets.reverse();
        System.out.println(pets);
    }
}
