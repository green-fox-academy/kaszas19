package com.company;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] numberList = {3, 4, 5, 6, 7};
    int i = 0;
    for (i = 0; i < numberList.length; i++) {
      numberList[i] *= 2;
    }
    System.out.println(Arrays.toString(numberList));
  }
}
