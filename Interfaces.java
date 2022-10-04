//created an interface
interface Bicycle{
    //interface is a group of methods.
    //methods applyBreak, speedUp
    /*applyBreak parameters-->decrement
    * speedUp parameters-->increments*/
    public void speedUp(int increments);
    public void applyBreak(int decrements);
}
//implements that interface
/*syntax
* class className implements interfaceName
* here implements is a keyword*/
 class DurantoCycle implements Bicycle{
    //declare a variables
    int speedLimits =50;
    //when you are implements interface methods then make sure
    //it is public.
   public void speedUp(int increments){
        speedLimits += increments;
        System.out.println("You are running at..."+speedLimits);
    }
   public void applyBreak(int decrements){
        speedLimits -= decrements;
        System.out.println("Apply break..."+speedLimits);
    }
}
public class Interfaces {
    public static void main(String[] args) {
      DurantoCycle dc = new DurantoCycle();
      dc.speedUp(15);
      dc.applyBreak(30);
    }
}
