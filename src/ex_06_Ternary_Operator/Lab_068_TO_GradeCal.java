package ex_06_Ternary_Operator;

public class Lab_068_TO_GradeCal {
    public static void main(String[] args){

        int marks = 39;
        String result = marks < 40 ? "FAIL" : marks == 40 ? "C" : marks == 60 ? "B" : marks == 75 ? "A" : marks == 90 ? "A+" : "NA";
System.out.println(result);
    }
}
// Marks 90 = A+, 75 = A, 60 = B, 40 = C, below 40 Fail