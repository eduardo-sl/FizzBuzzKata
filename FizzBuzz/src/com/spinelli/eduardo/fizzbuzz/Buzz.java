package com.spinelli.eduardo.fizzbuzz;

public class Buzz implements DivisibleNumber {

  private static final String NAME = "Buzz";

  private static Buzz uniqueInstance;

  private Buzz() {}

  public static Buzz getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Buzz();

    return uniqueInstance;
  }

  @Override
  public Boolean is(Integer number) {
    valid(number);
    return number % 5 == 0;
  }

  @Override
  public String name() {
    return NAME;
  }

}
