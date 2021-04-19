package com.company;

public class Main {

  public static void main(String[] args) {

    // When saving this quote a disk error has occurred. Please fix it!
    // Insert the words "always takes longer than" between the words "It" and "you" using the
    // StringBuilder class!
    // Use pieces of the quote variable (instead of just redefining the string)!

    String quote =
        "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";
    StringBuilder sb = new StringBuilder(quote);
    sb.insert(sb.indexOf("It") + 3, "always takes longer than ");
    // sb.indexOf("valami") pozicio erteket ad. Ide jon a szoveg.

    System.out.println(sb);
  }
}
