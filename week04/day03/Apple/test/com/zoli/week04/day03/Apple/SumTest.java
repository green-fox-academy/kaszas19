package com.zoli.week04.day03.Apple;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumTest {

  private Sum sum;

  @BeforeEach
  void setSum() {
    sum = new Sum();
  }

  @Test
  void testMultipleElements() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(2, 3, 5, 10));
    assertEquals(20, sum.sum(numbers));
  }

  @Test
  void testOneElement() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5));
    assertEquals(5, sum.sum(numbers));
  }

  @Test
  void testEmptyElement() {
    ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList());
    assertEquals(0, sum.sum(numbers));
  }

  @Test
  void testNullElement() {
    assertThrows(IllegalArgumentException.class, () -> sum.sum(null));
  }
}
