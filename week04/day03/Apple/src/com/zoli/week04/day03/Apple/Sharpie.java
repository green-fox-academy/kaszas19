package com.zoli.week04.day03.Apple;

public class Sharpie {

  String color;
  float width;
  float inkAmount;

  public Sharpie(String color, float width) {
    this.color = color;
    this.width = width;
    this.inkAmount = 100;
  }

  public void use() {
    if (inkAmount < 10){
      throw new IllegalArgumentException();
    }
    this.inkAmount -= 10;

  }

}
