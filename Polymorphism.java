import java.util.Scanner;
interface Computer{
    //methods
    void Display();
    void playMusic();
    void WatchingVideo();
    void Calculator();
}
interface trackNetwork{
    //methods
    void wifiModule();
    void lanConnection();
    void VpnConfiguration();
}
class ImplementationComputer{
    void trackDevice(){
        System.out.println("5 Device is linked");
    }
}
class Network extends ImplementationComputer implements Computer,trackNetwork{
   public void Display(){
       System.out.println("Content is Displayed");
    }
   public void playMusic(){
       System.out.println("Music Playing..");
    }
   public void WatchingVideo(){
       System.out.println("Watching Coding tutorials.");
    }
   public void Calculator(){
       double cal=0;
       double perform;
       Scanner sc = new Scanner(System.in);
       cal=sc.nextDouble();
       System.out.println("Your result is: \t"+cal);
    }
   public void wifiModule(){
       System.out.println("WiFi is connected.");
    }
   public void lanConnection(){
       System.out.println("Lan connection is good");
    }
    public void VpnConfiguration(){
        System.out.println("Vpn is connected to the London");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
    /*Network n = new Network();
    n.Display();
    n.playMusic();
    n.WatchingVideo();
    n.Calculator();
    n.wifiModule();
    n.lanConnection();
    n.VpnConfiguration();*/
        Computer c = new Network();
        c.Calculator();
        //c.wifiModule();--> not allowed
        //only can access as computer interface
        //this is polymorphism.
    }
}
