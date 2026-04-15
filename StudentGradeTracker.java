import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        double[] marks = new double[n];
        double sum = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Enter marks of student " + (i + 1) + ": ");
            marks[i] = sc.nextDouble();
            sum += marks[i];
        }

        double highest = marks[0];
        double lowest = marks[0];

        for (int i = 0; i < n; i++) {
            if (marks[i] > highest) highest = marks[i];
            if (marks[i] < lowest) lowest = marks[i];
        }

        double average = sum / n;

        System.out.println("\nAverage = " + average);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);

        sc.close();
    }

}