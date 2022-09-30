/*create class cylinder and use setter and getter to set
the radius and height*/
//ctrl +shift+/ ---block of code comment like this
class cylinder{
    private int radius;
    private int height;
   //setter and getter
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    //method
    //Total surface area of cylinder
     // formula A = 2πrh + 2πr2
    public double surfaceArea(){
//        return 2*3.14*radius*radius+2*3.14*radius*height;
        //accurate values
        return 2*Math.PI*radius*radius+2*Math.PI*radius*height;
    }
    public double volume(){
        //π · r2.h-->formula of volume
        return Math.PI*radius*radius*height;
    }
}


public class CHW_9_practice {
    public static void main(String[] args) {
       //cylinder class obj
        cylinder cyobj = new cylinder();
        //cylinder volume formula = π · r2 · h
        //height
        cyobj.setHeight(12);
        int h=cyobj.getHeight();
        System.out.println(h);
        //radius
        cyobj.setRadius(9);
        int r=cyobj.getRadius();
        System.out.println(r);
        //problem-2
        System.out.println(cyobj.surfaceArea());
        System.out.println(cyobj.volume());

        //problem-3
        //using constructor



    }
}
