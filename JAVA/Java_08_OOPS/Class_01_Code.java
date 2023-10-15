package Java_08_OOPS;
class Empolyee {
    String name;
    int id;
    int salary;
    void empolyeeDetails() {
        System.out.println("Emolyee Name is : " + name);
        System.out.println("Empolyee Id is : " + id);
    }
    int getSalary() {
       return salary;
    }
}
public class Class_01_Code {
    public static void main(String[] args) {
        System.out.println("-----Print First Empolyee Details-----");
        Empolyee emp1 = new Empolyee();
        emp1.name = "Harsh Raj";
        emp1.id = 3452;
        emp1.salary = 60000;
        emp1.empolyeeDetails();
        System.out.println(emp1.name + " salary is : " + emp1.getSalary());

        System.out.println("-----Print Second Empolyee Details-----");
        Empolyee emp2 = new Empolyee();
        emp2.name = "Rohan Kumar";
        emp2.id = 6321;
        emp2.salary = 50000;
        emp2.empolyeeDetails();
        System.out.println(emp2.name + " salary is : " + emp2.getSalary());
    }
}
