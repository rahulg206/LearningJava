package ex_08_If_Condition;
import java.util.Scanner;

public class Lab_Task25June_NumberPalindrome {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number to check :");
            int orignal = sc.nextInt();
            int num = orignal;
            int rev = 0;

            while(num>0){
                int digit = num % 10;   //121%10 = 1, 12%10 = 2, 1%10 = 1
                rev = rev * 10 + digit; //1,          12,        121
                num = num / 10 ;        //12,         1,         0
            }

            if(orignal == rev){
                System.out.println("palindrome");
            } else {
                System.out.println("Not palindrome");
            }

            sc.close();
        }
    }

