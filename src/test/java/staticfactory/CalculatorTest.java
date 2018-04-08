package staticfactory;


import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {
    @Test
    public void testPlus() {
        assertEquals(4, Calculator.calculate(2, 2, "+"));
    }

    @Test
    public void testMinus() {
        assertEquals(1, Calculator.calculate(2, 1, "-"));
    }

    @Test
    public void testMultiply() {
        assertEquals(4, Calculator.calculate(2, 2, "*"));
    }

    @Test
    public void testDivide() {
        assertEquals(2, Calculator.calculate(4, 2, "/"));
    }
}
