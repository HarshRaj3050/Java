package Java_09_AccessModifiers_Constructors;
import java.util.Scanner;
class Emp{
    private String name;
    private int id;
    void nameSet1(String n) {
        name = n;
    }
    String nameGet() {
        return name;
    }
    void idSet(int i) {
        id = i;
    }
    int idGet() {
        return id;
    }
    void details() {
        System.out.println("Empolyee Name is : " + nameGet() + "\nEmpolyee Id is : " + idGet());
    }
}
public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Emp emp1 = new Emp();
        emp1.nameSet1("Harsh Raj");
        emp1.idSet(1004);
        emp1.details();
    }
}
