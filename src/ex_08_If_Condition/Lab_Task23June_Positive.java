package ex_08_If_Condition;
import java.util.Scanner;
public class Lab_Task23June_Positive {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner= new Scanner(System.in);
        int num = scanner.nextInt();
        if(num>0)
        {
            System.out.println("num" + ":Postive number");
        }else if (num<0)
        {
            System.out.println("num" + ":Negative number");
        } else
        {
            System.out.println("num" + ":Zero number");
        }
    }
}
