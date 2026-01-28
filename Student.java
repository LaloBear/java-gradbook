//A part of Gradebook file

import java.util.*;

public class Student {
    private String name;
    private int id;
    private ArrayList<Grade> grades;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
        grades = new ArrayList<>();
    }

    public void addGrade(String course, double score) {
        if (score < 0 || score > 100) {
            System.out.println("Invalid. Must be 0 - 100.");
            return;
        }
        Grade newGrade = new Grade(course, score);
        grades.add(newGrade);

        System.out.println("Grade has been added.");
    }

    public void removeGrade(String courseName) {
        boolean found = false;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i).getCourseName().equalsIgnoreCase(courseName)) {
                grades.remove(i);
                System.out.println("Grade removed.");
                found = true;
                break;
            }
        }
        if (found == false) {
            System.out.println("Course not found.");
        }
    }

    public void listGrades() {
        System.out.println("All Grades:");
        for (int i = 0; i < grades.size(); i++) {
            System.out.println(grades.get(i));
        }
    }

    public void averageScore() {
        double total = 0;
        int count = 0;

        if (grades.isEmpty()) {
            System.out.println("No grades recorded yet.");
            return;
        }

        for (int i = 0; i < grades.size(); i++) {
            total += grades.get(i).getScore();
            count++;
        }
        double average = total / count;
        System.out.printf("The average score: %.2f", average);
    }

    public boolean isEmpty() {
        return grades.isEmpty();
    }
}
