package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("how many numbers, do you want to sum: ");
    int number = sc.nextInt();
    int sum = 0;

    for (int i = 0; i < number; i++) {
      System.out.print("can you type the number: ");
      sum += sc.nextInt();
    }
    System.out.println("Sum: " + sum + " Average: " + (sum / number));
  }
}
