public class Variables_Arguments {
//    static int sum(int x, int y){
//        return x+y; //overloading
//    }
//    static int sum(int x, int y,int c){
//        return x+y+c; //overloading
//    }

    //create a varargs method
    static int sum(int...arr){
        //int...arr contain all the arguments that store in an Array
        //behaviour
        // available as int [] a-->>array
       // int[] a;
        int result =0;
        for(int a1: arr){ //foreach loop
            result +=a1;
        }
        return result;
    }
    public static void main(String[] args) {
//        //what is varargs?
//        //varargs solved overloading problem
//        System.out.println("the sum of 4 and 5 is: "+sum(4,5));//overloading
//        System.out.println("the sum of 4 ,5 and 7 is: "+sum(4,5,7));//overloading

        //now solved the overloading problems
        System.out.println("the sum of 4 and 5 is: "+sum(4,5));//overloading
        System.out.println("the sum of 4 ,5 and 7 is: "+sum(4,5,7));//overloading


    }
}
