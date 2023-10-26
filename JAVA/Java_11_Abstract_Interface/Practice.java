/*   Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits
     this monkey class and implements BasicAnimal interface with eat ( ) and sleep ( ) methods
 */

package Java_11_Abstract_Interface;
class Monkey1 {
    void jump() {
        System.out.println("Jumping");
    }
    void bite() {
        System.out.println("Biting");
    }
}
interface BasicAnimal1 {
    void eat();
    void sleep();
}
class Human1 extends Monkey1 implements BasicAnimal {
    public void eat() {
        System.out.println("Eating");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class Practice {
    public static void main(String[] args) {
        Human1 human = new Human1();
        human.eat();
    }
}
