// This program is used for simple method overriding example. with dynamic method dispatch.

package Java_10_Inheritance_OverRiding;
class Student {
    public void show() {
        System.out.println("Student details.");
    }
}
class CollegeStudent extends Student {
    @Override
    public void show() {
        System.out.println("College Student details.");
    }
public static class OverRiding_03_Code {
    public static void main(String []args) {
        //Super class can contain subclass object.
        Student obj = new CollegeStudent();
        //method call resolved at runtime
        obj.show();
        }
    }
}
