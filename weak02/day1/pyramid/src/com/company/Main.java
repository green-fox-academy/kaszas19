package com.company;

public class Main {

    public static void main(String[] args) {
        int hight = 4;
        for(int i = 1; i <= hight; i++){
            for (int j = 0; j < hight-i;  j++){
                System.out.print(".");
            }
            for (int j = 0; j <= (i-1)*2 ; j++){
                System.out.print("*");
            }
            System.out.println("");


        }


    }
}
