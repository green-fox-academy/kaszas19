package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Can you give me the square side length: ");
    int side = sc.nextInt();

    for (int i = 0; i < side; i++) {
      System.out.print("#");
    }
    System.out.println(" ");

    for (int i = 0; i < side - 2; i++) {
      System.out.print("#");
      for (int j = 0; j < side - 2; j++) {
        System.out.print(" ");
      }
      System.out.println("#");
    }

    for (int i = 0; i < side; i++) {
      System.out.print("#");
    }
    System.out.println(" ");
  }
}
