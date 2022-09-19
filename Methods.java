public class Methods {
    static int logic(int x, int y){
        int z;
        if(x>y){
            z= x+y;
        }
        else {
            z=(x+y)*5;
        }
        return z;
    }
        public static void main (String[]args){
        /*sometimes our program grows in big size and we want to
        separate the logic of main method to others method
        a method is a function within inside a class. since java
        is  oop, we need to write the method inside the same class

        syntax of method
        datatype name (datatype parameter name, datatype parameter name){
        method body
        }
         */
      int a=5;
      int b=7;
      int c;
      c=logic(a,b);
      int a1=22;
      int b1=10;
      int c1 =logic(a1,b1);
            System.out.println(c);
            System.out.println(c1);

        }
    }


