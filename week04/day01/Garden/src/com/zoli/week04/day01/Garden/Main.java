package com.zoli.week04.day01.Garden;

import com.zoli.week04.day01.Garden.gardens.Garden;
import com.zoli.week04.day01.Garden.plants.Flower;
import com.zoli.week04.day01.Garden.plants.Tree;

public class Main {

  public static void main(String[] args) {
    Garden garden = new Garden();
    garden.addPlant(new Flower("yellow"));
    garden.addPlant(new Flower("blue"));
    garden.addPlant(new Tree("purple"));
    garden.addPlant(new Tree("orange"));

    garden.infoGarden();
    System.out.println();

    garden.watering(40);
    System.out.println();

    garden.watering(70);
  }
}
