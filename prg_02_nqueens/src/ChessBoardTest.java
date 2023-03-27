/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: Prg 02 - ChessBoardTest
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ChessBoardTest {

    @Test
    public void testEmptyBoard() {
        ChessBoard cb = new ChessBoard(5);
        assertTrue(cb.isValid());
        assertFalse(cb.isSolved());
        assertEquals(0, cb.queens());
        assertFalse(cb.hasQueen(0));
    }

    @Test
    public void testValidNotSolved() {
        ChessBoard cb = new ChessBoard(5);
        cb.setQueen(0, 1);
        cb.setQueen(1, 3);
        cb.setQueen(2, 0);
        assertTrue(cb.isValid());
        assertFalse(cb.isSolved());
        assertEquals(3, cb.queens());
        assertTrue(cb.hasQueen(2));
        assertFalse(cb.hasQueen(3));
    }

    @Test
    public void testValidSolved() {
        ChessBoard cb = new ChessBoard(5);
        cb.setQueen(0, 1);
        cb.setQueen(1, 3);
        cb.setQueen(2, 0);
        cb.setQueen(3, 2);
        cb.setQueen(4, 4);
        assertTrue(cb.isValid());
        assertTrue(cb.isSolved());
        assertEquals(5, cb.queens());
        assertTrue(cb.hasQueen(4));
        assertFalse(cb.hasQueen(5));
    }

    @Test
    public void testInvalidHorizontalAligned() {
        ChessBoard cb = new ChessBoard(5);
        cb.setQueen(0, 0);
        cb.setQueen(0, 1);
        cb.setQueen(0, 2);
        cb.setQueen(0, 3);
        cb.setQueen(0, 4);
        assertFalse(cb.isValid());
        assertFalse(cb.isSolved());
        assertEquals(5, cb.queens());
        assertTrue(cb.hasQueen(0));
        assertFalse(cb.hasQueen(1));
    }

    @Test
    public void testInvalidVerticalAligned() {
        ChessBoard cb = new ChessBoard(5);
        cb.setQueen(0, 0);
        cb.setQueen(1, 0);
        cb.setQueen(2, 0);
        cb.setQueen(3, 0);
        cb.setQueen(4, 0);
        assertFalse(cb.isValid());
        assertFalse(cb.isSolved());
        assertEquals(5, cb.queens());
        assertTrue(cb.hasQueen(0));
        assertTrue(cb.hasQueen(1));
        assertTrue(cb.hasQueen(2));
        assertTrue(cb.hasQueen(3));
        assertTrue(cb.hasQueen(4));
    }
}