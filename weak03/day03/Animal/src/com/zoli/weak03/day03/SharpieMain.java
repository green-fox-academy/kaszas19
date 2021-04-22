package com.zoli.weak03.day03;

public class SharpieMain {
  public static void main(String[] args) {

    Sharpie dodo = new Sharpie("blue", 25);

    dodo.use();
    dodo.use();
    dodo.use();
    dodo.use();

    System.out.println(dodo.inkAmount);

  }

}
