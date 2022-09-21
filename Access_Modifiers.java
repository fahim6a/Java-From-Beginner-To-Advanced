class myEmployee{
    private int id;
    private String name;
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
public class Access_Modifiers {
    public static void main(String[] args) {
    myEmployee fahim = new myEmployee();
//    fahim.id=6;
//    fahim.name="Ahmed Mostakkim Fahim"; can't access directly
        //due to private access modifiers
        fahim.setName("Ahmed Mostakim Fahim");//setters
        System.out.println(fahim.getName());//printing getters
        fahim.setId(6);//setters
        System.out.println(fahim.getId());//printing getters



    }
}
