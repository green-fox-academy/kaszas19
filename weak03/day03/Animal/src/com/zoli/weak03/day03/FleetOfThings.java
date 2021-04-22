package com.zoli.weak03.day03;

import java.util.ArrayList;

public class FleetOfThings {
  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    // - You have the `Thing` class
    // - You have the `Fleet` class
    // - You have the `FleetOfThings` class with a `main()` method
    // - Download those, use those
    // - Create a fleet in the main() method

    // - Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch
    // 4. [x] Eat lunch
    // 4. [x] Eat lunch
    // 4. [x] Eat lunch
    // 4. [x] Eat lunch



    fleet.add(new Thing("Fet Milk", false));
    fleet.add(new Thing("Remove the obstacle", false));
    fleet.add(new Thing("Stand up", true));
    fleet.add(new Thing("Eat lunch", true));

    System.out.println(fleet);
  }
}
