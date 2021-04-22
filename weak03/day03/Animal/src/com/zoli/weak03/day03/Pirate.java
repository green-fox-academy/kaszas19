package com.zoli.weak03.day03;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Random;

public class Pirate {
  int toxicaterate;
  boolean isAlive;

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

  public void drinkSomeRun() {
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

}
