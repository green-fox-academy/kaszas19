package com.zoli.week04.day01.Garden.plants;

public class Plant {
  protected String color;
  protected int waterMax;
  protected int waterAmount;
  protected double absorbWater;
  protected String plantType;

  public Plant(String color, int waterMax, double absorbWater, String plantType) {
    this.color = color;
    this.waterMax = waterMax;
    this.absorbWater = absorbWater;
    this.plantType = plantType;
  }

  public void addWater(double amount) {
    if (waterAmount < waterMax) {
      waterAmount += amount * absorbWater;
    }
  }

  public boolean needWater() {
    return waterAmount < waterMax;
  }

  public void moreWater() {
    if (waterAmount >= waterMax) {
      System.out.printf("The %s %s doesn't need water\n", color, plantType);
    } else {
      System.out.printf("The %s %s needs more water\n", color, plantType);
    }
  }
}
