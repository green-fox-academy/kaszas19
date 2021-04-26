package com.zoli.weak03.day05;

import java.util.Random;

public class Pirate {

  private int toxicaterate;

  private boolean isAlive;

  Pirate() {
    this.toxicaterate = 0;
    this.isAlive = true;
  }

  public void drinkSomeRum() {
    if (isAlive) {
      this.toxicaterate++;
    } else {
      System.out.println("he's dead");
    }
  }

  public void howsItGoingMate() {
    if (isAlive) {
      if (toxicaterate < 4) {
        System.out.println("Pour me anudder!");
      } else {
        System.out.println("Arghh, I'ma Pirate. How d'ya d'ink its goin?");
        sleep();
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public void sleep() {
    if (isAlive) {
      this.toxicaterate = 0;
    } else {
      System.out.println("he's dead");
    }
  }

  public void brawl(Pirate pirate) {
    if (isAlive) {
      Random rnd = new Random();
      int number = rnd.nextInt(3);
      if (number == 0) {
        this.die();
      } else if (number == 1) {
        pirate.die();
      } else {
        this.sleep();
        pirate.sleep();
      }
    } else {
      System.out.println("he's dead");
    }
  }

  public void die() {
    this.isAlive = false;
    System.out.println("he's dead");
  }

  public int getToxicaterate() {
    return toxicaterate;
  }

  public boolean isAlive() {
    return isAlive;
  }
}
