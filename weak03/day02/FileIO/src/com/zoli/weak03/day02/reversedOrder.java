package com.zoli.weak03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class reversedOrder {

  public static void main(String[] args) {

    // Create a method that decrypts reversed-order.txt

    lines();
  }

  public static void lines() {
    Path filePath = Paths.get("data/reversed-older.txt");

    try {
      List<String> content = Files.readAllLines(filePath, StandardCharsets.UTF_8);

      for (int i = content.size() - 1; i > 0; i--) {
        System.out.println(content.get(i));
      }


    } catch (IOException e) {
      System.out.println("File error");
    }
  }
}
