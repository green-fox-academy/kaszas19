package com.zoli.weak03.day03;

import java.util.ArrayList;
import java.util.List;

public class SharpieSet {

  List<Sharpie> sharpieList = new ArrayList<>();

  public void add(Sharpie sharpie) {
    sharpieList.add(sharpie);
  }

  public int countUsable() {
    int co = 0;
    for (Sharpie sharpie : sharpieList) {
      if (sharpie.inkAmount > 0) {
        co += 1;
      }
    }
    return co;
  }
}
