package com.company;

public class Main {

  public static void main(String[] args) {

    // Create the usual class wrapper and main method on your own

    // Write a function called `sum()` that returns the sum of numbers from zero to the given
    // parameter

    System.out.println(sum(10));
  }

  public static int sum(int number) {
    int sum = 0;
    for (int i = 1; i <= number; i++) {
      sum += i;
    }
    return sum;
  }
}
