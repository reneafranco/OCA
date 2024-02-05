package org.example.methos;

public class Methdos {

    public static void main(String[] args) {

        int x = 5;
        change(x);
        System.out.println(x);
        //pass by value mechanism
        // primitives data type pass the value not the pointer or the reference
    }

    static void change(int num){
        num = 10;
    }

}
