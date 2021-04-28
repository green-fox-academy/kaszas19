package com.zoli.week04.day03.Apple;

import java.util.ArrayList;
import java.util.Arrays;

public class Sum {

  public int sum(ArrayList<Integer> numbers) {
    if (numbers == null) {
      throw new IllegalArgumentException();
    }

    int sum = 0;
    for (int i = 0; i < numbers.size(); i++) {
      sum += numbers.get(i);
    }
    return sum;
  }
}
