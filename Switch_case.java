import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
     //Switch case control instructions
        //Switch case used to choice environment
        // just like menu
        // you probably select one or multiple items when you're buying!
        System.out.println("Give your choice 270: eng will break the record");
        System.out.println("260 eng will won the match");
        System.out.println("150 nz will fight");
        int x;
        Scanner scobject= new Scanner(System.in);
        x=scobject.nextInt();

        //syntax-->
        /*
        Switch (Variables name){
           case condition :
           System.out.println("Your msg");
           break;
           case condition :
           System.out.println("Your msg");
           break;
           default:
           System.out.println("Your msg");
        }
        */


        switch (x){

            case 270:
                System.out.println("Endland set new T20 world Record");
                break;
            case 260:
                System.out.println("England won the match");
                break;
            case 150:
                System.out.println("NZ is still in the match");
                break;
            default:
                System.out.println("Stay tune with us");

        }
         // char test in Switch case
        // this input is not taken from user.
        //variables can String, Integer, char in java

        char ch = 'n';
        switch (ch){
            case 'f':
                System.out.println("fahim");
                break;
            case 'e':
                System.out.println("Era");
                break;
            case 'n':
                System.out.println("nizjhum");
                break;
            default:
                System.out.println("they are my beloved");
        }
        System.out.println("thanks for watching this!");

        //enhance Switch
        int xxx=25;
        switch (xxx) {
            case 25 -> System.out.println("you are a men");
            case 18 -> System.out.println("you are an adult");
            default -> System.out.println("You are a baby");
        }


    }
}
