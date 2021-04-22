package com.zoli.weak03.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Farm {
  int capacity;
  List<Animal> animals = new ArrayList<>();
  Farm(){
    this.capacity = 200;
  }

  public void breed(Animal animal){
   if (animals.size() < capacity) {
     animals.add(animal);
   }
  }

  public void sell(){
    Animal animal= animals.get(0);
    for (int i = 0; i < animals.size(); i++) {
      if (animals.get(i).hunger < animal.hunger){
        animal = animals.get(i);
      }
    }
    animals.remove(animal);
  }

}
