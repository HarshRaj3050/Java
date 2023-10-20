// Programmer object can access the field of own class as well as of Employee class i.e. code reusability.

package Java_09_AccessModifiers_Constructors;
class Employee{
    float salary=40000;
}
class Programmer extends Employee {
    int bonus = 10000;
}
public class Inheritance_01_Code {
    public static void main(String [] args){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is : " + p.salary);
        System.out.println("Bonus of Programmer is : " + p.bonus);
    }
}
