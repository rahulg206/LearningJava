package ex_10_For_Loop;

import java.util.Scanner;

public class Lab_Palindrome_Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Convert to lowercase for case-insensitive comparison
        String original = input.toLowerCase();
        String reversed = "";

        // Reverse the string
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        System.out.println("Reversed string is :" + reversed);

        // Check if original and reversed strings are the same
        if (original.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }
}
