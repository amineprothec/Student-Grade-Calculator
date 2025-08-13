import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Student Grade Calculator ===");
        System.out.print("Enter number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.print("Enter marks for subject " + i + " (0-100): ");
            double marks = scanner.nextDouble();
            if (marks < 0 || marks > 100) {
                System.out.println("❌ Invalid marks! Please enter between 0 and 100.");
                i--; // إعادة المحاولة لنفس المادة
            } else {
                totalMarks += marks;
            }
        }

        double average = totalMarks / numSubjects;
        char grade;

        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("\n=== Results ===");
        System.out.printf("Total Marks: %.2f%n", totalMarks);
        System.out.printf("Average: %.2f%n", average);
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}
