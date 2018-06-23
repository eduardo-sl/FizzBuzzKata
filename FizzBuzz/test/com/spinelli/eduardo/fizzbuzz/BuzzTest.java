package com.spinelli.eduardo.fizzbuzz;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import com.spinelli.eduardo.fizzbuzz.exception.InvalidNumberException;

class BuzzTest {

  private static Buzz buzz;

  @BeforeAll
  final static void initialize() {
    buzz = Buzz.getInstance();
  }

  @Test
  final void isNumberDivisibleByFiveExpectedTrue() {
    assertTrue(buzz.is(5));
    assertTrue(buzz.is(10));
    assertTrue(buzz.is(15));
    assertTrue(buzz.is(65));
    assertTrue(buzz.is(90));
    assertTrue(buzz.is(100));
  }

  @Test
  final void isNumberNotDivisibleByFiveExpectedFalse() {
    assertFalse(buzz.is(2));
    assertFalse(buzz.is(4));
    assertFalse(buzz.is(47));
    assertFalse(buzz.is(71));
    assertFalse(buzz.is(88));
    assertFalse(buzz.is(97));
  }

  @Test
  final void nameExpectedBuzz() {
    assertEquals("Buzz", buzz.name());
  }

  @Test
  final void isNumberLessOneExpectedInvalidaNumber() {
    try {
      buzz.is(0);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be greater than 0", e.getMessage());
    }
  }

  @Test
  final void isNumberMoreHundredExpectedInvalidaNumber() {
    try {
      buzz.is(107);
      fail();
    } catch (InvalidNumberException e) {
      assertEquals("Number must be less than 101", e.getMessage());
    }
  }

}
