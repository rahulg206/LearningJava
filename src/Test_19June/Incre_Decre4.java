package Test_19June;

public class Incre_Decre4 {
    public static void main(String[] args) {
        int i;

        // Pre-increment
        i = 5;
        System.out.println("Pre-increment:");
        System.out.println("Before: i = " + i);
        int preInc = ++i; // i is incremented first, then assigned
        System.out.println("After: i = " + i + ", Result = " + preInc);

        // Post-increment
        i = 5;
        System.out.println("\nPost-increment:");
        System.out.println("Before: i = " + i);
        int postInc = i++; // i is assigned first, then incremented
        System.out.println("After: i = " + i + ", Result = " + postInc);

        // Pre-decrement
        i = 5;
        System.out.println("\nPre-decrement:");
        System.out.println("Before: i = " + i);
        int preDec = --i; // i is decremented first, then assigned
        System.out.println("After: i = " + i + ", Result = " + preDec);

        // Post-decrement
        i = 5;
        System.out.println("\nPost-decrement:");
        System.out.println("Before: i = " + i);
        int postDec = i--; // i is assigned first, then decremented
        System.out.println("After: i = " + i + ", Result = " + postDec);
    }
}
