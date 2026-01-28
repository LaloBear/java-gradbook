import java.util.*;

public class MainGradeBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student("Name", 0000);
        int choice = 0;

        while (true) {
            System.out.println("1. Add a grade");
            System.out.println("2. Remove a grade");
            System.out.println("3. View all grades");
            System.out.println("4. View average score");
            System.out.println("5. Exit");
            System.out.print("Choice:");
            choice = scanner.nextInt();
            scanner.nextLine();

            System.out.println();

            if (choice == 1) {
                System.out.println("Enter name of course name to add grade.");
                String courseName = scanner.nextLine();

                System.out.println("Add a grade 0-100.");
                double grade = scanner.nextDouble();
                scanner.nextLine();

                student.addGrade(courseName, grade);
                System.out.println("Grade has been added.");

            } else if (choice == 2) {
                System.out.println("Enter name of course to remove grade.");
                String courseName = scanner.nextLine();

                student.removeGrade(courseName);
                System.out.println("Grade has been removed.");

            } else if (choice == 3) {
                if (student.isEmpty()) {
                    System.out.println("There are no grades try adding some.");
                } else {
                    student.listGrades();
                }
            } else if (choice == 4) {
                if (student.isEmpty()) {
                    System.out.println("There are no grades try adding some.");
                } else {
                    student.averageScore();
                }
            } else if (choice == 5) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid.");
            }
        }

    }
}
