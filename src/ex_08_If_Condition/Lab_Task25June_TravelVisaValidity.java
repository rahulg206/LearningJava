package ex_08_If_Condition;
import java.util.Scanner;

public class Lab_Task25June_TravelVisaValidity {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your age : ");
            int age = sc.nextInt();

            System.out.println("Enter your visa status (valid / Invalid)");
            String visa = sc.next().toLowerCase();
            boolean visaValid ;

            if(visa.equals("valid"))
            {
                visaValid = true;
                if(age >= 18 && visaValid == true){
                    System.out.println("you visa is valid you can travel");
                }
                if (age<18){
                    System.out.println("Age is less. you cannot travel");
                }
            }
            else
            {
                System.out.println("your visa is Invalid");
            }



        }
    }