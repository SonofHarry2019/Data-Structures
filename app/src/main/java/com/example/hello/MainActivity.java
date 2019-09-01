package com.example.hello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        System.out.print("\n\nHello, DS Lab #2 - Lists!\n");

        // store 2 names in a list
        ArrayList<String> names = new ArrayList();
        names.add("Xavier");
        names.add("Howard");
        System.out.println("The names are " + names);

        names.add("Jackson");
        names.add("Teller");
        System.out.println("The names are " + names);

        // TODO #2: output the list with each name on a separate line of output
        for (int i = 0; i < names.size(); i++) {
            System.out.println("The separated names are " + names.get(i));
        }

        // store a random int in a list
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(rand.nextInt(10));

        // TODO #3: generate and store 2 more random ints in the list
        numbers.add(rand.nextInt(12));
        numbers.add(rand.nextInt(13));

        // TODO #4: output the even ints in the list
        for (int i = 1; i<numbers.size(); i++ ) {
            if (numbers.get(i)%2 == 0) {
                System.out.print("The even number is " + numbers.get(i));
            }
        }
        // read an int from standard input
        Scanner sc = new Scanner(System.in);
        System.out.println("\nHow many more ints do you want to generate? ");
        int numMoreElements = sc.nextInt();
        for (int i = 0; i < numMoreElements; i++) {
            numbers.add(rand.nextInt(10));
        }
        System.out.println("\nThe " + numbers.size() + " #s are " + numbers);

        // TODO #5: output the sum of the even ints in to the list
        int sum = 0;
        for (int i = 1; i<numbers.size(); i++ ) {
            if (numbers.get(i)%2 == 0) {
                sum = sum + numbers.get(i);
            }
        }
        System.out.println("The added total even number is " + sum);

        // TODO #6: output the largest int in the list
        int max = Integer.MIN_VALUE;
        for(int i=0; i<numbers.size(); i++){
            if(numbers.get(i) >= max){
                max = numbers.get(i);
            }
        }
        System.out.println("The max number is " + max);

        // output the odd integers in the list
        System.out.println("the odd integers in the list are: ");
        for (int num : numbers) {
            if (num%2 != 0) {
                System.out.print(num + "\t");
            }
        }
        System.out.println();

        // TODO #7: how many odd int are in the list
        System.out.println("the odd integers in the list are: ");
        int count = 0;
        for (int num : numbers) {
            if (num%2 != 0) {
                count = count + 1;
            }
        }
        System.out.println(count);

        // TODO #8: how many unique odd ints are in the list

        System.out.println("\nThe lengths of the names are: ");
        for (String name : names) {
            System.out.println(name + "-" + name.length() + "\t");
        }
        System.out.println();

        // TODO #9: which names have [length]
        for (String name : names) {
            System.out.println("The names that have lengths are " + name);
        }
        System.out.println();

        // TODO #10: which names are the same length as a # in the ints list
    }
}
