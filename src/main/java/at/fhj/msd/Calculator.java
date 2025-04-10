package at.fhj.msd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
  private static final Logger logger = LogManager.getLogger(Calculator.class);

  public double add(double number1, double number2) {
    double result = number1 + number2;
    logger.info("add called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  public double minus(double number1, double number2) {
    double result = number1 - number2;
    logger.info("minus called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  public double divide(double a, double b) {
    logger.info("divide called with: a=" + a + ", b=" + b);
    if (b == 0) {
      logger.error("Division durch 0!");
      throw new IllegalArgumentException("Divisor darf nicht 0 sein.");
    }
    return a / b;
  }

  public double multiply(double number1, double number2) {
    double result = number1 * number2;
    logger.info("multiply called with: number1=" + number1 + ", number2=" + number2 + ", result=" + result);
    return result;
  }

  public int factorial(int n) {
    if (n < 0) {
      logger.error("Invalid input for factorial: n cannot be negative");
      throw new IllegalArgumentException("n darf nicht negativ sein.");
    }
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    logger.info("factorial called with: n=" + n + ", result=" + result);
    return result;
  }

}
