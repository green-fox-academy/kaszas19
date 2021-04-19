package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int number = 8;
    int guessNumber;

    do {
      System.out.print("Guess the number: ");
      guessNumber = sc.nextInt();
      if (number > guessNumber) {
        System.out.println("The stored number is higher");
      } else if (number < guessNumber) {
        System.out.println("The stored number is lower");
      } else {
        System.out.println("You found the number: " + number);
      }
    } while (number != guessNumber);
  }
}
