package com.perscholas.java_basics;

public class App4 {
    public static void main(String[] args){
        int a = 10;

        //changing b's value from integer to decimal
        //means that i have to change the return type of b to double
        //as well as either cast b to int during division
        //or change the res return type to double too
        double b = 20.0;

        double res = b/a;
        System.out.println(res);
    }
}
