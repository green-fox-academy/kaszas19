package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is your favorite numbers?");
        int favoriteNumber = sc.nextInt();
        System.out.println("Your favorite number is: " + favoriteNumber);
    }
}
