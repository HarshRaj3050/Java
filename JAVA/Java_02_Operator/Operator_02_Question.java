// Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.

package Java_02_Operator;
class Operator_02_Question {
    public static void main(String[] args)
    {
        System.out.println("Your Grade is : A");
        System.out.println("-----Encrypt the Grade-----");
        char grade = 'A' + 8;
        System.out.println("Your Encrypt Grade is : " + grade);

        System.out.println("-----Decrypt the Grade-----");
        grade = (char) (grade - 8);
        System.out.println("You Decrypt Grade is : " + grade);
    }
}