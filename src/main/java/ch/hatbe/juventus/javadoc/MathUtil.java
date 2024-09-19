package ch.hatbe.juventus.javadoc;

import java.util.List;

/**
 * Utility class for performing basic mathematical operations such as addition,
 * subtraction, division, and multiplication on a list of numbers.
 */
public class MathUtil {
    /**
     * This method adds all the given numbers to a total.
     * If the input list is empty, 0 will be returned.
     * If the input list is null, a NullPointerException will be thrown.
     *
     * @param numbers The list of numbers to add together
     * @return The sum of all the given numbers
     * @throws NullPointerException Thrown if the input list is null
     */
    public double addition(List<Double> numbers) {
        double result = 0;
        for (Double number : numbers) {
            result += number;
        }
        return result;
    }

    /**
     * This method subtracts the second number from the first and returns the result.
     * Params can not be null.
     * @param a The number to subtract from
     * @param b The number to subtract
     * @return The result of the subtraction
     */
    public double subtraction(double a, double b) {
        return a - b;
    }

    /**
     * This method divides the first number by the second and returns the result.
     * Params can not be null.
     * @param a The number to divide
     * @param b The number to divide by
     * @return The result of the division
     */
    public double division(double a, double b) {
        return a / b;
    }

    /**
     * This method multiplies the first number by the second and returns the result.
     * Params can not be null.
     * @param a The number to multiply
     * @param b The number to multiply by
     * @return The result of the multiplication
     */
    public double multiplication(double a, double b) {
        return a * b;
    }

}