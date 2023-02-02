/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Homework 02 - Unit Tests
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProgressionTest {

    static final double TOLLERANCE = .00001;

    @Test
    void testDefaultArithmeticProgression() {
        Progression prg = new ArithmeticProgression();
        assertEquals(0, prg.getValue(), TOLLERANCE);
        prg.next();
        assertEquals(1, prg.getValue(), TOLLERANCE);
        prg.next();
        assertEquals(2, prg.getValue(), TOLLERANCE);
    }

    @Test
    void testIncreasingArithmeticProgressions() {
        Progression prg1 = new ArithmeticProgression(0, 5);
        assertEquals(0, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(5, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(10, prg1.getValue(), TOLLERANCE);
        Progression prg2 = new ArithmeticProgression(-10, 5);
        assertEquals(-10, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-5, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(0, prg2.getValue(), TOLLERANCE);
        Progression prg3 = new ArithmeticProgression(10, 5);
        assertEquals(10, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(15, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(20, prg3.getValue(), TOLLERANCE);
    }

    @Test
    void testDecreasingArithmeticProgressions() {
        Progression prg1 = new ArithmeticProgression(0, -5);
        assertEquals(0, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(-5, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(-10, prg1.getValue(), TOLLERANCE);
        Progression prg2 = new ArithmeticProgression(-10, -5);
        assertEquals(-10, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-15, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-20, prg2.getValue(), TOLLERANCE);
        Progression prg3 = new ArithmeticProgression(10, -5);
        assertEquals(10, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(5, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(0, prg3.getValue(), TOLLERANCE);
    }

    @Test
    void testDefaultGeometricProgression() {
        Progression prg = new GeometricProgression();
        assertEquals(1, prg.getValue(), TOLLERANCE);
        prg.next();
        assertEquals(2, prg.getValue(), TOLLERANCE);
        prg.next();
        assertEquals(4, prg.getValue(), TOLLERANCE);
    }

    @Test
    void testDivergentGeometricProgressions() {
        Progression prg1 = new GeometricProgression(1, 2);
        assertEquals(1, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(2, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(4, prg1.getValue(), TOLLERANCE);
        Progression prg2 = new GeometricProgression(-10, 2);
        assertEquals(-10, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-20, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-40, prg2.getValue(), TOLLERANCE);
        Progression prg3 = new GeometricProgression(10, 2);
        assertEquals(10, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(20, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(40, prg3.getValue(), TOLLERANCE);
    }

    @Test
    void testConvergentGeometricProgressions() {
        Progression prg1 = new GeometricProgression(1, .5);
        assertEquals(1, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(.5, prg1.getValue(), TOLLERANCE);
        prg1.next();
        assertEquals(.25, prg1.getValue(), TOLLERANCE);
        Progression prg2 = new GeometricProgression(-10, .5);
        assertEquals(-10, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-5, prg2.getValue(), TOLLERANCE);
        prg2.next();
        assertEquals(-2.5, prg2.getValue(), TOLLERANCE);
        Progression prg3 = new GeometricProgression(10, .5);
        assertEquals(10, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(5, prg3.getValue(), TOLLERANCE);
        prg3.next();
        assertEquals(2.5, prg3.getValue(), TOLLERANCE);
    }

    @Test
    void testFibonacciProgression() {
        Progression fibo = new FibonacciProgression();
        assertEquals(1, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(1, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(2, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(3, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(5, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(8, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(13, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(21, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(34, fibo.getValue(), TOLLERANCE);
        fibo.next();
        assertEquals(55, fibo.getValue(), TOLLERANCE);
        fibo.next();
    }
}