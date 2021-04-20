package com.zoli.weak03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Doubled {
  public static void main(String[] args) {

    // Create a method that decrypts the duplicated-chars.txt.
    // Decryption is the process reversing an encryption, i.e. the process
    // which converts encrypted data into its original form.
    lines();
  }

  public static void lines() {
    Path filePath = Paths.get("data/duplicated-chars.txt");

    try {
      List<String> content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      for (String line : content) {
        for (int i = 0; i < line.length() - 1; i += 2) {
          System.out.print(line.charAt(i));
        }
        System.out.println();
      }
    } catch (IOException e) {
      System.out.println("File error");
    }
  }
}
