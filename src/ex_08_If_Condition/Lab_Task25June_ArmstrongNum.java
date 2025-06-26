package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task25June_ArmstrongNum {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int original = scanner.nextInt();
            int number = original;
            int result = 0;
            int digits = 0;

            // Count number of digits
            int temp = number;
            while (temp != 0) {
                digits++;
                temp /= 10;
            }

            // Calculate sum of digits raised to the power of 'digits'
            while (number != 0) {
                int digit = number % 10;
                result += Math.pow(digit, digits);
                number /= 10;
            }

            // Check result
            if (result == original) {
                System.out.println(original + " is an Armstrong number.");
            } else {
                System.out.println(original + " is NOT an Armstrong number.");
            }
        }
    }
