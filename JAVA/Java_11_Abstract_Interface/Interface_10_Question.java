/*   Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits
     this monkey class and implements BasicAnimal interface with eat ( ) and sleep ( ) methods
 */

package Java_11_Abstract_Interface;
interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey {
    void jump() {
        System.out.println("Jump");
    }
    void bite() {
        System.out.println("Bite");
    }
}
class Human extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Eat the Food....");
    }

    @Override
    public void sleep() {
        System.out.println("Sleep at Night....");
    }
}
public class Interface_10_Question {
    public static void main(String[] args) {
        Human human = new Human();
        human.eat();
        human.jump();
    }
}
