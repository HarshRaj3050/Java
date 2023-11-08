/*   Create a class monkey with jump ( ) and bite ( ) methods Create a class human which inherits
     this monkey class and implements BasicAnimal interface with eat ( ) and sleep ( ) methods
 */

package Java_11_Abstract_Interface;
class monkey {
    public void jump() {
        System.out.println("Jumping");
    }
    public void bite() {
        System.out.println("Biting");
    }
}
interface BasicAnimal45 {
    void eat();
    void sleep();
}
class Human45 extends monkey implements BasicAnimal45{
    public void eat() {
        System.out.println("Eating");
    }
    public void sleep() {
        System.out.println("Sleeping");
    }
}
public class Practice {
}