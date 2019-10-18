package com.example.hello;

import java.time.LocalDate;
import java.util.Objects;

public class Grade {
    private String letter;
    private int hours;

    public Grade() {
        letter = "C";
        hours = 3;
    }

    Grade(String letter, int hours) {
        this.letter = letter;
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    public String getLetter() {
        return letter;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    @Override
    public String toString() {
        return letter + "::" + hours;
    }
}