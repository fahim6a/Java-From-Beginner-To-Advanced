class circle{
//radius
    //area-->PI*R^2
public int radius;
    circle (int r){
        System.out.println("I'm a circle constructor");
        this.radius=r;
    }

    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}
class cylinder1 extends circle{
//height
    //volume
    //cylinder1 constructor
public int radius;
    public int height;
    cylinder1(int r,int h){
        super(r);
        this.height=h;
    }
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}
public class Practice_chapter10 {
    public static void main(String[] args) {
     cylinder1 cy = new cylinder1(12,4);
     circle c = new circle(12);
    }
}
