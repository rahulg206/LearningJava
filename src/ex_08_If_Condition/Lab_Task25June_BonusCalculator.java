package ex_08_If_Condition;

import java.util.Scanner;

public class Lab_Task25June_BonusCalculator {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your salary : ");
            double salary = sc.nextDouble();

            System.out.println("Enter year of Joining :");
            int join_year = sc.nextInt();

            double bonus ;
            double bonusGained ;
            double totalSalary;
            if(2025-join_year < 1){
                System.out.println("No bonus for you experience is low work hard !! ");
                System.out.println(salary + " sorry no bonus for you");
            } else if ( 2025-join_year <= 3 ) {
                bonus = 5;
                System.out.println("congratulation you got 5% bonus");
                bonusGained =( salary * bonus) / 100;
                totalSalary = salary + bonusGained ;
//            System.out.println(bonusGained);
                System.out.println(totalSalary + " Salary after bonus");
            }else if ( 2025-join_year <= 6 ) {
                bonus = 10;
                System.out.println("congratulation you got 10% bonus");
                bonusGained =( salary * bonus) / 100;
                totalSalary = salary + bonusGained ;
                System.out.println(totalSalary + " Salary after bonus");
            } else {
                bonus = 15;
                System.out.println("congratulation you got 15% bonus");
                bonusGained =( salary * bonus) / 100;
                totalSalary  = salary + bonusGained ;
                System.out.println(totalSalary + " Salary after bonus");
            }
        }
    }
