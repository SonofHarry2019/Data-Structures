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

        System.out.println("\n\nHello, DS Lab #3 - ArrayList!\n");

        // store 10 random values [0..100] in an ArrayList
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            int num = rand.nextInt(100 + 1);    // random integer in [0..100}
            numbers.add(num);
        }
        System.out.println("The " + numbers.size() + " integers are " + numbers);

        // output the ArrayList using a for-loop
        System.out.println("\nEach integer on a separate line");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        System.out.println("\n");

        // use a for-loop, output each line in format "index \t element"
        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i) + " \t " + numbers);
        }
        System.out.println();

        // TODO 2: use a for-loop to output the integers in reverse order
        int reverseNum = 0;
        for (int i = 0; i == numbers.size() - 1; i--) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + i%2;
        }
        System.out.println("\nThe " + numbers.size() + " reverse integers are " + numbers);

        // output the ArrayList using an enhanced for (foreach) loop
        System.out.println("\nAgain, each integer in a separate line:");
        for (int num : numbers) {
            System.out.println(num);
        }

        System.out.println("\nThe original integers are " + numbers);

        System.out.println("\nThe even elements in the list:\t");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num + " ");
            }
        }
        System.out.println();

        // use an enhanced-for, output integers separated by commas
        System.out.println("The integers with a comma:\t");
        for (int num : numbers) {
            System.out.print(num + ", ");
        }
        System.out.println();

        // TODO 4: determine (boolean) if the list has any even elements
        System.out.println("\nList has even elements?: " + isEven(numbers));

        // how many of the elements in the list are even
        int count = 0;
        for (int num : numbers) {
            if (num%2 == 0) {
                count = count + 1;
            }
        }
        System.out.println("\nThere are " + count + " even integers");

        // determine (boolean) if all the elements in the list are even
        System.out.println("\nThe list has even elements: " + isEven(numbers));

        // TODO 7: what is the maximum element in the list
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) >= max){
                max = numbers.get(i);
            }
        }
        System.out.println("\nThe max number is " + max);

        // TODO 8: what is the index to the minimum element in the list
        int min = Integer.MAX_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) <= min){
                min = numbers.get(i);
            }
        }
        System.out.println("\nThe min number is " + min);

        // what percentage of the elements in the list are odd
        int sumOdd = 0;
        for (int num : numbers) {
            if (num %2 != 0) {
                sumOdd++;
            }
        }
        float percentOdd = (float) sumOdd/numbers.size() * 100;
        System.out.println("\t" + percentOdd + "% of the elements are odd.");

        // build a new list from only every 3rd element of the integers
        ArrayList<Integer> numbers3rd = new ArrayList<>();
        for(int i=2; i<numbers.size(); i=i+3) {
            numbers3rd.add(numbers.get(i));
        }

        System.out.println("\nThe original list is \t" + numbers);
        System.out.println("Every 3rd element is \t" + numbers3rd);
        // fix [numbers3rd] so the new list is every 3rd element

        // TODO #10: store 333 at every index that is divisible by 3
        int storeNum = 333;
        for (int num : numbers) {
            if (num%3 == 3) {
                num = storeNum;
                numbers.set(num, storeNum);
            }
        }
        System.out.println("\nThe restored list is  " + storeNum);

        // TODO #11: replace every element that is divisible by 5 with 555
        //  sort the list of number
        int i = 0;
        int reNum = 555;
        for (int num : numbers) {
            if (num%5 == 0) {
                numbers.set(num, reNum);
            }
        }
        System.out.println("\nThe renumbered list is " + numbers);

        System.out.println("\nThe original list of numbers is " + numbers);
        numbers.sort(Integer::compareTo); // sort using a method reference
        numbers.sort((n1, n2) -> n1.compareTo(n2)); // sort using a comparable
        System.out.println("\nThe sorted list of numbers is " + numbers);
    }

    public static boolean isEven(ArrayList<Integer> numbers) {
        for (int num : numbers) {
            if (num%2 != 0) {
                return true;
            }
        }
        return false;
    }
}
