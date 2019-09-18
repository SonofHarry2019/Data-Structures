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

        System.out.println("\n\nHello, DS Lab #4a - Modular Code");

        //
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100-1);
            numbers.add(num);
        }
        System.out.println("\nThe " + numbers.size() + " integers are " + numbers);

        // generate an ArrayList of 10 random scores in (0...100)
        ArrayList<Integer> scores = generateListOfScores();

        // replace previous statements with "output ( scores )"
        output(scores);

        // overload to "... = generateListOfScores( 10 )"
        scores = generateListOfScores(10);
        System.out.println("\nThe list of scores: " + scores);

        // what is the average of an ArrayList of integers
        Average(numbers);

        // what is the maximum element in an ArrayList of integers
        Max(numbers);

        // what is the position of the max element in the ArrayList
        maxPosition(numbers);

        // TODO 7: refactor TODO 6 to make it more flexible
        // TODO 8: fix TODO 6 so it can return more than one value

        // TODO 9: how many values greater than 0 are in the ArrayList
        // TODO 10: refactor TODO 9 to make it more flexible (no magic numbers)

        // TODO 12: bonus, try to remove all elements less than 70 (use Iterator)

    }

    private static ArrayList<Integer> generateListOfScores(int i) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j = 1; j <= 3; j++) {
            int num = rand.nextInt(100-1);
            numbers.add(num);
        }
        return numbers;
    }

    private static void output(ArrayList<Integer> scores) {
        System.out.print("\nThe " + scores.size() + " scores are " + scores);
        for (int index = 0; index < scores.size(); index++) {
            //System.out.print(scores.get(index) + " ");
        }
    }

    private static ArrayList<Integer> generateListOfScores() {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100-1);
            numbers.add(num);
        }
        return numbers;
    }

    private static void Average(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        int average = sum / numbers.size();
        System.out.println("\nAverage: " + average);
    }

    private static void Max(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) >= max){
                max = numbers.get(i);
            }
        }
        System.out.println("\nThe max number is " + max);
    }

    private static void maxPosition(ArrayList<Integer> numbers) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
                index = i;
            }
        }
        System.out.println("\nThe position of the max element is " + index);
    }
}
