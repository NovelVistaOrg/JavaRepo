package com.tomgregory;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void add() {
        Calculator calc = new Calculator();
        assertEquals(3, calc.add(2, 3));
    }
}
