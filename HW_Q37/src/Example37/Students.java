package Example37;
	
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	class Students implements Comparable<Students> {
	    String name;
	    int rollNo;
	    int age;
	    int score;

	    // Parameterized constructor
	    Students(String name, int rollNo, int age, int score) {
	        this.name = name;
	        this.rollNo = rollNo;
	        this.age = age;
	        this.score = score;
	    }

	    // Comparable interface implementation for sorting
	    @Override
	    public int compareTo(Students other) {
	        return Integer.compare(this.score, other.score);
	    }

	    // Method to display student information
	    void displayInfo() {
	        System.out.println("Name: " + name + ", Roll No: " + rollNo + ", Age: " + age + ", Score: " + score);
	    }
	}

/*
37. Make list of Students having name, roll no ., age, score.
 Write a program to accept 10 students record and arrange the Students 
 based on the score group [0 - 50], [50 - 65] ,[6 80 ],[80-100]*/