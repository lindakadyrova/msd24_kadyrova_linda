package at.fhj.msd;

public class Calculator {

  public double add(double number1, double number2) {
    return number1 + number2;
  }

  public double minus(double number1, double number2) {
    return number1 - number2;
  }

  public double divide(double number1, double number2) {
    return number1 / number2;
  }

  public double multiply(double number1, double number2) {
    return number1 * number2;
  }

  public int factorial(int n) {
    if (n < 0)
      return 0;
    int result = 1;
    for (int i = 2; i <= n; i++) {
      result *= i;
    }
    return result;
  }
}
