package com.zoli.weak03.day05;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ship {

  private List<Pirate> crew;
  private Pirate captain;
  private boolean destroy;

  Ship() {
    this.crew = new ArrayList<>();
    this.captain = new Pirate();
    this.destroy = false;
  }

  public void fillShip() {
    Random rnd = new Random();
    int number = rnd.nextInt(113) + 1;
    for (int i = 0; i < number; i++) {
      crew.add(new Pirate());
    }
  }

  public int alivePirate() {
    int counter = 0;
    for (int i = 0; i < crew.size(); i++) {
      Pirate creww = crew.get(i);
      if (creww.isAlive()) {
        counter++;
      }
    }
    return counter;
  }

  public boolean battle(Ship ship2) {
    Ship winner;
    Ship loser;
    if (this.score() > ship2.score()) {
      winner = this;
      loser = ship2;
      winner.winBattle();
      loser.loseBattle();
      return true;
    } else {
      winner = ship2;
      loser = this;
      loser.loseBattle();
      winner.winBattle();
      return false;
    }
  }

  public int score() {
    return alivePirate() - captain.getToxicaterate();
  }

  public void loseBattle() {
    Random rnd = new Random();
    int number = rnd.nextInt(alivePirate());
    for (Pirate pirate : crew) {
      if (pirate.isAlive() && number > 0) {
        pirate.die();
        number--;
      }
    }
    System.out.println("Lost " + number + " crew members.");
  }

  public void winBattle() {
    for (Pirate pirate : crew) {
      int numberOfRum = (int) ((Math.random() * (10 - 1)) + 1);
      while (numberOfRum > 0) {
        numberOfRum--;
        pirate.drinkSomeRum();
      }
    }
  }

  public boolean isDestroy() {
    return destroy;
  }

  public void setDestroy(boolean destroy) {
    this.destroy = destroy;
  }

}
