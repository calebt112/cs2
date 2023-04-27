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

    // TODOd: create a hashtable from FILE_NAME
    public static void main(String[] args) throws FileNotFoundException {
        Hashtable<Integer, Student> ht = new Hashtable<>();
        Scanner sc = new Scanner(new FileInputStream(FILE_NAME));
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String data[] = line.split(",");
            int id = Integer.parseInt(data[0]);
            String name = data[1];
            Student student = new Student(id, name);
            ht.put(id, student);
        }
        sc.close();
        System.out.println(ht);
    }
}
