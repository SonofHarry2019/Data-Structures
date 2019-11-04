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

        System.out.println("\nWelcome to Homework Driver");

        Homework homework = new Homework("CPSC2735", "test", 10,
                3, 2019, 2);
        System.out.println("\n" + homework);

        Homework homework1 = new Homework("CPSC1720", "test", 11,
                4, 2019, 1);
        System.out.println("\n" + homework1);

        Homework homework2 = new Homework("CPSC1710", "test", 12,
                5, 2019, 1);
        System.out.println("\n" + homework2);

        LocalDate today = LocalDate.now();
        System.out.println("\nToday is " + today);
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int year = today.getYear();

        LocalDate aWeekFromNow = today.plusDays(7);
        boolean earlier = aWeekFromNow.isBefore(today);

        if (homework.getDueDay() > 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + homework);
        }

        if (homework1.getDueDay() > 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + homework1);
        }

        if (homework2.getDueDay() > 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + homework2);
        }

        if (homework.getDueYear() >= 2018 && homework.getDueYear() <= 2020) {
            System.out.println("\nThe year is " + today);
        } else {
            System.out.println("\nThe year is " + homework);
        }

        if (homework1.getDueYear() >= 2018 && homework1.getDueYear() <= 2020) {
            System.out.println("\nThe year is " + today);
        } else {
            System.out.println("\nThe year is " + homework1);
        }

        if (homework2.getDueYear() >= 2018 && homework2.getDueYear() <= 2020) {
            System.out.println("\nThe due date is " + today);
        } else {
            System.out.println("\nThe date is " + homework2);
        }

        Homework comp = new Homework("CPSC2735", "Test", 1,
                6, 2020, 3);
        Homework math = new Homework("MATH1070", "Homework", 2,
                7, 2020, 1);
        Homework english = new Homework("ENGL2010", "Quiz", 3,
                8, 2020, 2);

        Homework randomHomework = createRandomHomework();
        System.out.println("\nThe random homework is " + randomHomework);

        if (homework.isHigherPriority(homework1)) {
            System.out.println("\n" + homework + " has higher priority then " + homework1);
        } else {
            System.out.println("\nNot higher");
        }

        if (homework.isBefore(homework1)) {
            System.out.println("\n" + homework + " is due before " + homework1);
        } else {
            System.out.println("\nNot due");
        }

        System.out.println("\nThe compareTo value is " + homework.compareTo(homework1));

        if (comp.getDueDay() >= 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + comp);
        }

        if (math.getDueDay() >= 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + math);
        }

        if (english.getDueDay() >= 28) {
            System.out.println("\nThe date is " + today);
        } else {
            System.out.println("\nThe date is " + english);
        }

        if (comp.getDueYear() >= 2018 && comp.getDueYear() <= 2020) {
            System.out.println("\nThe year is " + today);
        } else {
            System.out.println("\nThe year is " + comp);
        }

        if (math.getDueYear() >= 2018 && math.getDueYear() <= 2020) {
            System.out.println("\nThe year is " + today);
        } else {
            System.out.println("\nThe year is " + math);
        }

        if (english.getDueYear() >= 2018 && english.getDueYear() <= 2020) {
            System.out.println("\nThe year is " + today);
        } else {
            System.out.println("\nThe year is " + english);
        }

        if (comp.getPriority() >= 1 && comp.getPriority() <= 3) {
            System.out.println("\nThe priority is " + today);
        } else {
            System.out.println("\nThe priority is " + comp);
        }

        if (math.getPriority() >= 1 && math.getPriority() <= 3) {
            System.out.println("\nThe priority is " + today);
        } else {
            System.out.println("\nThe priority is " + math);
        }

        if (english.getPriority() >= 1 && english.getPriority() <= 3) {
            System.out.println("\nThe priority is " + today);
        } else {
            System.out.println("\nThe priority is " + english);
        }

        Homework sci = new Homework("Science", "Test", 4,
                9, 2020, 3);
        Homework read = new Homework("Reading", "Quiz", 7,
                10, 2020, 2);
        Homework chem = new Homework("Chemistry", "Test", 10,
                24, 2019, 3);
        Homework hist = new Homework("Histroy", "Quiz", 10,
                25, 2019, 2);

        List<String> subs = Arrays.asList("Science", "Reading", "Chemistry", "History");
        Set<String> subject = new HashSet<>();
        for (int i = 1; i < subs.size(); i++) {
            int homeW = rand.nextInt(subs.size());
            String collegeClass = subs.get(homeW);
            String uniClass = collegeClass;
            subject.add(uniClass);
        }
        System.out.println("\n*");
        System.out.println("The subjects are " + subject);
        System.out.println("*");

        ArrayList<Homework> classes = new ArrayList<>();
        classes.add(comp);
        classes.add(math);
        classes.add(english);
        classes.add(sci);
        classes.add(read);
        classes.add(chem);
        classes.add(hist);
        System.out.println("\nThere are " + classes.size() + " classes");

        int getMonth = Month(comp, math, english, sci, read, chem, hist);
        System.out.println("\nThere are " + getMonth + " months");

        double getPriority = Priority(classes, comp, math, english, sci, read, chem, hist);
        System.out.println("\nThe total average priority is " + getPriority);

        ArrayList<Homework> getToday = Today(classes);
        System.out.println("\n" + getToday + " is due today");

        ArrayList<Homework> passToday = pastDue(classes);
        System.out.println("\n" + passToday + " are past there due date");

        ArrayList<Homework> fewDays = fewDays(classes, 3);
        System.out.println("\n" + fewDays + " are a due in a few days");
    }

    private static Homework createRandomHomework() {
        List<String> Classes = Arrays.asList("CPSC2735", "MATH1070", "ENGL2010");
        List<String> names = Arrays.asList("Homework", "Quiz", "Test");
        int month = rand.nextInt(12) + 1;
        int day = rand.nextInt(28) + 1;
        int year = rand.nextInt(3) + 2018;
        int priority = rand.nextInt(3) + 1;
        int classIndex = rand.nextInt(Classes.size());
        int nameIndex = rand.nextInt(names.size());
        Homework retVal = new Homework(
                Classes.get(classIndex), names.get(nameIndex),
                month, day, year, priority);
        return retVal;
    }

    public static int Month(Homework comp, Homework math, Homework english, Homework sci, Homework read, Homework chem, Homework hist) {
        int count = 0;
        if (comp.getDueMonth() == math.getDueMonth()) {
            count++;
        } else if (math.getDueMonth() == english.getDueMonth()) {
            count++;
        } else if (english.getDueMonth() == sci.getDueMonth()) {
            count++;
        } else if (sci.getDueMonth() == read.getDueMonth()) {
            count++;
        } else if (read.getDueMonth() == chem.getDueMonth()) {
            count++;
        } else if (chem.getDueMonth() == hist.getDueMonth()) {
            count++;
        }
        return count;
    }

    public static double Priority(ArrayList<Homework> classes, Homework comp, Homework math, Homework english,
                                  Homework sci, Homework read, Homework chem, Homework hist) {
        return (comp.getPriority() + math.getPriority() + english.getPriority() + sci.getPriority() + read.getPriority()
                + chem.getPriority() + hist.getPriority()) / classes.size();
    }

    public static ArrayList<Homework> Today(ArrayList<Homework> homeworks) {
        LocalDate today = LocalDate.now();
        System.out.println("\nToday is " + today);
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int year = today.getYear();
        ArrayList<Homework> dueToday = new ArrayList<>();
        for (Homework h : homeworks) {
            int hDay = h.getDueDay();
            int hMonth = h.getDueMonth();
            int hYear = h.getDueYear();
            if (hDay == day && hMonth == month && hYear == year) {
                dueToday.add(h);
            }
        }
        return dueToday;
    }

    public static ArrayList<Homework> pastDue(ArrayList<Homework> homeworks) {
        LocalDate today = LocalDate.now();
        System.out.println("\nToday is " + today);
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int year = today.getYear();
        ArrayList<Homework> passToday = new ArrayList<>();
        for (Homework h : homeworks) {
            int hDay = h.getDueDay();
            int hMonth = h.getDueMonth();
            int hYear = h.getDueYear();
            if (hDay < day || hMonth < month || hYear < year) {
                passToday.add(h);
            }
        }
        return passToday;
    }

    public static ArrayList<Homework> fewDays(ArrayList<Homework> homeworks, int numDays) {
        LocalDate today = LocalDate.now();
        System.out.println("\nToday is " + today);
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        int year = today.getYear();
        ArrayList<Homework> fewDays = new ArrayList<>();
        for (Homework h : homeworks) {
            int hDay = h.getDueDay();
            int hMonth = h.getDueMonth();
            int hYear = h.getDueYear();
            if (hDay <= day + numDays && hMonth == month && hYear == year) {
                fewDays.add(h);
            }
        }
        return fewDays;
}
