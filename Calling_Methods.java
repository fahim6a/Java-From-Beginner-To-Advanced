public class Calling_Methods {
      int logic(int x, int y ){
        int z;
        if(x>y){
           z= x+y;
        }
        else {
           z= x-y;
        }
        return z;
    }
    public static void main(String[] args) {
        //calling a method
        //A  method can be called by creating an object of the class
        //we have to create an object
        //then call a method
        /* syntax
        class_name obj = new class_name();
        just like Scanner object
         */
        int a=100;
        int b=99;
        int c;
        Calling_Methods obj = new Calling_Methods();
        //int c = logic(a,b); instead of static class reference
        // we used class obj for call a method
        c=obj.logic(a,b);
        System.out.println(c);

    }
}
