package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for TriangleNumberCalculator.
 * Tests recursive calculation, addition, and subtraction of triangular numbers.
 *
 * @author Zhengjia Liu
 */
class TriangleNumberCalculatorTest {

    /**
     * Tests recursive calculation of the nth triangular number.
     */
    @Test
    void testValue() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(1, calculator.recursiveCalc(1), "T1 should be 1");
        assertEquals(3, calculator.recursiveCalc(2), "T2 should be 3");
        assertEquals(6, calculator.recursiveCalc(3), "T3 should be 6");
        assertEquals(10, calculator.recursiveCalc(4), "T4 should be 10");
        assertEquals(15, calculator.recursiveCalc(5), "T5 should be 15");
    }

    /**
     * Tests addition of two triangular numbers.
     */
    @Test
    void testAdd() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(2, calculator.add(1, 1), "T1 + T1 = 2");
        assertEquals(9, calculator.add(2, 3), "T2 + T3 = 9");
        assertEquals(13, calculator.add(4, 2), "T4 + T2 = 13");
        assertEquals(42, calculator.add(6, 6), "T6 + T6 = 42");
    }

    /**
     * Tests subtraction of two triangular numbers.
     */
    @Test
    void testSubtract() {
        TriangleNumberCalculator calculator = new TriangleNumberCalculator();
        assertEquals(0, calculator.subtract(1, 1), "T1 − T1 = 0");
        assertEquals(-3, calculator.subtract(2, 3), "T2 − T3 = -3");
        assertEquals(7, calculator.subtract(4, 2), "T4 − T2 = 7");
        assertEquals(0, calculator.subtract(6, 6), "T6 − T6 = 0");
    }
}
