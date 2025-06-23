package ex_14_Strings;

public class Lab140_Interview_P1 {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s4 = "Hello";
        String s10 = "Hello";

        String s2 = new String("Hello");
        String s3 = new String("Hello");
        String s5 = new String("hello");
//only 1 hello string will be created in SCP(String Constant Pool which will point to s1, s4, s10
// 3 different objects are created with hello string in Heap Object Area
        // SCP | OA
        // 1 | 3 -> 4

    }
}