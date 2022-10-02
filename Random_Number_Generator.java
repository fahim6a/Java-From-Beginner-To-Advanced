/*Create a class Game, which allows a user to play "Guess the Number" game once.
Game should have the following methods:
Constructor to generate the random number
takeUserInput() to take a user input of number
isCorrectNumber() to detect whether the number entered by the user is true
getter and setter for noOfGuesses
*/
import java.util.Random;
import java.util.Scanner;
class game{
    public int number;
    public int InputNumber;
    public int NoOfGuess=0;
//getter and setter
    public int getNoOfGuess() {
        return NoOfGuess;
    }
    public void setNoOfGuess(int noOfGuess) {
        NoOfGuess = noOfGuess;
    }
    //constructors
     game(){
        //generates random number
        //class of random number
        Random rnd = new Random();
        this.number =rnd.nextInt(100);
    }

    public void takeUserInput(){
        System.out.println("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        InputNumber=sc.nextInt();
    }

    public boolean isCorrectNumber(){
    if (InputNumber ==number){
        System.out.printf("Yes %d right\n. you takes %d attempts. ",number,NoOfGuess);
        return true;
    } else if (InputNumber<number) {
        System.out.println("Number is too low...");
    } else if (InputNumber>number) {
        System.out.println("Number is too high...");
    }
        return false;
    }
}

public class Random_Number_Generator {
    public static void main(String[] args) {
        //obj of game class
        boolean b =false;
        while(!b) {
            game gobj = new game();
            gobj.takeUserInput();
             b = gobj.isCorrectNumber();
            System.out.println(b);
        }

    }
}
