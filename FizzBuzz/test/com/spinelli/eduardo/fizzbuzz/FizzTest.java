package com.spinelli.eduardo.fizzbuzz;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.spinelli.eduardo.fizzbuzz.exception.InvalidNumberException;

class FizzTest {

  private static Fizz fizz;

  @BeforeAll
  final static void initialize() {
    fizz = Fizz.getInstance();
  }

  @Test
  final void isNumberDivisibleByThreeExpectedTrue() {
    assertTrue(fizz.is(3));
    assertTrue(fizz.is(6));
    assertTrue(fizz.is(12));
    assertTrue(fizz.is(87));
    assertTrue(fizz.is(90));
    assertTrue(fizz.is(99));
  }

  @Test
  final void isNumberNotDivisibleByThreeExpectedTrue() {
    assertFalse(fizz.is(2));
    assertFalse(fizz.is(4));
    assertFalse(fizz.is(47));
    assertFalse(fizz.is(71));
    assertFalse(fizz.is(88));
    assertFalse(fizz.is(100));
  }

  @Test
  final void nameExpectedFizz() {
    assertEquals("Fizz", fizz.name());
  }

  @Test
  final void isNumberLessOneExpectedInvalidaNumber() {
    try {
      fizz.is(0);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be greater than 0", e.getMessage());
    }
  }

  @Test
  final void isNumberMoreHundredExpectedInvalidaNumber() {
    try {
      fizz.is(107);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be less than 101", e.getMessage());
    }
  }

}
