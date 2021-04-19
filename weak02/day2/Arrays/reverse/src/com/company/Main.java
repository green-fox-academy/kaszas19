package com.company;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] numbers = {3, 4, 5, 6, 7, 8, 9};
    int[] reverse = new int[numbers.length];


    for (int i = 0; i < numbers.length; i++) {
      reverse[i] = numbers[numbers.length-1-i];
    }
    System.out.println(Arrays.toString(reverse));
  }
}
