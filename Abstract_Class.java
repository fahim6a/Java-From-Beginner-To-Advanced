/*Abstract method
* A method that is declared without an implementations
* What is abstract Class
* if a class includes abstract method is called Abstract Class
* */
abstract class EnglandTour{
    //constructor
    public EnglandTour(){
        System.out.println("England take on australia on sunday");
    }
    //methods
    public void Australia(){
        System.out.println("Welcome England! here in Australia");
    }
    abstract public void commentry();
    abstract public void hales();
}
//class Nz inherit EnglandTour
 class Nz extends EnglandTour{
    @Override
  public void commentry (){
      System.out.println("Mark waugh: hello Nz hopes so you'll beating down the thunder pakistan and Bangladesh inr");
    }
    //we can make millions of class using abstract class like hales
    @Override
    public void hales(){
        System.out.println("Yes, i dominated in bbl");
    }
}
abstract class Bangladesh{
    //constructor
    Bangladesh(){
        System.out.println("Hello, Nz. we are safely landed.");
    }
    abstract public void shakib();
    abstract public void commentry();
}
class pakistan extends Bangladesh{
    @Override
    public void shakib(){
        System.out.println("Rizwan: hello shakib!");
    }
    @Override
    public void commentry(){

    }
}
public class Abstract_Class {
    public static void main(String[] args) {
      //abstract class is a standard
        //you can not make an object of abstract class
        //abstract means it has no present in real-life
        Nz summer = new Nz();
        /*can we make EnglandTour object?
        * no. if we try to make an object of EnglandTour
        * java throws an error. */
        pakistan pk = new pakistan();
        //subclass provide all the implementations of parent class

    }
}
