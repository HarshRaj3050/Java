/* Write a Java program to fill in a letter template which looks like below:

    '''  letter = “Dear <|name|>, Thanks a lot” '''
         Replace <|name|> with a string (some name)
 */

package Java_03_Strings;
import java.util.Scanner;
public class String_12_Question {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String letter = "letter = “Dear <|name|>, Thanks a lot”";
        System.out.print("Enter Your Name : ");
        String name = scan.nextLine();
        System.out.println(letter.replace("<|name|>", name));
    }
}
