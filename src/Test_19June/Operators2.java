package Test_19June;
//Create a Java program that demonstrates various arithmetic and assignment operators.
// **Requirements:** - Use +, -, *, /, % operators -
// Demonstrate assignment operators (=, +=, -=, *=, /=) -
// Show the results of each operation
public class Operators2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int c = a + b;
        System.out.println(c);
        int d = a - b;
        System.out.println(d);
        int e = a*b;
        System.out.println(e);
        int f = a/b;
        System.out.println(f);
        int g = a%b;
        System.out.println(g);


        int x = 1;
        int y = 2;
        x+=1;
        System.out.println(x);
        y-=1;
        System.out.println(y);
        x*=2;
        System.out.println(x);
        y/=2;
        System.out.println(y);

    }
}
