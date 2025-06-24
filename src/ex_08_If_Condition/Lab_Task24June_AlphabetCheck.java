package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task24June_AlphabetCheck
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        char ch = sc.next().charAt(0);

        if((ch >='a' && ch <='z') || (ch >='A' && ch <='Z')){
            System.out.println(ch + " is an alphabet");
        }
        else{
            System.out.println(ch + " is not an alphabet");
        }
    }
}

