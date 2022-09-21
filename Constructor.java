//using setter and getters
class myEmployee1{
    private int id;
    private String name;
    //same output using constructor
    public myEmployee1(){
         id=6;
         name ="Fahim";
    }
    //create method for access the private access modifiers
    //using setter and getters
    public String getName(){
        return name;
    }
    public void setName(String n){
        name =n;
    }
    public void setId(int i){
        id=i;
    }
    public int getId(){
        return id;
    }
}
public class Constructor {
    public static void main(String[] args) {
     myEmployee1 fahim = new myEmployee1();
//     fahim.setName("Fahim");
//        System.out.println(fahim.getName()); //using setter and getter

        //print using constructor
        System.out.println(fahim.getId());
        System.out.println(fahim.getName());
    }
}
