//create class named base
class base{
    int x;
    //getter and setter

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void print(){
        System.out.println("I'M FAHIM");
    }
}
//create another class named derived
class derived extends base{
    /*you want to copy base class value in derived class
    and add extra method or value. so we have to use inheritance concept
    for used inheritance, we use extends keyword. */
int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
public class Inheritance_chap10 {
    public static void main(String[] args) {
     //create obj of base
        base bobj = new base();
        bobj.setX(5);
        System.out.println(bobj.getX());
        //if we create derived class obj, also we can access this values
       /*
       derived bobj = new derived();
        bobj.setX(10);
        System.out.println(bobj.getX());
        */
        derived dobj = new derived();
        dobj.setY(1021);
        System.out.println(dobj.getY());
        bobj.print();
    }
}
