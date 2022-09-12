import  java.util.Scanner;
public class elseif_clouse {
    public static void main(String[] args) {
       /* //elseif clouse used to check multiple condition

        int x= 360;
        if(x>=361){
            System.out.println("england win the Ashes");
        } else if (x==360) {
            System.out.println("Ashes Drawn");
        } else if (x<361) {
            System.out.println("Australia retain the Ashes");
        }else {
            System.out.println("Minimum over left in the match");
        }

        // input from users */
        int xx;
        System.out.println("Enter Any Score");
        Scanner scobject = new Scanner(System.in);
        xx=scobject.nextInt();
        if(xx>360){
            System.out.println("Your match prediction");
            System.out.println("Endland win");
        } else if (xx==360) {
            System.out.println("Your match prediction");
            System.out.println("Ashes Drawn");
        } else if (xx<360) {
            System.out.println("Australia Retain The Ashes");

        } else {

            System.out.println("Thank you");
        }

        System.out.println("You predict \t"+xx+"\tScored");

    }
}
