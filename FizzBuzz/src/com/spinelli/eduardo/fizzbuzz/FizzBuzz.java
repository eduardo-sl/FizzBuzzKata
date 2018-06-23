package com.spinelli.eduardo.fizzbuzz;

public class FizzBuzz {

  private Fizz fizz = Fizz.getInstance();
  private Buzz buzz = Buzz.getInstance();

  private static FizzBuzz uniqueInstance;


  private FizzBuzz() {}

  public static FizzBuzz getInstance() {
    if (uniqueInstance == null)
      uniqueInstance = new FizzBuzz();

    return uniqueInstance;
  }

  public String print(Integer number) {

    if (isFizzAndBuzz(number)) {
      return getFizzBuzz();
    } else if (fizz.is(number)) {
      return fizz.name();
    } else if (buzz.is(number)) {
      return buzz.name();
    } else {
      return number.toString();
    }

  }

  private String getFizzBuzz() {
    return fizz.name() + buzz.name();
  }

  private boolean isFizzAndBuzz(Integer number) {
    return fizz.is(number) && buzz.is(number);
  }

}
