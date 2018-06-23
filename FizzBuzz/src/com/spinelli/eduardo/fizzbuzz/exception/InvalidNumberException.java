package com.spinelli.eduardo.fizzbuzz.exception;

public class InvalidNumberException extends RuntimeException {
  
  private static final long serialVersionUID = -5874190794417279323L;

  public InvalidNumberException() {
    super();
  }

  public InvalidNumberException(String message) {
    super(message);
  }

  public InvalidNumberException(String message, Throwable cause) {
    super(message, cause);
  }

  public InvalidNumberException(Throwable cause) {
    super(cause);
  }
}
