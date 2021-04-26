package com.zoli.week04.day01.Garden.gardens;

import com.zoli.week04.day01.Garden.plants.Plant;
import java.util.ArrayList;
import java.util.List;

public class Garden {
  List<Plant> plants;

  public Garden() {
    plants = new ArrayList<>();
  }

  public void addPlant(Plant plant) {
    plants.add(plant);
  }

  public void watering(int water) {
    if (water == 0) {
      System.out.println("Needs water!!!");
      return;
    }
    System.out.println("Watering with " + water);
    double waters = (double) water / infoPlants();
    for (Plant plant : plants) {
      if (plant.needWater()) {
        plant.addWater(waters);
      }
    }
    infoGarden();
  }

  public void infoGarden() {
    for (Plant plant : plants) {
      plant.moreWater();
    }
  }

  public int infoPlants() {
    int sum = 0;
    for (Plant plant : plants) {
      if (plant.needWater()) {
        sum++;
      }
    }
    return sum;
  }
}
