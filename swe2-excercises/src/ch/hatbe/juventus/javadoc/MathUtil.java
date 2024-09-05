package ch.hatbe.juventus.javadoc;

import java.util.List;

/**
 * Utility class for performing basic mathematical operations such as addition,
 * subtraction, division, and multiplication on a list of numbers.
 */
public class MathUtil {

    /**
     * Sums all the numbers in the provided list.
     *
     * @param numbers the list of numbers to be added
     * @return the sum of the numbers in the list
     */
    public double addition(List<Double> numbers) {
        double result = 0;

        for(double number : numbers) {
            result += number;
        }

        return result;
    }

    /**
     * Subtracts all the numbers in the provided list from an initial value of 0.
     *
     * @param numbers the list of numbers to be subtracted
     * @return the result of the subtraction
     */
    public double subtraktion(List<Double> numbers) {
        double result = 0;

        for(double number : numbers) {
            result -= number;
        }

        return result;
    }

    /**
     * Divides an initial value of 0 by all the numbers in the provided list.
     * <p>
     * This method will always return 0 because dividing 0 by any number yields 0.
     * It also does not handle division by zero.
     *
     * @param numbers the list of numbers to divide by
     * @return the result of the division, which is always 0
     */
    public double division(List<Double> numbers) {
        double result = 0;

        for(double number : numbers) {
            result /= number;
        }

        return result;
    }

    /**
     * Multiplies an initial value of 0 by all the numbers in the provided list.
     * <p>
     * This method will always return 0 because multiplying 0 by any number yields 0.
     *
     * @param numbers the list of numbers to multiply
     * @return the result of the multiplication, which is always 0
     */
    public double multiplikation(List<Double> numbers) {
        double result = 0;

        for(double number : numbers) {
            result *= number;
        }

        return result;
    }
}