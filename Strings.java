import  java.util.Scanner;
public class Strings {
    public static void main(String[] args) {
        //String
        //string is a sequence of the character.
        // in java String is a class and java provide special supports of the String
        // it's not a primitive data type. it's a class
        // syntax String Stringname = new String();
        // just like Scanner class.

        String name = new String("Fahim");
        System.out.println(name);

        //special supports from java

        String name1 ="AHMED MOSTAKIM FAHIM";
        //SYNTAX--> String Stringname = "object name";
        System.out.println(name1);

        //Different types of printing method in java
        /*
        System.out.print()-->without new line
        System.out.println()-->with new line
        System.out.printf()-->
        System.out.format()-->
        */
        // print with printf() method
        int a=45;
        float b= 45.0f;
        System.out.printf("The value of %d and %f is: ",a,b);
        //here %d,%f is a format specifier. %d for integer and %f for float.
        /*
        Format specifier types
        %d is for integer
        %f is for float
        %c is for char
        %s for String
        System.out.format() is working the way printf does.
        */


        //String input from the user
        Scanner scobject = new Scanner(System.in);
        String name2 =scobject.nextLine();
        //better practice for long String used nextLine(). its contain all the string
        //if we used next() method then it contain only very first half of the String
        // and ignore rest of the part.
        System.out.println(name2);



    }
}
