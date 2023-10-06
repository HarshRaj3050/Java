package Java_03_Strings;

public class String_02_Code {
    public static void main(String[] args) {
        String s1 = "Harsh";

        // Length of String
        System.out.println("----Length----");
        int stringLen = s1.length();
        System.out.println(stringLen);

        // Convert 'lower' case and 'UPPER' case
        System.out.println("----lower and UPPER----");
        String lower = s1.toLowerCase();
        System.out.println(lower);
        String upper = s1.toUpperCase();
        System.out.println(upper);

        // Trim (Remove white space)
        System.out.println("----Trim----");
        String notTrim = "    Harsh     ";
        System.out.println(notTrim.trim());

        // substring from nth character
        System.out.println("----substring----");
        System.out.println(s1.substring(2));
        System.out.println(s1.substring(1,4));

        // Replace of 'x' with 'y'
        System.out.println("----Replace----");
        String newS1 = s1.replace("Harsh", "Raj");
        System.out.println(newS1);

        // Gives nth character of s1
        System.out.println("----Character at nth index number----");
        System.out.println(s1.charAt(4));

        // Gives the position of the first occurrence of 'x' in the string
        System.out.println("----Position of first occurrence----");
        System.out.println(s1.indexOf('r'));
        System.out.println(s1.indexOf('h',3));

        // Return 'true' if s1 is equal to s2
        System.out.println("-----'true' if s1 is equal to s2-----");
        String s2 = "harsh";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));
    }
}
