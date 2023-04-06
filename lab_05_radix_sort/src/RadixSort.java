/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s): Caleb Thompson, Chris Hammer
 * Description: Lab 05 - Radix Sort
 */

import java.util.Arrays;

public class RadixSort {

    // returns the digit of the number relative to index (0 for unit, 1 for tenth, etc.)
    static int digit(int number, int index) {
        return number / (int) Math.pow(10, index) % 10;
    }

    // TODOd #1: implement counting sort relative to index (0 for unit, 1 for tenth, etc.)
    static void countingSort(int data[], int index) {

        // TODOd #1a: create an array of size 10 to hold counters for each digit
        int holder[] = new int[10];

        // TODOd  #1b: initialize the array of counters with zeros
        int counter[] = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        // TODOd #1c: loop through data and update the array of counters
        for (int i = 0; i < data.length; i++) {
            int digit = digit(data[i], index);
            counter[digit]++;
        }

        // TODOd #1d: loop through the array of counters and accumulate the counts
        for (int i = 1; i < counter.length; i++) {
            counter[i] += counter[i - 1];
        }

        // TODOd #1e: create an auxiliary array with the same size of data
        int aux[] = new int[data.length];

        // TODOd #1f: sort data from right-to-left using count and aux
        for (int i = data.length - 1; i >= 0; i--) {
            int digit = digit(data[i], index);
            aux[counter[digit] - 1] = data[i];
            counter[digit]--;
        }

        // TODOd #1g: copy back aux to data
        for (int i = 0; i < data.length; i++) {
            data[i] = aux[i];
        }

    }

    // TODOd #2: implement the radix sort algorithm
    static void radixSort(int data[]) {

        // TODOd 2a: determine the max number of digits in data (parameter k)
        int k = 0;
        for (int i=0; i < data.length; i++){
            int digits = (int) Math.log10(data[i]) + 1;
            if (digits > k)
                k = digits;
        }

        // TODOd 2b: run count sort k times, each time for the number of digits up to k
        for (int i = 0; i < 3; i++) {
            countingSort(data, i);
        }
    }

    public static void main(String[] args) {
        int data[] = {13, 12, 84, 79, 10, 77, 56, 1, 34, 27, 3};
        radixSort(data);
        System.out.println(Arrays.toString(data));
    }
}
