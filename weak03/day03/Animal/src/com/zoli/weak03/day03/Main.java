package com.zoli.weak03.day03;

public class Main {

  public static void main(String[] args) {

    Animal zebra = new Animal();
    System.out.println(zebra.hunger);
    System.out.println(zebra.thirst);

    zebra.play();
    zebra.play();
    zebra.play();
    zebra.play();
    zebra.play();
    zebra.play();
    zebra.play();

    System.out.println(zebra.hunger);
    System.out.println(zebra.thirst);
  }
}
