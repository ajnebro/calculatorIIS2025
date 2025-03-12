package org.iis;

/**
 * A simple calculator class that provides basic arithmetic operations.
 * This class handles addition, subtraction, multiplication, and division
 * of integer values.
 */
public class Calculator {
  /**
   * Adds two integers together.
   *
   * @param number1 The first integer
   * @param number2 The second integer
   * @return The sum of the two integers
   */
  public int add(int number1, int number2) {
    return number1 + number2;
  }

  /**
   * Subtracts the second integer from the first.
   *
   * @param number1 The integer to subtract from
   * @param number2 The integer to subtract
   * @return The difference between the two integers
   */
  public int subtract(int number1, int number2) {
    return number1 - number2;
  }

  /**
   * Multiplies two integers together.
   *
   * @param number1 The first integer
   * @param number2 The second integer
   * @return The product of the two integers
   */
  public int multiply(int number1, int number2) {
    return number1 * number2;
  }

  /**
   * Divides the first integer by the second.
   *
   * @param number1 The dividend
   * @param number2 The divisor
   * @return The quotient of the division
   * @throws IllegalArgumentException If the divisor is zero
   */
  public int divide(int number1, int number2) {
    if (number2 == 0) {
      throw new IllegalArgumentException("Dividing by zero is not allowed");
    }
    return number1 / number2;
  }
}