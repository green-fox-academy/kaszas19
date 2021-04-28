package com.zoli.week04.day02.CharSequence;

public class Helicopter extends Car implements Flyable{

  public Helicopter(){
      name = "Apache";
      wheels = 3;
      color = "blue";
  }

  public Helicopter(String name, int wheels, String color){
      new Helicopter(name, wheels, color);
  }

  @Override
  public void land() {

  }

  @Override
  public void fly() {

  }

  @Override
  public void takeOff() {

  }
}
