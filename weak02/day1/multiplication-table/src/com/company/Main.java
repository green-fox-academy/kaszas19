package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I want a number, to do a multiplication table:");
        int a = sc.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d * %d = %d \n", i, a, i * a);
        }

    }
}
