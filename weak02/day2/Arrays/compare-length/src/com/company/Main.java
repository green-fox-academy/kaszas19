package com.company;

public class Main {

  public static void main(String[] args) {
    int[] firstArrayOfNumbers = {1, 2, 3};
    int[] secondArrayOfNumbers = {4, 5};

    int i = 0;
    int j = 0;

    for (i = 0; i < firstArrayOfNumbers.length; i++) {
      for (j = 0; j < secondArrayOfNumbers.length; j++) {
      }
    }
    if (j > i) {
      System.out.println("secondArrayOfNumbers is longer");
    } else {
      System.out.println("firstArrayOfNumbers is the longer one");
    }
  }
}
