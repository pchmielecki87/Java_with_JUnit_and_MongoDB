package one.techbrain;

/**
 * A simple calculator class that performs basic arithmetic operations.
 */
public class SimpleCalculator {

    /**
     * Adds two integer numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The sum of a and b.
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * @param a The number to subtract from.
     * @param b The number to subtract.
     * @return The difference between a and b.
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integer numbers.
     * @param a The first number.
     * @param b The second number.
     * @return The product of a and b.
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * @param a The numerator.
     * @param b The denominator (cannot be zero).
     * @return The quotient of a divided by b.
     * @throws IllegalArgumentException if the denominator (b) is zero.
     */
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (b = 0)");
        }
        // Cast to double to ensure accurate decimal division result
        return (double) a / b;
    }
}