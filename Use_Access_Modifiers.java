class tri_nation{
    public int bangladesh =148;//public
    protected int pakistan=167; //protected
    int host=1; //default
    private int BlackCaps=190; //private
    //method
    public void match(){
        System.out.println("First match: Bangladesh defeat by 21 runs against pakistan.");
        //we can use same class value when it is public
        System.out.println("Bangladesh Scored: "+bangladesh);
        //we can also use same class value when it is protected, private
        System.out.println("Pakistan Scored: "+pakistan);
        System.out.println("BlackCaps score prediction as: "+BlackCaps+" Vs Pakistan On Saturday.");
        System.out.println("Tri-Nation Host is: "+host+" Country");
    }
}
public class Use_Access_Modifiers {
    public static void main(String[] args) {
       tri_nation tri = new tri_nation();
       tri.match();
       /* //we can run protected,default,public access modifier in same package like this
        System.out.println(tri.bangladesh);
        System.out.println(tri.pakistan);
        System.out.println(tri.host);
       // System.out.println(tri.BlackCaps);--> can not run due to private
        //access modifier. we can not access in same package.*/

    }
}
