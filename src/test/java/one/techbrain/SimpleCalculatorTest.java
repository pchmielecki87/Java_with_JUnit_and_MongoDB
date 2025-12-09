package one.techbrain;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Unit tests for the SimpleCalculator class using JUnit 5.
 * Provides 5 standard (non-mocked) tests.
 */
class SimpleCalculatorTest {

    private final SimpleCalculator calculator = new SimpleCalculator();

    // 1. Test for adding two positive numbers
    @Test
    void add_TwoPositiveNumbers_ReturnsCorrectSum() {
        // Arrange
        int a = 5;
        int b = 10;
        int expected = 15;

        // Act
        int result = calculator.add(a, b);

        // Assert
        assertEquals(expected, result, "The sum of 5 + 10 should be 15");
    }

    // 2. Test for subtracting a negative number
    @Test
    void subtract_NegativeNumber_ReturnsCorrectDifference() {
        // Arrange
        int a = 20;
        int b = -5; // 20 - (-5) = 25
        int expected = 25;

        // Act
        int result = calculator.subtract(a, b);

        // Assert
        assertEquals(expected, result, "The difference 20 - (-5) should be 25");
    }

    // 3. Test for multiplication by zero
    @Test
    void multiply_ByZero_ReturnsZero() {
        // Arrange
        int a = 150;
        int b = 0;
        int expected = 0;

        // Act
        int result = calculator.multiply(a, b);

        // Assert
        assertEquals(expected, result, "The product of anything multiplied by 0 should be 0");
    }

    // 4. Test for division resulting in an accurate double (decimal) value
    @Test
    void divide_DivisibleNumbers_ReturnsCorrectDoubleResult() {
        // Arrange
        int a = 10;
        int b = 4; // 10 / 4 = 2.5
        double expected = 2.5;
        double delta = 0.0001; // Delta for double comparison

        // Act
        double result = calculator.divide(a, b);

        // Assert
        assertEquals(expected, result, delta, "The quotient 10 / 4 should be 2.5");
    }

    // 5. Test to ensure an exception is thrown when dividing by zero
    @Test
    void divide_ByZero_ThrowsException() {
        // Arrange
        int a = 10;
        int b = 0;

        // Act & Assert
        // Expect that calling the divide method throws an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(a, b);
        }, "Division by zero must throw an IllegalArgumentException");
    }
}