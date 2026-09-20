import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorFailedTest {
    private Calculator calculator = new Calculator();

    @Test
    void shouldAddTwoNumbers() {
        assertEquals(4, calculator.add(1, 2));
    }

    @Test
    void shouldSubtractTwoNumbers() {
        assertEquals(-2, calculator.subtract(1, 2));
    }

    @Test
    void shouldMultiplyTwoNumbers() {
        assertEquals(9, calculator.multiply(2, 3));
    }
}
