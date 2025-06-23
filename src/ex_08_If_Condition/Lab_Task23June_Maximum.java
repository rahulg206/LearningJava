package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task23June_Maximum {
    public static void main(String[] args) {
        System.out.println("Enter the number1");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.println("Enter the number2");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Maximum number is : " + num1);
        } else if (num2 > num1) {
            System.out.println("Maximum number  is : " + num2);
        } else {
            System.out.println("Both are equal");
        }
    }
}

