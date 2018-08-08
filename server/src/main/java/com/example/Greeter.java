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
   *
   * @param someone to say hello
   * @return string as a greeting
   */
  public final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
