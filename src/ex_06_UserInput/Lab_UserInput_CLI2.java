package ex_06_UserInput;

public class Lab_UserInput_CLI2 {
    public static void main(String[] args) {
        //12 24 34 10 in edit config - cli arguments
        System.out.println(args[0]);
        System.out.println(args[1]);
        System.out.println(args[2]);
        System.out.println(args[10]); // java.lang.ArrayIndexOutOfBoundsException
    }
}
