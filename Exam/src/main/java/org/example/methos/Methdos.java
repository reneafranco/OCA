package org.example.methos;

public class Methdos {

    public static void main(String[] args) {

        int x = 5;
        change(x);
        System.out.println(x);
        //pass by value mechanism
        // primitives data type pass the value not the pointer or the reference


        String  webby = "Webyy";
        stringChange(webby);
        webby = stringChangeReturn(webby);
        System.out.println(webby);

        StringBuilder strbuilder = new StringBuilder("Hello ");
        changeStrBuilder(strbuilder);
        System.out.println(strbuilder);

    }

    static void change(int num){
        num = 10;
    }

    static void stringChange(String webby){
        webby = "bird";
    }

    static String stringChangeReturn(String webby){
         webby = "bird";
        return webby;
    }
    static void changeStrBuilder(StringBuilder builder){
        builder.append("hehehehe");

    }

}
