package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task1 {
    public static void main(String[] args) {
        System.out.println("Enter 3 sides of traingle");
        System.out.println("Enter side1");
        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        System.out.println("Enter side2");
        //Scanner scanner2 = new Scanner(System.in);
        int side2 = scanner.nextInt();
        System.out.println("Enter side3");
       // Scanner scanner3 = new Scanner(System.in);
        int side3 = scanner.nextInt();

        if (side1 == side2 && side2 == side3)
            System.out.println("Traingle is  equilateral. All sides are equal");
        else{
            if (side1 == side2 || side2 == side3 || side1 == side3)
                System.out.println("Traingle is isoceles. Two sides are equal");
            else
            System.out.println("Traingle is scalene. No sides are equal");
        }











    }
}
