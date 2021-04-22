package com.zoli.weak03.day02;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Logs {
  public static void main(String[] args) {

    // Read all data from 'log.txt'
    // Each line represents a log message from a web server
    // Write a function that returns an array with the unique IP adresses
    // Write a function that returns the GET / POST request ratio

    System.out.println(uniqueIp(adresses()));
    System.out.println(ratio(adresses()));
    // uniqueIp(adresses());

  }

  public static List<String> adresses() {
    Path filePath = Paths.get("data/log.txt");

    try {
      List<String> content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      return content;
    } catch (IOException e) {
      System.out.println("file error");
    }
    return null;
  }

  public static ArrayList<String> uniqueIp(List<String> list) {
    ArrayList<String> ip = new ArrayList<>();
    for (int i = 0; i < list.size(); i++) {
      String ipAdress = list.get(i).substring(27, 38);
      if (!ip.contains(ipAdress)) {
        ip.add(ipAdress);
      }
    }
    return ip;
  }

  public static double ratio(List<String> logList) {
    double get = 0;
    double post = 0;
    for (int i = 0; i < logList.size(); i++) {
      if (logList.get(i).contains("GET")) {
        get++;
      }
      if (logList.get(i).contains("POST")) {
        post++;
      }
    }
    return get / post;
  }
}
