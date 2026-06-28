package com.example;

import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

public class AppTest {
    
    private Calculator calculator;
    
    @Before
    public void setUp() {
        calculator = new Calculator();
    }
    
    @Test
    public void testAddition() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
        assertEquals(-5, calculator.add(-2, -3));
    }
    
    @Test
    public void testSubtraction() {
        assertEquals(6, calculator.subtract(10, 4));
        assertEquals(-2, calculator.subtract(0, 2));
        assertEquals(5, calculator.subtract(5, 0));
    }
    
    @Test
    public void testMultiplication() {
        assertEquals(56, calculator.multiply(7, 8));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-12, calculator.multiply(-3, 4));
    }
}
