package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many chickens, do you have?");
        int chicken = sc.nextInt();
        System.out.println("How many pigs, do you have?");
        int pigs = sc.nextInt();

        int chickenLegs = chicken * 2;
        int pigsLegs = pigs * 4;

        System.out.println("All your animals "+ (chickenLegs + pigsLegs) + " legs have.");
    }
}
