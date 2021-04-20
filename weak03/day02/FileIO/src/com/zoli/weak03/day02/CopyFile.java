package com.zoli.weak03.day02;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CopyFile {
  public static void main(String[] args) {

    // Write a function that copies the contents of a file into another file
// It should take two filenames (string) as parameters:
//  - path and name of the source file
//  - path and name of the target file
// It should return a boolean that shows if the copy was successful


  //copyFiles("my-file.txt", "copy-myFile.txt");
    System.out.println(copyFiles("my-file.txt", "copy-myFile.txt"));
  }

  public static boolean copyFiles(String source, String target) {
    Path filePath = Paths.get("data/" + source);
    List<String > content = new ArrayList<>();

    try{
      content = Files.readAllLines(filePath, StandardCharsets.UTF_8);
      Files.write(Paths.get("data/" + target), content, StandardCharsets.UTF_8);
      return true;
    }catch (IOException e) {
      System.out.println("File error");
    }
    return false;
  }



}
