package ex_08_If_Condition;

public class Lab_Task25June_2ndLargest {
        public static void main(String[] args) {
            int[] numbers = {10, 45, 67, 89, 34, 89, 23};

            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            for (int num : numbers) {
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }

            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("No second largest number found.");
            } else {
                System.out.println("Second largest number is: " + secondLargest);
            }
        }
    }

