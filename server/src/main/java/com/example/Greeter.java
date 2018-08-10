package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {

  }

  /**
   * Greeter yeah.
   * @param someone someone is here
   * @return greeting to greet him
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
