package com.company;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("How many girls comes to a party?");
    int girls = sc.nextInt();
    System.out.println("How many boys comes to the party?");
    int boys = sc.nextInt();

    int sum = girls + boys;

    if (girls == boys && sum > 20) {
      System.out.println("The party is excellent!");
    } else if (girls != boys && sum > 20) {
      System.out.println("Quite a cool party!");
    } else if (girls > 0 && sum < 20) {
      System.out.println("Average party...");
    } else if (girls == 0) {
      System.out.println("Sausage party");
    }
  }
}
