package com.zoli.weak03.day03;

public class Station {
  int gasAmount;

  Station() {
    this.gasAmount = 10000;
  }

   public void refill(Car car) {
    this.gasAmount -= car.getCapacity();
    car.gasAmount = car.getCapacity();
  }

  public static void main(String[] args) {

     Car car = new Car();
     Station station = new Station();

     station.refill(car);
     station.refill(car);
     station.refill(car);

    System.out.println(station.gasAmount);

  }
}
