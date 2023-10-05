package Java_03_Strings;

public class String_02_Code {
    public static void main(String[] args) {
        String s1 = "Harsh";

        // Length of String
        int stringLen = s1.length();
        System.out.println(stringLen);

        // Convert 'lower' case and 'UPPER' case
        String lower = s1.toLowerCase();
        System.out.println(lower);
        String upper = s1.toUpperCase();
        System.out.println(upper);

    }
}
