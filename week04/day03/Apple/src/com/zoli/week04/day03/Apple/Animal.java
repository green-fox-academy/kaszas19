package com.zoli.week04.day03.Apple;

public class Animal {

  int hunger = 50;
  int thirst = 50;

  public void eat() {
    this.hunger--;
  }

  public void drink() {
    this.thirst--;
  }

  public void play() {
    this.thirst++;
    this.hunger++;
  }

}
