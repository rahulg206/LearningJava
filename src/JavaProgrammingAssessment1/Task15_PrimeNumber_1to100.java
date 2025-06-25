package JavaProgrammingAssessment1;

public class Task15_PrimeNumber_1to100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100:");

        for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;

            // Check divisibility from 2 to sqrt(num)
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}