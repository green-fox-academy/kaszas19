package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Can you typ in your weight Kg: ");
        double kg = sc.nextDouble();
        System.out.println("Can you typ in your height Cm: ");
        double cm = sc.nextDouble();

        double height = cm / 100;

        System.out.println(kg / (height * height));

    }
}
