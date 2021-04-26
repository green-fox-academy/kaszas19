package com.zoli.week04.day01.OrgInheritance;

import com.zoli.week04.day01.OrgInheritance.Person;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student() {
    super("Jane Doe", 30, "female");
    this.previousOrganization = "The School of Life";
    this.skippedDays = 0;
  }

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public void skipDays(int numberOfDays) {
    if (numberOfDays < 0){
      throw new IllegalArgumentException();
    }
    skippedDays += numberOfDays;
  }

  @Override
  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  @Override
  public void introduce() {
    System.out.println(
        "Hi, I'm "
            + name
            + ", a "
            + age
            + " year old "
            + gender
            + " from "
            + previousOrganization
            + " who skipped "
            + skippedDays
            + " days from the course already.");
  }
}
