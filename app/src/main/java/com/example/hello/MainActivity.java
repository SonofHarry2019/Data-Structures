package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
        int g1Quality = gradeQuality(g1);
        System.out.println("g1 quality is " + g1Quality);
        int g2Quality = grade1Quality(g2);
        System.out.println("g2 quality is " + g2Quality);

        // calculate the grade point average
        float GPA = (float) calculateGPA(g1, g1hours, g2, g2hours);
        System.out.println("The GPA is " + GPA);

        Grade grade1 = new Grade();
        String grade1letter = grade1.getLetter();
        int grade1hours = grade1.getHours();
        System.out.println("\nGrade1 is:\t" + grade1letter + " " + grade1hours);

        // create a parameterized constructor and then uncomment the following statement.
        Grade grade2 = new Grade("F", 0);
        System.out.println("Grade2 is:\t" + grade2.getLetter() + " " + grade2.getHours());

        // create Grade.toString(). format "letter::hours"
        System.out.println("Grade1 is " + grade1 + " and Grade2 is " + grade2);

        // create gpa function, return (float) gpa of 2 Grade objects

        //change grade1's letter grade to "A"
        grade1.setLetter("A");

        // change grade2's hours to 0

        System.out.println("\nThe grade are:\t" + grade1 + " " + grade2);

        // what is the average of the two grades credit hours
        float average = (g1hours + g2hours) / 2;
        System.out.println("\nThe average of the two grades are " + average);

        // which of the grades (1 or 2) has the higher credit hour
        System.out.print("\nThe highest grade is: " );
        if (g1hours > g2hours) {
            System.out.println(g1hours);
        } else {
            System.out.println(g2hours);
        }
    }

    private static double calculateGPA(String g1, int g1hours, String g2, int g2hours) {
        float g1Value = gradeQuality(g1) * g1hours;
        float g2Value = grade1Quality(g2)  * g2hours;
        return (g1Value + g2Value) / (g1hours + g2hours);
    }

    private static int gradeQuality(String g1) {
        if (g1.equalsIgnoreCase("a")) {
            return 4;
        } else if (g1.equalsIgnoreCase("b")) {
            return 3;
        } else if (g1.equalsIgnoreCase("c")) {
            return 2;
        } else if (g1.equalsIgnoreCase("d")) {
            return 1;
        } else if (g1.equalsIgnoreCase("f")) {
            return 0;
        } else {
            return 0;
        }
    }

    private static int grade1Quality(String g2) {
        if (g2.equalsIgnoreCase("a")) {
            return 4;
        } else if (g2.equalsIgnoreCase("b")) {
            return 3;
        } else if (g2.equalsIgnoreCase("c")) {
            return 2;
        } else if (g2.equalsIgnoreCase("d")) {
            return 1;
        } else if (g2.equalsIgnoreCase("f")) {
            return 0;
        }  else {
            return 0;
        }
    }

    private static void output(int hours, String letter) {
        System.out.println(letter + "::" + hours);
    }
}
