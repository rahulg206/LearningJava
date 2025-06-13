package ex_07_Increment_Decrement_Op;

import javax.print.attribute.standard.MediaSize;

public class Lab_Task2 {
    public static void main(String[] args) {
        int i = 1;

        i = i++ + ++i;

        System.out.println(i); // ?
    }
}

//exp1 -> i++
// i exp1
// 2 1
//+
//exp2 -> ++i
// i  exp2
// 3  3

//exp1 + exp2 = 1+3 = 4
