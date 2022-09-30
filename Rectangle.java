class custom_Rectangle{
    private int length;
    private int breadth;
   //constructor
    public custom_Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}
public class Rectangle {
    public static void main(String[] args) {
        custom_Rectangle CRobj = new custom_Rectangle(12,4);
        System.out.println(CRobj.getLength());
        System.out.println(CRobj.getBreadth());
    }
}
