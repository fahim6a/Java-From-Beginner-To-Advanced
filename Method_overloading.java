public class Method_overloading {
    //create a void method is called msg
    static void msg(){
        //this method has no arguments
        System.out.println("England-Pakistan match will held tomorrow");
    }
    //create another method void msg and pass the integer
    static void msg(int a){
        //this method has an arguments
        System.out.println("England \t"+a+"\tPakistan");
    }
    //we can create another method with the same name but
    //we have to change the parameters
    static void msg(float b){
        System.out.println("the value of b is: "+b);
    }
    public static void main(String[] args) {
        /* two or more method can have same name but
        different parameters such methods are called
        methods overloading
         */
        msg();
        int a=9;
        msg(a);
        float b=36.00f;
        msg(b);
        //method overloading can not be performed by the return
        //type of methods
    }
}
