/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Description: Activity 04 - CubeTest
 */

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CylinderTest {

    static final double TOLLERANCE = .00001;

    @Test
    public void negativeRadiusCylinder() {
        Cylinder cylinder = new Cylinder(-5, 1);
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getRadius(), TOLLERANCE);
        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
    }

    @Test
    public void zeroRadiusCylinder() {
        Cylinder cylinder = new Cylinder(0, 1);
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getRadius(), TOLLERANCE);
        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
    }

    @Test
    public void negativeHeightCylinder() {
        Cylinder cylinder = new Cylinder(1, -5);
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getHeight(), TOLLERANCE);
        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
    }

    @Test
    public void zeroHeightCylinder() {
        Cylinder cylinder = new Cylinder(1, 0);
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getHeight(), TOLLERANCE);
        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
    }

    @Test
    public void unitRadiusCylinder() {
        Cylinder cylinder = new Cylinder();
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getRadius(), TOLLERANCE);
        assertEquals(Solid.DEFAULT_MEASURE, cylinder.getHeight(), TOLLERANCE);
        assertEquals(3.14159, cylinder.volume(), TOLLERANCE);
    }

    @Test
    public void arbitraryCylinder() {
        Cylinder cylinder = new Cylinder(5, 5);
        assertEquals(5, cylinder.getRadius(), TOLLERANCE);
        assertEquals(5, cylinder.getHeight(), TOLLERANCE);
        assertEquals(392.6990817, cylinder.volume(), TOLLERANCE);
    }
}