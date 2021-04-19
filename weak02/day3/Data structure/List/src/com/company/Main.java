package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    List<String> myList = new ArrayList<>();
    myList.add("William");
    myList.add("John");
    myList.add("Amanda");
    myList.remove(1);

    for (int i = 0; i < myList.size(); i++) {
      System.out.println(i + 1 + "." + " " + myList.get(i));
    }
    for (int i = myList.size()-1; i >= 0 ; i--) {
      System.out.println((myList.size()-i) + "." + " " + myList.get(i));
    }

    myList.clear();

  }
}
