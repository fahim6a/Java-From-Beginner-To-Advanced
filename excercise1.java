import java.util.Scanner;
public class excercise1 {
    public static void main(String[] args){
        //calculate the average marks of the students from all subject
        //must be have an option for user-input
        //lets get started!
       System.out.println("Calculate Your average mark");
        Scanner scobject = new Scanner(System.in);
        float sub1,sub2,sub3,sub4, sub5,sub6;
        float sumofthenumbers;
        System.out.println("Enter Your Database managment marks");
        sub1=scobject.nextFloat();
        System.out.println("Enter Your Algorithm marks");
        sub2=scobject.nextFloat();
        System.out.println("Enter Your Data Structure marks");
        sub3=scobject.nextFloat();
        System.out.println("Enter Your Compiler Design marks");
        sub4=scobject.nextFloat();
        System.out.println("Enter Your Numerical Method marks");
        sub5=scobject.nextFloat();
        System.out.println("Enter Your Java Programming marks");
        sub6=scobject.nextFloat();

        sumofthenumbers=sub1+sub2+sub3+sub4+sub5+sub6;
        double avg=sumofthenumbers/6;
        System.out.println("Your average mark is: "+avg);

        //km to mile conversion










    }
}
