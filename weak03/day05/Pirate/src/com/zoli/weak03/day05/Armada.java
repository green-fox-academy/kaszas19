package com.zoli.weak03.day05;

import java.util.List;

public class Armada {

  private List<Ship> ships;

  public Armada(){
    int rand = (int) ((Math.random() * (100 - 1)) +1);
    for (int i = 0; i < rand; i++) {
      ships.add(new Ship());
    }
  }
  public void ArmadaWar(Armada otherArmada){
    for (int i = 0; i < ships.size(); i++) {
     Ship ship = ships.get(i);
     if (ship.battle(otherArmada.notDestroyedShip())){
       ship.setDestroy(true);
      }else{
       otherArmada.notDestroyedShip().setDestroy(true);
     }
    }
  }

  public Ship notDestroyedShip(){
    for(int i = 0; i < ships.size(); i++) {
      if (ships.get(i).isDestroy() != false){
        return ships.get(i);
      }
    }return null;
  }


}
