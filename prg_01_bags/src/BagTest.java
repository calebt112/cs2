/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s) Name(s):
 * Description: Prg 01 - BagTest
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BagTest {

    private static final double TOLERANCE = 0.001;

    @Test
    public void testDefaultEmptyBag() {
        Bag bag = new Bag();
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(0, bag.price());
        assertNull(bag.mostPricey());
        assertFalse(bag.contains(new Item("bla")));
        assertFalse(bag.remove(new Item("bla")));
        assertFalse(bag.removeAll(new Item("bla")));
    }

    @Test
    public void testEmptyBagNegativeWeightLimit() {
        Bag bag = new Bag(-100);
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(0, bag.price());
        assertNull(bag.mostPricey());
        assertFalse(bag.contains(new Item("bla")));
        assertFalse(bag.remove(new Item("bla")));
        assertFalse(bag.removeAll(new Item("bla")));
    }

    @Test
    public void testEmptyBagZeroWeightLimit() {
        Bag bag = new Bag(0);
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(0, bag.price());
        assertNull(bag.mostPricey());
        assertFalse(bag.contains(new Item("bla")));
        assertFalse(bag.remove(new Item("bla")));
        assertFalse(bag.removeAll(new Item("bla")));
    }

    @Test
    public void testSingleItemBag() {
        Bag bag = new Bag();
        assertTrue(bag.add(new Item("bla")));
        assertFalse(bag.isEmpty());
        assertEquals(1, bag.count());
        assertEquals(1, bag.count(new Item("bla")));
        assertEquals(0, bag.count(new Item("ble")));
        assertEquals(Item.MIN_WEIGHT, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(Item.MIN_PRICE, bag.price());
        assertEquals(new Item("bla"), bag.mostPricey());
        assertNotEquals(new Item("ble"), bag.mostPricey());
        assertTrue(bag.contains(new Item("bla")));
        assertFalse(bag.contains(new Item("ble")));
        assertTrue(bag.remove(new Item("bla")));
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.count(new Item("ble")));
        assertEquals(0, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(0, bag.price());
    }

    @Test
    public void testTwoDistinctItemsBag() {
        Bag bag = new Bag();
        assertTrue(bag.add(new Item("bla", 10, 5)));
        assertTrue(bag.add(new Item("ble", 20, 10)));
        assertFalse(bag.isEmpty());
        assertEquals(2, bag.count());
        assertEquals(1, bag.count(new Item("bla")));
        assertEquals(1, bag.count(new Item("ble")));
        assertEquals(0, bag.count(new Item("bli")));
        assertEquals(30, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(15, bag.price());
        assertEquals(new Item("ble"), bag.mostPricey());
        assertNotEquals(new Item("bla"), bag.mostPricey());
        assertTrue(bag.contains(new Item("bla")));
        assertTrue(bag.contains(new Item("ble")));
        assertFalse(bag.contains(new Item("bli")));
        assertTrue(bag.remove(new Item("bla")));
        assertFalse(bag.isEmpty());
        assertEquals(1, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(1, bag.count(new Item("ble")));
        assertEquals(20, bag.weight(), TOLERANCE);
        assertEquals(Bag.DEFAULT_WEIGHT_LIMIT, bag.weightLimit(), TOLERANCE);
        assertEquals(10, bag.price());
        assertEquals(new Item("ble"), bag.mostPricey());
    }

    @Test
    public void testMultipleItemsBag() {
        Bag bag = new Bag(20);
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 5
        assertTrue(bag.add(new Item("ble", 10, 15))); // bag weight is now 15
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 20
        assertFalse(bag.add(new Item("bla", 5, 10))); // operation should fail!
        assertEquals(3, bag.count());
        assertEquals(2, bag.count(new Item("bla")));
        assertEquals(1, bag.count(new Item("ble")));
        assertEquals(35, bag.price());
        assertEquals(new Item("ble"), bag.mostPricey());
        assertEquals(20, bag.weight(), TOLERANCE);
        assertTrue(bag.contains(new Item("bla")));
        assertTrue(bag.contains(new Item("ble")));
        assertFalse(bag.contains(new Item("bli")));
        bag = new Bag(30);
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 5
        assertTrue(bag.add(new Item("ble", 10, 15))); // bag weight is now 15
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 20
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 25
        assertFalse(bag.add(new Item("ble", 10, 15))); // operation should fail!
        assertEquals(4, bag.count());
        assertEquals(3, bag.count(new Item("bla")));
        assertEquals(1, bag.count(new Item("ble")));
        assertEquals(45, bag.price());
        assertEquals(new Item("ble"), bag.mostPricey());
        assertEquals(25, bag.weight(), TOLERANCE);
        assertTrue(bag.contains(new Item("bla")));
        assertTrue(bag.contains(new Item("ble")));
        assertFalse(bag.contains(new Item("bli")));
        bag = new Bag();
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 5
        assertTrue(bag.add(new Item("ble", 10, 15))); // bag weight is now 15
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 20
        assertTrue(bag.add(new Item("bla", 5, 10)));  // bag weight is now 25
        assertTrue(bag.add(new Item("ble", 10, 15))); // bag weight is now 35
        assertTrue(bag.add(new Item("bli", 15, 20))); // bag weight is now 50
        assertEquals(6, bag.count());
        assertEquals(3, bag.count(new Item("bla")));
        assertEquals(2, bag.count(new Item("ble")));
        assertEquals(1, bag.count(new Item("bli")));
        assertEquals(80, bag.price());
        assertEquals(new Item("bli"), bag.mostPricey());
        assertEquals(50, bag.weight(), TOLERANCE);
        assertTrue(bag.contains(new Item("bla")));
        assertTrue(bag.contains(new Item("ble")));
        assertTrue(bag.contains(new Item("bli")));
        assertFalse(bag.contains(new Item("blo")));
        assertTrue(bag.removeAll(new Item("bla")));
        assertEquals(3, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(2, bag.count(new Item("ble")));
        assertEquals(1, bag.count(new Item("bli")));
        assertEquals(50, bag.price());
        assertEquals(new Item("bli"), bag.mostPricey());
        assertEquals(35, bag.weight(), TOLERANCE);
        assertFalse(bag.remove(new Item("blo")));
        assertTrue(bag.remove(new Item("ble")));
        assertEquals(2, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(1, bag.count(new Item("ble")));
        assertEquals(1, bag.count(new Item("bli")));
        assertEquals(35, bag.price());
        assertEquals(new Item("bli"), bag.mostPricey());
        assertEquals(25, bag.weight(), TOLERANCE);
        assertTrue(bag.remove(new Item("ble")));
        assertEquals(1, bag.count());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.count(new Item("ble")));
        assertEquals(1, bag.count(new Item("bli")));
        assertEquals(20, bag.price());
        assertEquals(new Item("bli"), bag.mostPricey());
        assertEquals(15, bag.weight(), TOLERANCE);
        assertTrue(bag.remove(new Item("bli")));
        assertEquals(0, bag.count());
        assertTrue(bag.isEmpty());
        assertEquals(0, bag.count(new Item("bla")));
        assertEquals(0, bag.count(new Item("ble")));
        assertEquals(0, bag.count(new Item("bli")));
        assertEquals(0, bag.price());
        assertNull(bag.mostPricey());
        assertEquals(0, bag.weight(), TOLERANCE);
    }
}