package com.zoli.weak03.day03;

public class Thing {

  private String name;
  private boolean completed;

  public Thing(String name, boolean completed) {
    this.name = name;
    this.completed = completed;
  }

  public void complete() {
    this.completed = true;
  }

  @Override
  public String toString() {
    return (completed ? "[x] " : "[ ] ") + name;
  }

}
