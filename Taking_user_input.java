import java.util.Scanner;//import Scanner class
public class Taking_user_input {
    public static void main(String[] args){
        //sout is a shortcut for system.out.println
        //shift +enter for new line
        System.out.println("check program weather run or not!");
        System.out.println("Taking input from the user");
        //Scanner is a class scobject is Scanner object
        //System.in means it's read keyboard data from the user end and execute those data
        Scanner scobject = new Scanner(System.in);

        //Reading data from keyboard
        //Java has own Scanner class for taking data from keyboard
        //for execute Scanner class we have to import java.util.Scanner
        //Must be declared import java.util.Scanner outside the main class
        //you can also say that its super-global declaration.

        System.out.println("Enter number 1");
        int a=scobject.nextInt();
        // int is a data type a is a variable name
        //scobject is Scanner  class object
        //nextInt() is a method which is candidates of scobject.nextInt()
        // we are using int data type that why using nextInt()
        //nextInt() method read data and store data in Scanner class object
        //this object is store in a variables named a
        System.out.println("Enter number 2");
        int b= scobject.nextInt();
        // same as above
        int sum; // sum is a variables that contain a and b values
        sum = a+b;
        System.out.println("The addition of two number is: "+sum);
        //+sum is used for show corresponding result in one line after the
        //msg: "the addition of two number is"

        String strobject = scobject.next();//String object
        System.out.println(strobject);
        System.out.println("Enter floating number: ");
        float num=scobject.nextFloat();
        System.out.println("The floating number is"+num);

        System.out.println("enter a double number");
        double num2 = scobject.nextDouble();
        System.out.println("the double number is: "+num2);
        System.out.println("Enter a character String: ");
        String sttext= scobject.next();
        System.out.println("Your character"+sttext+"is: "+sttext);//not working properly

    }
}
