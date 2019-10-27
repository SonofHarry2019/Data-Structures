package com.example.hello;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create a Java project named "ItemDriver"
        // output a welcome message
        System.out.println("\nWelcome to the ItemDiver");

        // read a [name] (String) and a [price] (double) from stdin
        System.out.println("\nWhat are you buying ");
        String name = scan.nextLine();

        System.out.println("\nHow much is it ");
        double price = scan.nextDouble();

        // output the name and price using the following Java statement
        System.out.println("%s \t $%.2f %n " + name + "  " + price);

        // create an Item class that has 3 fields: name, price, and quantity
        // In Item.java
        // create an Item default constructor that works like Item item1 = new Item();
        Item item1 = new Item("silk", 1.75, 1);

        // use the IDE to generate a parameterized constructor that works like
        Item milk = new Item("soy milk", 2.75, 2);
        Item avocado = new Item("avocado", 6.75, 4);
        Item bread = new Item("wheat", 4.75, 6);

        // use the IDE to generate Item.toString()
        System.out.println( "\nThe items are:\n\t" + item1
                + "\n\t" + milk + "\n\t" + avocado );

        // modify Item.toString() so it returns a String in the format: "name \t
        //  quantity \t $xx.xx"
        System.out.println("\nAgain, the items are:\n\t" + item1
                + "\n\t" + milk + "\n\t" + avocado);

        // use the IDE to generate all 6 getters and setters methods
        String breadName = bread.getNames();
        System.out.println("\nThe name of the first item is " + breadName);

        // output the other two names of the three Item objects
        System.out.println("\nThe second item is " + milk);
        System.out.println("\nThe third item is " + avocado);

        avocado.setQuantity(5);
        // change the name of the milk to "silk milk"
        milk.setNames("silk milk");
        System.out.println();

        // change the price of the bread to $3.58
        bread.setPrice(3.58);
        System.out.println(bread);

        // add 50 cents to the price of the avocados
        double addPrice = avocado.getPrice() + .50;
        System.out.println("\nAvocados new price is " + addPrice);

        // create a method (not a function) that
        // calculates the unit cost of an Item.
        // For example, if the price is $2.10 and the quantity is 2,
        // then the unit price is $1.05
        double uCost = avocado.unitCostOfItem();
        System.out.println("\nThe unit cost is " + uCost);

        // create a method (not a function) that
        // calculates the total cost of an Item.
        // For example, if the price is $2.10 and the quantity is 2,
        // then the cost of the Item is $4.20
        double tCost = avocado.totalCostOfItem();
        System.out.println("\nThe cost of the item is " + tCost);

        // create a function (not a method) that
        // calculates the total cost of all 3 Items.
        double costThree = costOfThree(avocado, milk, bread);
        System.out.println("\nCost 3 is " + costThree);


        // create a method (not a function) that
        // calculates a 9.45\% sales tax on an Item.
        double sTax = bread.salesTaxOfItem();
        System.out.println("\nThe total sales tax is " + sTax);

        // create a function (not a method) that
        // calculates the total cost of all 3 Items
        // including sales tax.
        double salesThree = threeItemSalesTax(avocado, milk, bread);
        System.out.println("\nSales tax is " + salesThree);
    }

    public static double costOfThree(Item avocado, Item milk, Item bread) {
        return avocado.getPrice() + milk.getPrice() + bread.getPrice();
    }

    public static double threeItemSalesTax(Item avocado, Item milk, Item bread) {
        return avocado.getPrice() + milk.getPrice() + bread.getPrice() * (9.45/100);
    }
}
