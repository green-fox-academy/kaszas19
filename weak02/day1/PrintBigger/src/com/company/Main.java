package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("can you give me 2 numbers.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == b){
            System.out.println("I'm looking for a bigger number");
        } else if (a > b){
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }
}
