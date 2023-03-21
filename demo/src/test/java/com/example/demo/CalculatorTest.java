package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    @Test
    void testAdder() {
        Calculator calculator = new Calculator();
        int sum = calculator.add(2, 3);
        assertEquals(5, sum);
    }

    @Test
    void testAdder1() {
        Calculator calculator = new Calculator();

        assertThrows(NullPointerException.class, () -> calculator.add(null, 3));

    }

    @Test
    void testSub()
    {
        Calculator calculator = new Calculator();
        int sub = calculator.subtract(3,5);
        assertEquals(-2,sub);
    }

    // if someone goes to the multiply method of
    // Calculator class and change multiply to divide
    // and then runs gradle build
    // the app will break
    // and this is the importance of unit testing to protect your code
    @Test
    void multiplier()
    {
        Calculator calculator
                = new Calculator();
        int mul = calculator.multiply(10,9);
        assertEquals(90,mul);
    }
}
