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

        // Lab 905

        // create a Java project named "ItemDriver"
        // output a welcome message
        System.out.println("\nWelcome to the ItemDiver");

        // read a [name] (String) and a [price] (double) from stdin
        String name = "Almond";
        double price = 1;

        // output the name and price using the following Java statement
        System.out.println("%s \t $%.2f %n" + name + "  " + price);

        // create an Item class that has 3 fields: name, price, and quantity
        // In Item.java
        // create an Item default constructor that works like Item item1 = new Item();
        Item item1 = new Item("silk", 1.75, 1);

        // use the IDE to generate a parameterized constructor that works like
        Item milk = new Item("soy milk", 2.75, 2);
        Item avocado = new Item("avocado", 6.75, 4);
        Item bread = new Item("wheat", 4.75, 6);

        // use the IDE to generate Item.toString()
        System.out.println("\nThe items are:\n\t" + item1
                + "\n\t" + milk + "\n\t" + avocado);

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
        avocado.setPrice(6.75 + .50);
        System.out.println("\n" + avocado);

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
        double sTax = avocado.salesTaxOfItem();
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
        return avocado.getPrice() + milk.getPrice() + bread.getPrice() + 9.45;
    }

    // Lab 903
    public static void main(String[] args) {
        System.out.println("\n\nHello, DS Lab #5 - Driver for Grade Class!\n");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two letter grades on separate lines: ");
        String g1 = sc.nextLine();
        String g2 = sc.nextLine();

        int g1hours = 1;
        int g2hours = 4;

        // output the first grade, format "letter::hours"
        output(g1hours, g1);

        // output the second grade, format "letter::hours"
        output(g2hours, g2);

        // output the quality points of g1
        int gQuality = gradeQuality(g1);
        int gQuality1 = gradeQuality(g2);
        System.out.println("g1 quality is " + gQuality);
        System.out.println("g2 quality is " + gQuality1);

        // calculate the grade point average
        int GPA = (int) calculateGPA(g1, g1hours, g2, g2hours);
        System.out.println("The GPA is " + GPA);

        Grade grade1 = new Grade();
        String grade1letter = grade1.getLetter();
        int grade1hours = grade1.getHours();
        System.out.println("\nGrade1 is:\t" + grade1letter + " " + grade1hours);

        // create a parameterized constructor and then uncomment the following statement.
        Grade grade2 = new Grade("F", 4);
        System.out.println("Grade2 is:\t" + grade2.getLetter() + " " + grade2.getHours());

        // create Grade.toString(). format "letter::hours"
        System.out.println("Grade1 is " + grade1 + " and Grade2 is " + grade2);

        // create gpa function, return (float) gpa of 2 Grade objects
        float GPA1 = (float) calFloatGPA(g1, g1hours, g2, g2hours);
        System.out.println("\nThe GPA in float is " + GPA1);

        //change grade1's letter grade to "A"
        grade1.setLetter("A");

        // change grade2's hours to 0
        grade2.setHours(0);
        System.out.println("\nThe grade are:\t" + grade1 + " " + grade2);

        // what is the average of the two grades credit hours
        float average = (grade1.getHours() + grade2.getHours()) / 2;
        System.out.println("\nThe average of the two grades are " + average);

        // which of the grades (1 or 2) has the higher credit hour
        System.out.print("\nThe highest grade is: ");
        if (grade1.getHours() > grade2.getHours()) {
            System.out.println(grade1);
        } else {
            System.out.println(grade2);
        }
    }

    private static double calculateGPA(String g1, int g1hours, String g2, int g2hours) {
        double gValue = gradeQuality(g1) * g1hours;
        double gValue1 = gradeQuality(g2) * g2hours;
        return (gValue + gValue1) / (g1hours + g2hours);
    }

    private static int gradeQuality(String g) {
        if (g.equalsIgnoreCase("a")) {
            return 4;
        } else if (g.equalsIgnoreCase("b")) {
            return 3;
        } else if (g.equalsIgnoreCase("c")) {
            return 2;
        } else if (g.equalsIgnoreCase("d")) {
            return 1;
        } else if (g.equalsIgnoreCase("f")) {
            return 0;
        } else {
            return 0;
        }
    }

    private static void output(int hours, String letter) {
        System.out.println(letter + "::" + hours);
    }

    private static float calFloatGPA(String g1, int g1hours, String g2, int g2hours) {
        float gValue = gradeQuality(g1) * g1hours;
        float gValue1 = gradeQuality(g2) * g1hours;
        return (gValue + gValue1) / (g1hours + g2hours);
    }
}
