package com.comparable;
import java.util.*;

public class Grades implements Comparable<Grades> {
    private int id;
    private String name;
    private char grade;
    private double score;

    public Grades(int id, String name, char grade, double score) {
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.score = score;
    }

    // Getters for all fields including the new field

    public double getScore() {
        return score;
    }

    public String toString() {

        return "[Id: " + id + ", Name: " + name + ", Grade: " + grade + ", Score: " + score + "]";
    }

    @Override
    public int compareTo(Grades other) {

        return Double.compare(this.score, other.getScore());
    }
}
