package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task23June_CheckVowel {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the single char");
        char ch = scanner.next().toLowerCase().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is vowel!");
        } else if (ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is consonent");
        } else {
            System.out.println("Invalid Char!");

        }
    }
}
