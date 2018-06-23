package com.spinelli.eduardo.fizzbuzz;

public class Fizz implements DivisibleNumber {

  private static final String NAME = "Fizz";

  private static Fizz uniqueInstance;

  private Fizz() {}

  public static Fizz getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new Fizz();

    return uniqueInstance;
  }

  @Override
  public Boolean is(Integer number) {
    valid(number);
    return number % 3 == 0;
  }

  @Override
  public String name() {
    return NAME;
  }

}
