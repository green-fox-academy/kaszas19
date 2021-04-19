package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    //  Create a function that takes an array of numbers as a parameter
    //  and returns an array of integers where every integer is unique (occurs only once)

    //  Example
    System.out.println(findUniqueItems(new int[] {1, 11, 34, 11, 52, 61, 1, 34}));
    //  should print: `[1, 11, 34, 52, 61]`

  }

  public static String findUniqueItems(int[] arr) {
    ArrayList<Integer> result = new ArrayList<>();
    for (int j : arr) {
      if (!result.contains(j)) {
        result.add(j);
      }
    }
    return Arrays.toString(result.toArray());
  }

}
