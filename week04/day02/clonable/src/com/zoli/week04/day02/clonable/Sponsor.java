package com.zoli.week04.day01.OrgInheritance;

import com.zoli.week04.day01.OrgInheritance.Person;

public class Sponsor extends Person {
  private String company;
  private int hiredStudents;

  public Sponsor(String name, int age, String gender, String company) {
    super(name, age, gender);
    this.company = company;
  }

  public Sponsor() {
    super("Jane Doe", 30, "female");
    this.company = "Google";
    this.hiredStudents = 0;
  }

  @Override
  public void getGoal() {
    System.out.println("Hire brilliant junior software developers.");
  }

  @Override
  public void introduce() {
    System.out.printf(
        "Hi, I'm %s , a %d year old %s who represents %s and hired %d students so far.\n",
        name, age, gender, company, hiredStudents);
  }

  public void hire() {
    hiredStudents++;
  }
}
