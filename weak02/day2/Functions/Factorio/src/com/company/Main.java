package com.company;

public class Main {

  public static void main(String[] args) {

    //  Create the usual class wrapper and main method on your own

    // - Create a function called `calculateFactorial()`
    //   that returns the factorial of its input

    System.out.println(calculateFactorial(5));
  }

  public static int calculateFactorial(int number) {
    int calc = 1;
    for (int i = 1; i <= number; i++) {
      calc *= i;
    }
    return calc;
  }
}
