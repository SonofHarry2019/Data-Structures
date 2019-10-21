package com.example.hello;

import java.time.LocalDate;
import java.util.Objects;

public class Homework {
    private String course;
    private String name;
    private int dueMonth;
    private int dueDay;
    private int dueYear;
    private int priority;

    public Homework(String course, String name, int dueMonth, int dueDay, int dueYear, int priority) {
        this.course = course;
        this.name = name;
        this.dueMonth = dueMonth;
        this.dueDay = dueDay;
        this.dueYear = dueYear;
        this.priority = priority;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDueMonth() {
        return dueMonth;
    }

    public void setDueMonth(int dueMonth) {
        this.dueMonth = dueMonth;
    }

    public int getDueDay() {
        return dueDay;
    }

    public void setDueDay(int dueDay) {
        this.dueDay = dueDay;
    }

    public int getDueYear() {
        return dueYear;
    }

    public void setDueYear(int dueYear) {
        this.dueYear = dueYear;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Homework{" +
                "course = '" + course + '\'' +
                ", name = '" + name + '\'' +
                ", dueMonth = " + dueMonth +
                ", dueDay = " + dueDay +
                ", dueYear = " + dueYear +
                ", priority = " + priority +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Homework homework = (Homework) o;
        return dueMonth == homework.dueMonth &&
                dueDay == homework.dueDay &&
                dueYear == homework.dueYear &&
                priority == homework.priority &&
                Objects.equals(course, homework.course) &&
                Objects.equals(name, homework.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(course, name, dueMonth, dueDay, dueYear, priority);
    }
}