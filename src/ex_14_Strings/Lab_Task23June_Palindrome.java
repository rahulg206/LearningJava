package ex_14_Strings;

import java.util.Scanner;

public class Lab_Task23June_Palindrome {
    public static void main(String[] args) {
        //  Palindrome
        //  madam ->  reverse(madam) -> madam ==
        //  s1 = madam
        // s1_reverse = madam
        //  s1 == s1_reverse
        // G
        System.out.println("Enter string ");
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        System.out.println(s1);
        String s1_rev = "";
        char s2 ;

        for(int i = s1.length()-1 ; i>=0; i--)
        {
            s2 = s1.charAt(i);
            s1_rev = s1_rev + s2;

        }
        System.out.println(s1_rev);

        if (s1.equals(s1_rev))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }

    }
}