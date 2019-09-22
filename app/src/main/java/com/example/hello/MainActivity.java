package com.example.hello;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Scanner;
import java.util.Stack;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 0917: DataStructureDriver
        System.out.println("\nWelcome to DataStructure Driver");

        ArrayList<Person> people = new ArrayList<>();
        LocalDate d1 = LocalDate.of(1995, 1, 19);
        Person p1 = new Person("Haaris", d1);
        people.add(p1);
        people.add(new Person("Alastair", LocalDate.of(1996, 2, 20)));
        people.add(new Person("Bart", LocalDate.now()));

        System.out.println("\nPeople: " + people);

        System.out.println("\nFirst person: " + people.get(0));

        people.add(0, new Person("Castiel", LocalDate.of(1997, 3, 21)));
        System.out.println("\nThe new list is: " + people);

        people.add(new Person("Dean", LocalDate.of(1998, 4, 22)));
        System.out.println("\nThe updated list is: " + people);

        people.remove(2);
        System.out.println("\nThe removed list is: " + people);

        int size = people.size();
        System.out.println("\nThe amount of value are " + size);

        Person last = people.get(people.size() - 1);
        System.out.println("\nLast person: " + last);

        Stack<Person> stackOfPeople = new Stack<>();
        stackOfPeople.push(new Person("Ethan", LocalDate.of(1999, 5, 23)));
        stackOfPeople.push(new Person("Frank", LocalDate.of(2000, 6, 24)));
        stackOfPeople.push(new Person("Grant", LocalDate.of(2001, 7, 25)));
        System.out.println("\nStack of people " + stackOfPeople);

        System.out.println("\nFirst person in a stack " + stackOfPeople.get(0));

        stackOfPeople.push(new Person("Henry", LocalDate.of(2002, 8, 26)));
        System.out.println("\nNew stack of people " + stackOfPeople);

        stackOfPeople.push(new Person("Ivan", LocalDate.of(2003, 9, 27)));
        System.out.println("\nSecond new stack of people " + stackOfPeople);

        stackOfPeople.remove(stackOfPeople.size() / 2);
        System.out.println("\nMiddle removed sack of people " + stackOfPeople);

        System.out.println("\nThere are " + stackOfPeople.size() + " people in the stack");

        Person lastStack = stackOfPeople.get(people.size() - 1);
        System.out.println("\nLast person in the stack is: " + lastStack);

        Queue queueOfPeople = new LinkedList();
        queueOfPeople.add(new Person("Jack", LocalDate.of(2004, 10, 28)));
        queueOfPeople.add(new Person("Kyle", LocalDate.of(2005, 11, 29)));
        queueOfPeople.add(new Person("Larry", LocalDate.of(2006, 12, 30)));
        System.out.println("\nThe queue list is " + queueOfPeople);

        System.out.println("\nThe first name in the queue is " + queueOfPeople.peek());

        queueOfPeople.add(new Person("Manny", LocalDate.of(2007, 1, 31)));

        System.out.println("\nThere are " + queueOfPeople.size() + " queues in the list");

        Deque<Person> dequeOfPeople = new LinkedList<>();
        dequeOfPeople.add(new Person("Nancy", LocalDate.of(2008, 2, 1)));
        dequeOfPeople.add(new Person("Oliver", LocalDate.of(2009, 3, 2)));
        dequeOfPeople.add(new Person("Peter", LocalDate.of(2009, 4, 3)));
        System.out.println("\nThe names in the deque: " + dequeOfPeople);

        System.out.println("\nThe first name in the queue is " + dequeOfPeople.peek());

        dequeOfPeople.addFirst(new Person("Quill", LocalDate.of(2010, 5, 4)));

        System.out.println("\nThe new list is " + dequeOfPeople);

        dequeOfPeople.add((new Person("Ryan", LocalDate.of(2011, 6, 5))));
        System.out.println("\nThe second list is " + dequeOfPeople);

        System.out.println("\nThe amount of deques are " + dequeOfPeople.size());

        System.out.println("\nThe last name is " + dequeOfPeople.peekLast());

        // 0919 DriveThru
        System.out.println("\nWelcome to the Drive Thru");

        ArrayList<Car> listOfCars = new ArrayList<>();
        Car car = new Car(24, 48);
        listOfCars.add(car);
        listOfCars.add(new Car(25, 50));
        listOfCars.add(new Car(26, 52));
        listOfCars.size();
        System.out.println("\n" + listOfCars.size() + " unique numbers " + listOfCars);

        listOfCars.add(new Car(27, 54));
        System.out.println("\n" + listOfCars.size() + " new unique numbers " + listOfCars);

        listOfCars.add(listOfCars.size() / 2, new Car(28, 56));
        System.out.println("\n" + listOfCars.size() + " first new unique numbers " + listOfCars);

        listOfCars.add(0, new Car(29, 58));
        System.out.println("\n" + listOfCars.size() + " second new unique numbers " + listOfCars);

        listOfCars.remove(listOfCars.size() - 1);
        System.out.println("\n" + listOfCars.size() + " new removed unique numbers " + listOfCars);

        listOfCars.remove(listOfCars.size() / 2);
        System.out.println("\n" + listOfCars.size() + " first removed unique numbers " + listOfCars);

        listOfCars.remove(0);
        System.out.println("\n" + listOfCars.size() + " second removed unique numbers " + listOfCars);

        Stack<Car> stackOfCars = new Stack<>();
        stackOfCars.push(new Car(30, 60));
        stackOfCars.push(new Car(31, 62));
        stackOfCars.push(new Car(32, 64));
        System.out.println("\n" + stackOfCars.size() + " unique stack " + stackOfCars);

        stackOfCars.push(new Car(33, 66));
        System.out.println("\n" + stackOfCars.size() + " first unique stack " + stackOfCars);

        stackOfCars.pop();
        System.out.println("\n" + stackOfCars.size() + " first removed unique stack " + stackOfCars);

        Queue<Car> queueOfCars = new LinkedList<>();
        queueOfCars.add(new Car(34, 68));
        queueOfCars.add(new Car(35, 70));
        queueOfCars.add(new Car(36, 72));
        System.out.println("\n" + queueOfCars.size() + " unique queues " + queueOfCars);

        queueOfCars.add(new Car(37, 74));
        System.out.println("\n" + queueOfCars.size() + " new unique queues " + queueOfCars);

        queueOfCars.remove();
        System.out.println("\n" + queueOfCars.size() + " removed queues " + queueOfCars);

        Deque<Car> dequeOfCars = new LinkedList<>();
        dequeOfCars.add(new Car(38, 76));
        dequeOfCars.add(new Car(39, 78));
        dequeOfCars.add(new Car(40, 80));
        System.out.println("\n" + dequeOfCars.size() + " unique deques " + dequeOfCars);

        dequeOfCars.add(new Car(41, 82));
        System.out.println("\n" + dequeOfCars.size() + " new unique deques " + dequeOfCars);

        dequeOfCars.addLast(new Car(42, 84));
        System.out.println("\n" + dequeOfCars.size() + " first unique deques " + dequeOfCars);

        dequeOfCars.addFirst(new Car(43, 86));
        System.out.println("\n" + dequeOfCars.size() + " second unique deques " + dequeOfCars);

        dequeOfCars.removeFirst();
        System.out.println("\n" + dequeOfCars.size() + " removed unique deques " + dequeOfCars);

        dequeOfCars.removeLast();
        System.out.println("\n" + dequeOfCars.size() + " removed unique deques " + dequeOfCars);

        ArrayList<Car> driveThru = new ArrayList<>();
        driveThru.add(new Car(1,2));
        driveThru.add(new Car(2,4));
        driveThru.add(new Car(3,6));
        driveThru.add(new Car(4,8));
        driveThru.add(new Car(5,10));
        driveThru.add(new Car(6,12));
        driveThru.add(new Car(7,14));
        driveThru.add(new Car(8,16));
        driveThru.add(new Car(9,18));
        driveThru.add(new Car(10,20));
        System.out.println("\n" + driveThru);
        System.out.println("\nThere are " + driveThru.size() + " cars in the Mcdonald drive thru");

        Random rand = new Random();
        for (int i = 0 ; i < 3 ; i++) {
            int ran_num = rand.nextInt(driveThru.size()) ;
            Car num2 = driveThru.remove(ran_num) ;
            System.out.println("You've removed " + num2+"." + driveThru) ;
        }

        System.out.println("\nThere are " + driveThru.size() + " cars in the Mcdonald drive thru now");

        for (int i = 0 ; i < 3 ; i++) {
            int ran_num = rand.nextInt(driveThru.size()) ;
            Car num2 = driveThru.remove(ran_num) ;
            System.out.println("You've removed " + num2+"." + driveThru) ;
        }

        System.out.println("\nThere are " + driveThru.size() + " cars in the Mcdonald drive thru now");

        for (int i = 0 ; i < 3 ; i++) {
            int ran_num = rand.nextInt(driveThru.size()) ;
            Car num2 = driveThru.remove(ran_num) ;
            System.out.println("You've removed " + num2+"." + driveThru) ;
        }

        System.out.println("\nThere are " + driveThru.size() + " cars in the Mcdonald drive thru now");
    }
}
