package ex_10_For_Loop;

public class Lab_Vowels_Task1 {
    public static void main(String[] args) {
        //✅ Count vowels and consonants in a String.  -pramod, → vowels - 2, consnants - 4
        int vowels = 0;
        int consonants = 0;

        String name = "rahul";
        System.out.println("String name is :" +name);
        for (int i = 0; i< name.length(); i++) {
            char ch = name.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("No. of vowels:" + vowels);
        System.out.println("No. of constants:" + consonants);

    }
}
