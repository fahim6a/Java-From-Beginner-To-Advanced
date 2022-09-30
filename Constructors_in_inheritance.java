import javax.management.remote.SubjectDelegationPermission;

class parent{
    //create a constructor
    parent (){
        System.out.println("hello Era");
    }
    parent (int a){
        System.out.println("Hello, I'M overloaded"+a);
    }
    private int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
class child extends parent{
    //create a constructor
    child (){
        //when we want to call second constructor of parent class then
        //used super(0) keyword.
        super(0);
        System.out.println("Hello Indra");
    }
    //now overloaded child class
    child (int x,int y){
        super(x);
        System.out.println("child class overloaded constructor: "+x+"\t"+y);
    }
    private int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

//create another class named childDerived
class childDerived extends child{
    //create a constructor of childDerived method
    childDerived(){
        System.out.println("i'm child derived class constructor");
    }
    //overloaded  constructor of childDerived method
    childDerived (int a,int b){
        super(a,b);
        System.out.println("i'm child derived overloaded method"+a+b);
    }
}

public class Constructors_in_inheritance {
    public static void main(String[] args) {
      parent p = new parent();
      //child c = new child();
        child cobj = new child(60,56); //selected overloaded constructor
        //with argument int x and int y.
        //create a obj of childDerived class
        childDerived cd = new childDerived(10,12);

    }
}
