package ex_07_Increment_Decrement_Op;

public class Lab_Task5 {
    public static void main(String[] args) {
        int a = 5;

        int b = a++ + ++a;

        System.out.println("a: " + a); // Output:

        System.out.println("b: " + b); // Output: ?
    }
}

//exp1 -> a++
//a exp1
//6  5
//+
//exp2 -> ++a
//a exp2
//7 7

//b = exp1 + exp2 -> 5 + 7 = 12


