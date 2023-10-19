// Create a class Game, which allows a user to play "Guess the Number" game once.

package Minor_Project;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;
class Game {
    Scanner scan = new Scanner(System.in);
    int userNumber;
    int computerNumber;
    int i;
    int choseNumber(int userNumber, int computerNumber , int i) {
        while (computerNumber!=userNumber) {
            i = i+1;
            System.out.print(i + ". Guess the Number : ");
            userNumber = scan.nextInt();
            if(computerNumber > userNumber) {
                System.out.println("-----Your Guess Number is Smaller, Choose Larger Number-----");
                return choseNumber(userNumber, computerNumber, i);
            } else if (computerNumber < userNumber){
                System.out.println("-----Your Guess Number is Larger, Choose Smaller Number-----");
                return choseNumber(userNumber, computerNumber, i);
            } else {
                System.out.println("***** YOUR GUESS NUMBER IS CORRECT *****");
                System.out.println("You will be " + i + " Times to find the Computer Number");
            }
        }
        return userNumber;
    }
}

public class Project_02_Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random ran = new Random();
        int random = ran.nextInt(101);
        Game game = new Game();

        System.out.println("*-*-*-*-User can Guess the Number Between 0 to 100-*-*-*-*-*");
        game.computerNumber = random;
        game.userNumber = -1;
        game.i = 0;
        game.choseNumber(game.userNumber, game.computerNumber, game.i);
    }
}


// Same Question with Different Way.

/*
package Minor_Project;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("-----Your Guess Number is Smaller, Choose Larger Number-----");
        }
        else if(inputNumber>number){
            System.out.println("-----Your Guess Number is Larger, Choose Smaller Number-----");
        }
        return false;
    }

}
public class Project_02_Code {
    public static void main(String[] args) {
          Game g = new Game();
          boolean b= false;
        while(!b){
                g.takeUserInput();
                b = g.isCorrectNumber();
        }
    }
}
*/