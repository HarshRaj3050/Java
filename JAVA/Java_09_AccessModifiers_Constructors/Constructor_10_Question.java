// Overload a constructor used to initialize a rectangle of length and breath for using custom parameters

package Java_09_AccessModifiers_Constructors;
class Rectangle {
    private int lenght;
    private int breath;
    public Rectangle(int lenght, int breath) {
        this.lenght = lenght;
        this.breath = breath;
    }
    public int getLenght() {
        return lenght;
    }
    public int getBreath() {
        return breath;
    }
}
public class Constructor_10_Question {
    public static void main(String [] args) {
        Rectangle rect = new Rectangle(5,3);
        System.out.println("Lenght is : " + rect.getLenght());
        System.out.println("Breath is : " + rect.getBreath());
    }
}
