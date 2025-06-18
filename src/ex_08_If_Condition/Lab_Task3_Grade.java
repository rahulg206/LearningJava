package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task3_Grade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the numerical score (0-100): ");
        int score = scanner.nextInt();

        char grade;

        if (score >= 90 && score <= 100) {
            grade = 'A';
        } else if (score >= 80 && score <= 89) {
            grade = 'B';
        } else if (score >= 70 && score <= 79) {
            grade = 'C';
        } else if (score >= 60 && score <= 69) {
            grade = 'D';
        } else if (score >= 0 && score <= 59) {
            grade = 'F';
        } else {
            System.out.println("Invalid score entered. Please enter a score between 0 and 100.");
            return;
        }

        System.out.println("The grade is: " + grade);
    }
}


