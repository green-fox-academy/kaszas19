package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("typ in the square side of length:");
    int side = sc.nextInt();

    for (int i = 0; i < side; i++) {
      System.out.print("#");
    }
    System.out.println(" ");

    for (int i = 1; i <= side - 2; i++) {
      System.out.print("#");
      for (int e = 0; e < i - 1; e++) {
        System.out.print(" ");
      }
      System.out.print("#");

      for (int j = 0; j < side - 2 - i; j++) {
        System.out.print(" ");
      }
      System.out.println("#");
    }

    for (int i = 0; i < side; i++) {
      System.out.print("#");
    }
  }
}
