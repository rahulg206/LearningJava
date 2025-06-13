package ex_08_If_Condition;

import java.sql.SQLOutput;

public class Lab081_If_P1 {
    public static void main(String[] args) {
        int age = Integer.parseInt(args[0]);
        if (age > 18) {
            System.out.println("Yes you can go to GOA");
        }
        else
        {
            System.out.println("You cant go to GOA");
        }
    }
}

