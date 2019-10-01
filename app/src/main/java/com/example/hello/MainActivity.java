package com.example.hello;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.println("\n\nHello, DS Lab #4a - Modular Code");

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

        // overload to "... = generateListOfScores( 10, 0, 100 );"
        scores = generateListOfScores(0);
        scores = generateListOfScores(100);

        // what is the average of an ArrayList of integers
        System.out.println("\nAverage: " + Average(numbers));

        // what is the maximum element in an ArrayList of integers
        System.out.println("\nThe max number is: " + Max(numbers));
        //System.out.println("\nThe max number is " + Max(numbers.size()));

        // what is the position of the max element in the ArrayList
        System.out.println("\nThe position of the max element is " + maxPosition(numbers));

        // Skip TODO 7: refactor TODO 6 to make it more flexible
        // Skip TODO 8: fix TODO 6 so it can return more than one value

        // how many values greater than 0 are in the ArrayList
        System.out.println("\nGreater then zero: " + greaterThanZero(numbers));

        // refactor 9 to make it more flexible (no magic numbers)
        System.out.println("\nMagical greater then zero: " + greaterThanZero(numbers));

        // bonus, try to remove all elements less than 70 (use Iterator)
        removeElements(numbers);
        System.out.println("\nRemoved elements list: " + numbers);

    }

    private static ArrayList<Integer> generateListOfScores(int i) {
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j = 1; j <= 10; j++) {
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

    private static int Average(ArrayList<Integer> numbers){
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum = sum + numbers.get(i);
        }
        int average = sum / numbers.size();
        return average;
    }

    private static int Max(ArrayList<Integer> numbers) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) >= max){
                max = numbers.get(i);
            }
        }
        return max;
    }

    private static int maxPosition(ArrayList<Integer> numbers) {
        int max = 0;
        int index = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
                index = i;
            }
        }
        return index;
    }

    private static int greaterThanZero(ArrayList<Integer> numbers) {
        int add = 0;
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.size() > 0) {
                add = numbers.size();
            }
        }
        return add;
    }

    private static void removeElements(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if(numbers.size() <= 70) {
                numbers.remove(numbers);
            }
        }
    }
}
