/*We are created two class named England and Wales
* and Wales extends England Class */
class England{
    public void t20(){
        System.out.println("England Pakistan last t20 sunday at lahore");
    }
    public void tour(){
        System.out.println("England tour of Australia");
    }
}
class Wales extends England{
    public void lastGame(){
        System.out.println("Eng-Pak game goes to series decider");
    }
    @Override
    public void tour(){
        System.out.println("Charles is the king of Wales");
    }
}
public class Dynamic_Method_Dispatch {
    public static void main(String[] args) {
     /* //obj of class England
        England eng = new England();
        eng.tour();
        //obj of Wales class
        Wales wl = new Wales();
        wl.lastGame();*/

        /*Can we make different obj together like this?
        * here England eng reference is super class
        * and Wales obj is subClass
        * that's why java can not throw an error
        * NB: subClass obj can not be equal to SuperClass
        * Wales wl = new England--> this can not be allowed in java
        * this time java throw an error
        * Syntax
        * SuperClass objectName = New subClass  */

        England eng = new Wales();
        eng.tour(); //print Wales class obj (override)
        //and this is dynamic methods dispatch
        //Charles is the king of Wales-->runs Wales class obj
        eng.t20();
    }
}
