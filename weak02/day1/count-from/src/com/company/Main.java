package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("I want two numbers. The second number must bee bigger than the first one.");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b){
            System.out.println("The second number should be bigger");
        }


        for(int i = a; i < b; i++){
            System.out.println(i);
        }

    }
}
