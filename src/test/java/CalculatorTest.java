import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(-1, calculator.subtract(1, 2));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(6, calculator.multiply(2, 3));
    }
}
