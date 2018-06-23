package com.spinelli.eduardo.fizzbuzz;

import com.spinelli.eduardo.fizzbuzz.exception.InvalidNumberException;

public interface DivisibleNumber {

  Boolean is(Integer number);

  String name();

  default void valid(Integer number) {
    if (number < 1) {
      throw new InvalidNumberException("Number must be greater than 0");
    } else if (number > 100) {
      throw new InvalidNumberException("Number must be less than 101");
    }
  }

}
