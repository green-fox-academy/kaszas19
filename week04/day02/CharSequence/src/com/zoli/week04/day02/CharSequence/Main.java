package com.zoli.week04.day02.CharSequence;

public class Main {

    public static void main(String[] args) {


        Gnirts gnirts = new Gnirts("hello");
        System.out.println(gnirts.charAt(2));
        System.out.println(gnirts.length());
        System.out.println(gnirts.subSequence(0, 2));
        System.out.println();
        ShiftedCharSequence shift = new ShiftedCharSequence("example", 3);
        System.out.println(shift.length());
        System.out.println(shift.charAt(2));


    }
}
