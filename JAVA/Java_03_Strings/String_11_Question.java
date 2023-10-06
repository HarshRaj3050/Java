// Write a Java program to replace spaces with underscores.

package Java_03_Strings;
public class String_11_Question {
    public static void main(String[] args) {
        String str = "Harsh Raj";
        System.out.println("-----Before Replace------");
        System.out.println(str);
        System.out.println("-----After Replace Space with Underscore-----");
        System.out.println(str.replace(' ', '_'));
    }
}
