class topic{
    int a;
    //getter and setter

    public int getA() {
        return a;
    }

    //constructor
    topic(int z){
       this.a=z;
       //here this is reference
        /*You want to pass this object by the another method
        * then use this reference
        * when your variable name is same inside the method then
        * use this keyword. what if you forget to use this keyword?
        * answer is simple. compiler confused what you're trying to
        * actually in this situation, compiler return 0. when use this
        * keyword then compiler return your desire value
        * example
        * topic (int z){
        *  z=z;-----compiler return 0
        * this.z=z;----compiler return your desire value
        * }  */

    }
    //methods
    public int topicreturn(){
        return 1;
    }
}
/*What is super keyword?
 * super keyword is used to reference super class
 * a super variable used to refer immediate parent class object
 * */

/*When super class used
* can be used to refer immediate parent class instance variables
* can be used invoke parent class method
* can be used invoke parent class constructor
* */

//create class named topic2
class topic2 extends topic{
    //constructor
    topic2(int x){
        super(x);
        System.out.println("this is topic2 constructor"+x);
    }
}
public class This_Super_Keyword {
    public static void main(String[] args) {
        //topic object
        topic tobj = new topic(5);
        System.out.println(tobj.getA());
        //object topic2
        topic2 t = new topic2(56);

    }
}
