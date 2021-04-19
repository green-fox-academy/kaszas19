package com.company;

public class Main {

    public static void main(String[] args) {


        for (int i = 0; i < 501; i++) {

            if ((i % 15 == 0)) {
                System.out.println("FizzBuzz " + i);
            } else if (i % 3 == 0) {
                System.out.println("Fizz " + i);
            } else if (i % 5 == 0) {
                System.out.println("Buzz " + i);
            }

        }

    }
}
