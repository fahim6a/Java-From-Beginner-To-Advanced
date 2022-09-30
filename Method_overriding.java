/*let we have 1 class named hales and have 2 method named
* canBat and CanField
* */

class hales{
    //variable
    public int runs=55;
    public int  canBat(){
        return 100;
    }
    public void canField(){
        System.out.println("Mark Butcher: Oh ho! hales takes stunner.");
    }
}

/*And we have another class named JosButtler
* which is extends class hales */
class josButtler extends hales{
    //access hales class from josButtler class
    //methods
    public void CanKep(){
        System.out.println("Jos you beauty!");
    }

    @Override
    //@override is a notation of override method.
    //developer can easily understand the code and method
    //here @override method in hales
    //override method is canBat () and canField()
    public int canBat() {
        return super.canBat();
    }

    public void canField(){
        System.out.println("is it override?");
    }

}

public class Method_overriding {
    public static void main(String[] args) {
     //create an object of hales
        hales hobj = new hales();
        hobj.canBat();
        hobj.canField();
        josButtler jb = new josButtler();
        jb.CanKep();
        jb.canField();
    }
}
