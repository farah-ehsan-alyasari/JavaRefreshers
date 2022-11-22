package com.perscholas.java_basics;

public class App8 {
    public static void main(String[] args)
    {
        int coffeCost = 10;
        int greenTeaCost = 9;
        int espressoCost = 8;

        int subtotal;
        double totalSale;

        int coffeeOrders = 3;
        int greenTeaOrders = 4;
        int espressoOrders = 2;

        subtotal = coffeCost*coffeeOrders
                + greenTeaCost*greenTeaOrders
                + espressoCost*espressoOrders;

        final double SALES_TAX = 4.0;

        totalSale = subtotal + (subtotal*SALES_TAX);
        System.out.println(totalSale);
    }
}
