package Test_19June;

//Write a program that demonstrates comparison and logical operators.
// **Requirements:** - Use comparison operators (==, !=, <, >, <=, >=)
// - Use logical operators (&&, ||, !)
// - Print boolean results with explanatory messages
public class Operators3 {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        int c = 6;
        int d = 7;

        if (a==b)
        {
            System.out.println("a is equal to b");
        }
        if (c!=d)
        {
            System.out.println("c is not equal to d" );
        }
        if (c<d);
        {
            System.out.println("c is less than d");
        }
        if (d > c);
        {
            System.out.println("d is greater than c");
        }

        for (int i = 0; i <= 5; i++)
        {
            System.out.println(i);
        }

        for(int j = 5; j>= 0; j--)
        {
            System.out.println(j);
        }

        // Logical operators
        boolean isTrue;
        isTrue = (a > b) && (b > 0);
        System.out.println("(a > b) && (b > 0): " + isTrue);   // true

        isTrue = (a < b) || (b > 0);
        System.out.println("(a < b) || (b > 0): " + isTrue);   // true

        isTrue = !(a == b);
        System.out.println("!(a == b): " + isTrue);            // true


    }

}
