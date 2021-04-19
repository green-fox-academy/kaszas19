package com.company;

public class Main {

  public static void main(String[] args) {

    // Create a method that can reverse a String which is passed as parameter
    // Pass the toBeReversed variable to this method to check if it works well
    // Solve this task using charAt() function first
    // Try other solutions when you are done

    String toBeReversed =
        ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";
    String reverse = "";
    for (int i = 0; i < toBeReversed.length(); i++) {
      reverse += toBeReversed.charAt(toBeReversed.length() - 1 - i);
    }
    System.out.println(reverse);
  }
}
