/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - CubeTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CubeTest {

    static final double TOLLERANCE = .00001;

    @Test
    public void negativeSideCube() {
        Cube cube = new Cube(-5);
        assertEquals(Solid.DEFAULT_MEASURE, cube.getSide(), TOLLERANCE);
        assertEquals(1, cube.volume(), TOLLERANCE);
    }

    @Test
    public void zeroSideCube() {
        Cube cube = new Cube(0);
        assertEquals(Solid.DEFAULT_MEASURE, cube.getSide(), TOLLERANCE);
        assertEquals(1, cube.volume(), TOLLERANCE);
    }

    @Test
    public void unitSideCube() {
        Cube cube = new Cube();
        assertEquals(Solid.DEFAULT_MEASURE, cube.getSide(), TOLLERANCE);
        assertEquals(1, cube.volume(), TOLLERANCE);
    }

    @Test
    public void arbitrarySideCube() {
        Cube cube = new Cube(5);
        assertEquals(5, cube.getSide(), TOLLERANCE);
        assertEquals(125, cube.volume(), TOLLERANCE);
    }

}