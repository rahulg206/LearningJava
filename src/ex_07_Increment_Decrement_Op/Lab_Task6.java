package ex_07_Increment_Decrement_Op;

public class Lab_Task6 {
    public static void main(String[] args) {

        int x = 5;

        int y = x++ + ++x + x++ + ++x;

        System.out.println("x = " + x + ", y = " + y);

    }
}



//exp1 -> x++
// x exp1
// 6 5
//exp2 -> ++x
// x exp2
// 7 7
//exp3 -> x++
// x exp3
// 8 7
//exp4 -> ++x
// x exp4
// 9 9

//y = exp1 + exp2 + exp3 + exp4
// y = 5 + 7 + 7 + 9 = 28

