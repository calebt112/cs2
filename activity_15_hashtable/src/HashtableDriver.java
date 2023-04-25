/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 15 - HashtableDriver
 */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;

public class HashtableDriver {

    private static final String FILE_NAME = "students.csv";

    // TODO: create a hashtable from FILE_NAME
    public static void main(String[] args) throws FileNotFoundException {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(56, "john");
        ht.put(12, "mary");
        ht.put(67, "anna");
        System.out.println(ht);
    }
}
