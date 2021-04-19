package com.company;

public class Main {

  public static void main(String[] args) {
    System.out.println(subStr("this is what I'm searching in", "searching"));

    // should print: `-1`
    System.out.println(subStr("this is what I'm searching in", "not"));

  }

  public static int subStr(String input, String q) {
    return input.indexOf(q);
  }
}
