package com.zoli.weak03.day02;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class PrintEachLine {

  public static void main(String[] args) {
    // Write a program that opens a file called "my-file.txt" and prints each
    // line from the file.
    // If the program is unable to read the file (for example the file does not exist),
    // it should print the following error message: "Unable to read file: my-file.txt".

    Path filePath = Paths.get("data/my-file.txt");
    try {
      List<String> lines = Files.readAllLines(filePath);
      for (String line : lines) {
        System.out.println(line);
      }
    } catch (IOException e) {
      System.out.println("Unable to read file: my-file.txt");
    }
  }
}
