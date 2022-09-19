public class Recursion {
    //find out a factorial of given number
    //formula of factorial
    //factorial(0)=1
    // factorial(n)= n*n-1*...1
    //what is the 5 factorial
    //factorial(5)=5*4*3*2*1=120
    static int factorial(int n){
        //formula
        //factorial(n)= n*factorial(n-1) where n>=1;
        if(n==0||n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }
    static int factorial_iterative(int n){
        if (n==0||n==1){
            return 1;
        }
        else {
            int product = 1;
            for (int i=1; i<=n; i++){ //1 to n;
                product*=i;
            }
            return product;
        }
    }
    public static void main(String[] args) {
        //what is recursion?
        //A function in java can call itself is called recursion
        int n =4;
       // System.out.println("the value of factorial n is: "+factorial(n));
        System.out.println("n factorial: "+factorial_iterative(n));
    }
}
