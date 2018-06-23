package com.spinelli.eduardo.fizzbuzz;

import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.spinelli.eduardo.fizzbuzz.exception.InvalidNumberException;

class FizzBuzzTest {

  private static final String BUZZ = "Buzz";
  private static final String FIZZ = "Fizz";
  private static final String FIZZ_BUZZ = FIZZ + BUZZ;
  private static FizzBuzz fizzBuzz;

  @BeforeAll
  final static void initialize() {
    fizzBuzz = FizzBuzz.getInstance();
  }


  @Test
  final void isNumberNotDivisibleByThreeAndNotDivisibleByFiveExpectedNumber() {
    assertEquals("1", fizzBuzz.print(1));
    assertEquals("2", fizzBuzz.print(2));
    assertEquals("26", fizzBuzz.print(26));
    assertEquals("82", fizzBuzz.print(82));
  }

  @Test
  final void isNumberDivisibleByThreeExpectedFizz() {
    assertEquals(FIZZ, fizzBuzz.print(3));
    assertEquals(FIZZ, fizzBuzz.print(6));
    assertEquals(FIZZ, fizzBuzz.print(18));
  }

  @Test
  final void isNumberDivisibleByFiveExpectedBuzz() {
    assertEquals(BUZZ, fizzBuzz.print(5));
    assertEquals(BUZZ, fizzBuzz.print(10));
    assertEquals(BUZZ, fizzBuzz.print(100));
  }

  @Test
  final void isNumberDivisibleByThreeAndFiveExpectedFizzBuzz() {
    assertEquals(FIZZ_BUZZ, fizzBuzz.print(15));
    assertEquals(FIZZ_BUZZ, fizzBuzz.print(45));
    assertEquals(FIZZ_BUZZ, fizzBuzz.print(90));
  }

  @Test
  final void isNumberLessOneExpectedInvalidaNumber() {
    try {
      fizzBuzz.print(0);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be greater than 0", e.getMessage());
    }
  }

  @Test
  final void isNumberMoreHundredExpectedInvalidaNumber() {
    try {
      fizzBuzz.print(107);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be less than 101", e.getMessage());
    }
  }

}
