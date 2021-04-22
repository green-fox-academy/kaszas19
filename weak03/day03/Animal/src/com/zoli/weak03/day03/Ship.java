package com.zoli.weak03.day03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  List<Pirate> crew;
  Pirate captain;

  Ship(){
    crew = new ArrayList<>();
    captain = new Pirate();
  }

  public void fillShip(){
    Random rnd = new Random();
    int number = rnd.nextInt(113) +1;
    for (int i = 0; i < number; i++) {
      crew.add(new Pirate());
    }
  }

  public void commandLine(){
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      Pirate creww = crew.get(i);
      if (creww.isAlive){
        counter++;
      }
    }
  }


}
