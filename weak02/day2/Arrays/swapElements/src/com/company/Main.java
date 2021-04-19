package com.company;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    String[] orders = {"first", "second", "third"};

    String temp = orders[0];
    orders[0] = orders[orders.length - 1];
    orders[orders.length - 1] = temp;

    System.out.println(Arrays.toString(orders));
  }
}
