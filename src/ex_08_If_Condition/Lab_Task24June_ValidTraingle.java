package ex_08_If_Condition;


import java.util.Scanner;

public class Lab_Task24June_ValidTraingle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 sides of triangle : ");
        int side1=sc.nextInt();
        int side2=sc.nextInt();
        int side3=sc.nextInt();

        if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
            System.out.println("The given sides form a valid triangle.");
        }
        else{
            System.out.println("The given sides do not form a valid triangle.");
        }
    }
}
