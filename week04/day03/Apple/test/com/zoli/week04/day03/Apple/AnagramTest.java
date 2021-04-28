package com.zoli.week04.day03.Apple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

  Anagram anagram;

  @BeforeEach
  void words() {
    anagram = new Anagram();
  }

  @Test
  void isAnagram() {
    assertTrue(anagram.isAnagram("kola", "lako"));
  }

  @Test
  void isNotAnagram() {
    assertFalse(anagram.isAnagram("haz", "lako"));
  }

  @Test
  void isItNull() {
    assertThrows(IllegalArgumentException.class, () -> anagram.isAnagram("kola", null));
  }
}
