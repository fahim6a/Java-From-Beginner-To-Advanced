class Employee{
    int id; // datatype attribute_name
    String name; // datatype attribute_name
    int salary; // datatype attribute_name
    //define a method named printDetails
    public void printDetails(){
        System.out.println("my id is: "+id);
        System.out.println("my name is: "+name);
    }
    public int getSalary(){
        return salary;
    }
}
public class Custom_Class {
    public static void main(String[] args) {
        //create an object to access the class
       Employee fahim = new Employee();

       /*set the attribute value
object_name.attribute_name = value (number)
object_name.attribute_name = "String value"*/

       fahim.id=6; //setting the attributes
       fahim.name="Fahim"; //setting the attributes
        fahim.salary=100000;

//        System.out.println(fahim.id); //printing the attributes
//        System.out.println(fahim.name);//printing the attributes

        fahim.printDetails(); //object_name.method_name();
        //then prints the attributes values which is already defined
        //inside the class method
        //similarly we can make tons of object like as follows
        Employee nijhum = new Employee();
        nijhum.id=32;
        nijhum.name="Nijhum";
        nijhum.salary=999999;
        nijhum.printDetails();

        /*to print the salary
datatype salary = object_name.getSalary();
NB: java throws an error because we didn't define the getSalary() method yet
now creating the new method inside the Employee class named getSalary();*/

  int salary = fahim.getSalary();
  int Salary = nijhum.getSalary();
        System.out.println("Fahim salary is: "+salary);
        System.out.println("Nijhum salary is: "+Salary);

    }
}
