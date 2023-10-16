// Access modifiers, getters & setters in Java

package Java_09_AccessModifiers_Constructors;
class Empolyee1 {
    private String name;
    private int id;
    void setName(String n) {
        name = n;
    }
    String getName() {
        return name;
    }
    void setId(int n) {
        id = n;
    }
    int getId() {
        return id;
    }
}
public class AccessModifiers_01_Code {
    public static void main(String[] args) {
        Empolyee1 emp1 = new Empolyee1();
        emp1.setName("Harsh");
        emp1.setId(1004);
        System.out.println("Name is : " + emp1.getName());
        System.out.println("Id is : " + emp1.getId());
    }
}
