package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Can you type in the Cuboid a sides of length: ");
        double a = sc.nextDouble();
        System.out.println("Can you type in the Cuboid b sides of length: ");
        double b = sc.nextDouble();
        System.out.println("Can you type in the Cuboid height sides of length: ");
        double height = sc.nextDouble();

        double surface = 2 * (a * b + height * a + height * b);
        double volume = a * b * height;

        System.out.println("The Cuboid surface is: " + surface );
        System.out.println("The Cuboid volume is: " + volume);


    }
}
