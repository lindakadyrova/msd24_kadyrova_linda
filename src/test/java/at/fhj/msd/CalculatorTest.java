package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

  private Calculator calc;

  @BeforeEach
  void setup() {
    calc = new Calculator();
  }

  @Test
  public void testAddNormalValues() {
    double result = calc.add(3, 2);
    assertEquals(5.0, result);
  }

  @Test
  public void testAddWithZero() {
    double result = calc.add(0, 0.0);
    assertEquals(0.0, result);
  }

  @Test
  public void testAddWithNegative() {
    double result = calc.add(-3, 4);
    assertEquals(1.0, result);
  }

  @Test
  public void testMinusNormalValues() {
    double result = calc.minus(6, 3);
    assertEquals(3.0, result);
  }

  @Test
  public void testMinusWithNegative() {
    double result = calc.minus(-6, -3);
    assertEquals(-3.0, result);
  }

  @Test
  public void testMinusWithZero() {
    double result = calc.minus(-6, 0);
    assertEquals(-6.0, result);
  }

  @Test
  public void testDivideNromalValues() {
    double result = calc.divide(6, 2.0);
    assertEquals(3.0, result);
  }

  @Test
  public void testDivideNegativeNumbers() {
    double result = calc.divide(-6, 2.0);
    assertEquals(-3.0, result);
  }

  @Test
  public void exceptionTest() {
    ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
      calc.divide(4, 0);
    });
    assertEquals("division by 0 isn't allowed", exception.getMessage());
  }

  @Test
  public void testMultiplyByNormalValues() {
    double result = calc.multiply(4, 3);
    assertEquals(12.0, result);
  }

  @Test
  public void testMultiplyByNegativeNumbers() {
    double result = calc.multiply(-5, 6);
    assertEquals(-30.0, result);
  }

  @Test
  public void testMultiplyWithZero() {
    double result = calc.multiply(4, 0);
    assertEquals(0.0, result);
  }

  @Test
  void testFactorialPositiveNumbers() {
    Calculator calc = new Calculator();
    assertEquals(2, calc.factorial(2));
  }

  @Test
  void testFactorialNegative() {
      Calculator calc = new Calculator();
      // Check that IllegalArgumentException is thrown for negative input
      IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> {
          calc.factorial(-1);
      });
      assertEquals("n cannot be a negative number", thrown.getMessage());
  }



  @Test
  void testFactorialZero() {
    Calculator calc = new Calculator();
    assertEquals(1, calc.factorial(0));
  }

}
