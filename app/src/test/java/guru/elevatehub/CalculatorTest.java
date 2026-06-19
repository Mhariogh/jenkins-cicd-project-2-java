package guru.elevatehub;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    void addsTwoNumbers() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(-1, 1));
    }

    @Test
    void subtractsTwoNumbers() {
        assertEquals(4, calculator.subtract(5, 1));
        assertEquals(-2, calculator.subtract(1, 3));
    }

    @Test
    void multipliesTwoNumbers() {
        assertEquals(12, calculator.multiply(3, 4));
        assertEquals(0, calculator.multiply(0, 10));
    }
}

