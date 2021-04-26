package com.zoli.week04.day01.OrgInheritance;

public class Mentor extends Person {
  private String level;

  public Mentor() {
    super("Jane Doe", 30, "female");
    this.level = "Intermediate";
  }

  public Mentor(String name, int age, String gender, String level) {
    super(name, age, gender);
    this.level = level;
  }

  @Override
  public void getGoal() {
    System.out.println("Educate brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old " + gender + level + " mentor.");
  }
}
