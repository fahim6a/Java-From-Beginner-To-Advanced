//problem-1
//class Employees{
//    int Salary; //attribute
//    String name;
//
//    public int getSalary(){ //methods
//        return Salary;
//    }
//    public String getName(){
//        return name;
//    }
//    public void setName(String n){ //setName method(/*parameter*/ datatype n)
//        name=n;
//    }
//
//}

////problem2
//class  cellphone{
//    public void ringing(){
//        System.out.println("ringing...");
//    }
//    public void vibrating(){
//        System.out.println("vibrating...");
//    }
//}

////problem-3
//class square{
//    int side;
//    public int calculating_area(){
//        //formula A = side^2
//        return side*side;
//    }
//    public int perimeter(){
//        //Perimeter of a Square P = 4a
//        return 4*side;
//    }
//}

//problem-4
//class rectangle{
//    //Area = L x B Perimeter = 2 (L+B)
//
//}

//problem-5
class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}

public class Custom_class_practice {
    public static void main(String[] args) {
        //problem-1
//      Employees dataset = new Employees(); //object
//      dataset.setName("Ahmed Mostakim Fahim");
//      //print name
//        System.out.println("Employee Name is: "+dataset.getName());//object_name.methods_name()
//        //set Salary
//        dataset.Salary = 15000;
//        //print salary
//        System.out.println("Employee Salary is: "+dataset.getSalary());

//        //problem-2
//        cellphone cellobj = new cellphone();
//        cellobj.ringing();cellobj.vibrating();

//        //problem-3
//        square sqobj = new square();
//        sqobj.side=4;
//        System.out.println(sqobj.calculating_area());
//        System.out.println(sqobj.perimeter());

        //problem-4
        //......
        //problem-5
        Tommy tomobj = new Tommy();
        tomobj.fire(); tomobj.hit(); tomobj.run();

    }
}
