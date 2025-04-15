package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
  /**
   * Logger for the Calculator class, used to log method calls and errors.
   */
  private static final Logger logger = LogManager.getLogger(Calculator.class);

  /**
   * Adds two numbers together
   * 
   * @param number1 the first number to add
   * @param number2 the second number to add
   * @return the sum of number1 and number2
   */
  public double add(double number1, double number2) {
    double result = number1 + number2;
    logger.debug("add called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  /**
   * Subtracts two numbers.
   * 
   * @param number1 the number to be subtracted from
   * @param number2 the number that is subtracted from number1
   * @return the result of subtracting number2 from number1
   */
  public double minus(double number1, double number2) {
    double result = number1 - number2;
    logger.debug("minus called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  /**
   * Divides two numbers.
   * 
   * @param number1 dividend the number to be divided
   * @param number2 divisor the number to divide by
   * @return the result of the division
   * @throws ArithmeticException if the divisor is zero
   */
  public double divide(double number1, double number2) {
    logger.debug("divide called with: a=" + number1 + ", b=" + number2);
    if (number2 == 0) {
      logger.error("Division durch 0!");
      throw new ArithmeticException("division by 0 isn't allowed");
    }
    return number1 / number2;
  }

  /**
   * Multiplies two numbers.
   * 
   * @param number1 the first number to be multiplied
   * @param number2 the second number to multiply with number1
   * @return the result of multiplying number1 and number2
   */
  public double multiply(double number1, double number2) {
    double result = number1 * number2;
    logger.debug("multiply called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  /**
   * Calculates the factorial of a non-negative integer.
   * 
   * @param n the number for which the factorial is to be calculated
   * @return the factorial of the number n
   * @throws IllegalArgumentException if n is negative
   */
  public int factorial(int n) {
    if (n < 0) {
      logger.error("Invalid input for factorial: n cannot be negative");
      throw new IllegalArgumentException("n cannot be a negative number");
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    logger.debug("factorial called with: n=" + n + ", result=" + result);
    return result;
  }

}