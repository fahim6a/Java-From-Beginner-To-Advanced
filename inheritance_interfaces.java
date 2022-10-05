interface AgainstTheIce{
    //methods
    void Greenland();
    void FoundTreasure();
}
//only you can inherit one interface to another interface
//con not inherit class to interface. java throws an error.
interface Travel876Days extends AgainstTheIce{
    void Foods();
    void Survival();
}
class HuntCaptain implements Travel876Days{
    public void Greenland(){
        System.out.println("Hunt to treasure..");
    }
    public void FoundTreasure(){
        System.out.println("Found treasure..Captain");
    }
    public void Foods(){
        System.out.println("We are running out of foods");
    }
    public void Survival(){
        System.out.println("Fight with Bear, frostbite, hypothermia");
    }

}
public class inheritance_interfaces {
    public static void main(String[] args) {
     HuntCaptain hc = new HuntCaptain();
     hc.Greenland();
     hc.FoundTreasure();
     hc.Foods();
     hc.Survival();
    }
}
