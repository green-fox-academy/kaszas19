package com.zoli.week04.day03.Apple;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SharpieTest {

  Sharpie sharpie;

  @BeforeEach
  void sharpies(){
    sharpie = new Sharpie("blue", 5);
  }

  @Test
  void inkAmBige() {
    sharpie.use();
    assertTrue(sharpie.inkAmount == 90);
  }

  @Test
  void illegal() {
    sharpie.inkAmount = 5;
      assertThrows(IllegalArgumentException.class, () -> sharpie.use());
  }



}