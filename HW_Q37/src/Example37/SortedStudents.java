package Example37;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortedStudents {
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // List to store student records
        ArrayList<Students> s = new ArrayList<>();

        // Accept 10 student records
        for (int i = 0; i <2; i++) {
            System.out.println("Enter student " + (i + 1) + " information:");
            System.out.print("Enter Name: ");
            String name = scanner.next();
            System.out.print("Enter Roll No: ");
            int rollNo = scanner.nextInt();
            System.out.print("Enter Age: ");
            int age = scanner.nextInt();
            System.out.print("Enter Score: ");
            int score = scanner.nextInt();

            // Create and add Student object to the list
            s.add(new Students(name, rollNo, age, score));
        }

        // Sort students based on score using Comparable interface
        Collections.sort(s);

        // Display students based on score groups
        ScoreGroup(s, 0, 50, "[0 - 50]");
        ScoreGroup(s, 50, 65, "[50 - 65]");
        ScoreGroup(s, 65, 80, "[65 - 80]");
        ScoreGroup(s, 80, 100, "[80 - 100]");

        // Close the scanner
        scanner.close();
    }

    // Method to display students based on score group
    private static void ScoreGroup(ArrayList<Students> students, int minScore, int maxScore, String group) {
        System.out.println("Students in Score Group " + group + ":");
        for (Students student : students) {
            if (student.score >= minScore && student.score <= maxScore) {
                student.displayInfo();
            }
        }
        System.out.println();
    }
}
