interface camera{
    //method slowMotion
    void slowMotion();
    //method portraitMood
    void portraitMood();
    //interface can use private method and main Benefits of
    //private methods is can call directly in default methods

    private void photoVault(){
        System.out.println("Yeah! your photos is secure");
    }

    //for update functionalities of an interface must have to
    //used default keyword. once you implements you don't need to change
    //others class.
    default public void record4kVideo(){
        //call the private methods
        photoVault();
        System.out.println("Yeah. 4k shoot Enables on update 1.1");
    }
}
interface wifi{
    void getSecureConnection();
    void measureSpeed();
    String [] getNetwork();
    void statusNetwork(String network);
}
//create class SmartPhone and define the method slowMotion()
class SmartPhone{
    void slowMotion(){
        System.out.println("Video render in slow motion");
    }
    void portraitMood(){
        System.out.println("Blur the background image");
    }

}
class NetworkImplementation{
    void getSecureConnection(){
        System.out.println("Cellphone connected in secure vault");
    }
    void measureSpeed(int SpeedUp){
        int speedMeter=0;
        speedMeter+=SpeedUp;
        System.out.println("Your speed is: \t"+speedMeter);
    }
}
class myCellPhone{
    void cellNumber(int phoneNumber){
        System.out.println("Calling.."+phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class SamsungFold extends SmartPhone implements camera,wifi{
   public void slowMotion(){
        System.out.println("slow motion");
    }
  public void portraitMood(){
        System.out.println("portrait");
    }
   public void getSecureConnection(){
        System.out.println("Connection Secure");
    }
    public void measureSpeed(){
        NetworkImplementation ni = new NetworkImplementation();
        ni.measureSpeed(25);
        ni.getSecureConnection();
    }
    public String [] getNetwork(){
        System.out.println("Your Network list");
       String [] NetworkList = {"Link-3","AmberIt","Airtel"};
       return  NetworkList;
    }
    public void statusNetwork(String network){
        System.out.println("Connecting to..."+network);
    }
}
/*What is default methods
* Default Method enable us to add new functionalities of
* existing interface
* if we are trying to update existing interface without default methods
* then java throws an error of all classes where you have been
* implemented interface, you must have to fix all the classes and
* update the functionalities and this is not good practice. isn't it?
* so fix this problem, in java 8 and above creators of java
* introduce default methods. */

public class Default_Methods {
    public static void main(String[] args) {
        SamsungFold sf = new SamsungFold();
        String [] arr = sf.getNetwork();

        //use foreach loop to show network List
        for (String item:arr) {
            System.out.println(item);
        }

        sf.measureSpeed();
        sf.getSecureConnection();
        sf.portraitMood();
        sf.slowMotion();
        sf.record4kVideo();

    }
}
