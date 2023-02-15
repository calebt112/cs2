/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - CubeTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PyramidTest {
    static final double TOLLERANCE = .00001;

//    @Test
//    public void negativeRadiusCylinder() {
//        Cylinder cylinder = new Cylinder(-5, 1);
//        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getRadius(), TOLLERANCE);
//        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
//    }

    @Test
    public void unitPyramid() {
        Pyramid pyramid = new Pyramid();
        assertEquals(1, pyramid.getBase(), TOLLERANCE);
        assertEquals(1, pyramid.getHeight(), TOLLERANCE);
        assertEquals(1, pyramid.getLength(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void negativeBasePyramid() {
        Pyramid pyramid = new Pyramid(-5, 1, 1);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getBase(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void zeroBasePyramid() {
        Pyramid pyramid = new Pyramid(0, 1, 1);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getBase(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void negativeHeightPyramid() {
        Pyramid pyramid = new Pyramid(1, -5, 1);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getHeight(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void zeroHeightPyramid() {
        Pyramid pyramid = new Pyramid(1, 0, 1);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getHeight(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void negativeLengthPyramid() {
        Pyramid pyramid = new Pyramid(1, 1, -5);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getLength(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void zeroLengthPyramid() {
        Pyramid pyramid = new Pyramid(1, 1, 0);
        assertEquals(Solid.DEFAULT_MEASURE, pyramid.getLength(), TOLLERANCE);
        assertEquals(1.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }

    @Test
    public void arbitraryPyramid() {
        Pyramid pyramid = new Pyramid(2, 3, 4);
        assertEquals(2, pyramid.getBase(), TOLLERANCE);
        assertEquals(3, pyramid.getHeight(), TOLLERANCE);
        assertEquals(4, pyramid.getLength(), TOLLERANCE);
        assertEquals(24.0 / 3.0, pyramid.volume(), TOLLERANCE);
    }
}
