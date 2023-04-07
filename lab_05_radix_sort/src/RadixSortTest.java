/*
 * CS 2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: Lab 05 - Radix Sort
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RadixSortTest {

    @Test
    void testDigitForOnes() {
        for (int i = 0; i <= 9; i++) {
            int number = i;
            assertEquals(i, RadixSort.digit(number, 0));
            assertEquals(0, RadixSort.digit(number, 1));
            assertEquals(0, RadixSort.digit(number, 2));
        }
    }

    @Test
    void testDigitForTenths() {
        for (int i = 0; i <= 9; i++)
            for (int j = 1; j <= 9; j++) {
                int number = j * 10 + i;
                assertEquals(i, RadixSort.digit(number, 0));
                assertEquals(j, RadixSort.digit(number, 1));
                assertEquals(0, RadixSort.digit(number, 2));
            }
    }

    @Test
    void testDigitForHundredths() {
        for (int i = 0; i <= 9; i++)
            for (int j = 1; j <= 9; j++)
                for (int k = 1; k <= 9; k++) {
                    int number = k * 100 + j * 10 + i;
                    assertEquals(i, RadixSort.digit(number, 0));
                    assertEquals(j, RadixSort.digit(number, 1));
                    assertEquals(k, RadixSort.digit(number, 2));
                }
    }

    @Test
    void testCountingSortForOnes() {
        int data[] = {1, 4, 1, 2, 7, 5, 2};
        RadixSort.countingSort(data, 0);
        assertEquals(1, data[0]);
        assertEquals(1, data[1]);
        assertEquals(2, data[2]);
        assertEquals(2, data[3]);
        assertEquals(4, data[4]);
        assertEquals(5, data[5]);
        assertEquals(7, data[6]);
    }

    @Test
    void testCountingSortForTenths() {
        int data[] = {10, 4, 21, 32, 97, 51, 2};
        RadixSort.countingSort(data, 0);
        assertEquals(10, data[0]);
        assertEquals(21, data[1]);
        assertEquals(51, data[2]);
        assertEquals(32,  data[3]);
        assertEquals(2, data[4]);
        assertEquals(4,  data[5]);
        assertEquals(97, data[6]);
        RadixSort.countingSort(data, 1);
        assertEquals(2, data[0]);
        assertEquals(4, data[1]);
        assertEquals(10, data[2]);
        assertEquals(21,  data[3]);
        assertEquals(32, data[4]);
        assertEquals(51,  data[5]);
        assertEquals(97, data[6]);
    }

    @Test
    void testCountingSortForHundredths() {
        int data[] = {170, 45, 75, 90, 2, 802, 2, 66};
        RadixSort.countingSort(data, 0);
        assertEquals(170, data[0]);
        assertEquals(90,  data[1]);
        assertEquals(2,   data[2]);
        assertEquals(802, data[3]);
        assertEquals(2,   data[4]);
        assertEquals(45,  data[5]);
        assertEquals(75,  data[6]);
        assertEquals(66,  data[7]);
        RadixSort.countingSort(data, 1);
        assertEquals(2,   data[0]);
        assertEquals(802, data[1]);
        assertEquals(2,   data[2]);
        assertEquals(45,  data[3]);
        assertEquals(66,  data[4]);
        assertEquals(170, data[5]);
        assertEquals(75,  data[6]);
        assertEquals(90,  data[7]);
        RadixSort.countingSort(data, 2);
        assertEquals(2,   data[0]);
        assertEquals(2,   data[1]);
        assertEquals(45,  data[2]);
        assertEquals(66,  data[3]);
        assertEquals(75,  data[4]);
        assertEquals(90,  data[5]);
        assertEquals(170, data[6]);
        assertEquals(802, data[7]);
    }

    @Test
    void testRadixSortSample1() {
        int data[] = {1, 4, 1, 2, 7, 5, 2};
        RadixSort.radixSort(data);
        assertEquals(1, data[0]);
        assertEquals(1, data[1]);
        assertEquals(2, data[2]);
        assertEquals(2, data[3]);
        assertEquals(4, data[4]);
        assertEquals(5, data[5]);
        assertEquals(7, data[6]);
    }

    @Test
    void testRadixSortSample2() {
        int data[] = {10, 4, 21, 32, 97, 51, 2};
        RadixSort.radixSort(data);
        assertEquals(2, data[0]);
        assertEquals(4, data[1]);
        assertEquals(10, data[2]);
        assertEquals(21,  data[3]);
        assertEquals(32, data[4]);
        assertEquals(51,  data[5]);
        assertEquals(97, data[6]);
    }

    @Test
    void testRadixSortSample3() {
        int data[] = {170, 45, 75, 90, 2, 802, 2, 66};
        RadixSort.radixSort(data);
        assertEquals(2,   data[0]);
        assertEquals(2,   data[1]);
        assertEquals(45,  data[2]);
        assertEquals(66,  data[3]);
        assertEquals(75,  data[4]);
        assertEquals(90,  data[5]);
        assertEquals(170, data[6]);
        assertEquals(802, data[7]);
    }
}