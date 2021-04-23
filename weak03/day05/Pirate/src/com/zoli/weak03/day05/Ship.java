package com.zoli.weak03.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> crew;
  private Pirate captain;



  Ship(){
    this.crew = new ArrayList<>();
    this.captain = new Pirate();

  }

  public void fillShip(){
    Random rnd = new Random();
    int number = rnd.nextInt(113) +1;
    for (int i = 0; i < number; i++) {
      crew.add(new Pirate());
    }
  }

  public int commandLine(){
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      Pirate creww = crew.get(i);
      if (creww.isAlive()){
        counter++;
      }
    }return counter;
  }

  public boolean battle(Ship ship2){
    Ship winner;
    Ship loser;
    if (this.score() > ship2.score()){
      winner = this;
      loser = ship2;
    }else {
      winner = ship2;
      loser = this;
    }
  }

  public int score(){
    return commandLine() - captain.getToxicaterate();
  }

  public void loseBattle() {
    Random rnd = new Random();
    int number = rnd.nextInt(commandLine());

  }

}
