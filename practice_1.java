import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args) {
        // comparison the input number from user to check the number is greater or not.
        Scanner scobject=  new Scanner(System.in);
        double num1;
        System.out.println("Comparison number");
        System.out.println("Enter the Number: ");
        num1 =scobject.nextDouble();
        System.out.println(num1>10);


    }
}
