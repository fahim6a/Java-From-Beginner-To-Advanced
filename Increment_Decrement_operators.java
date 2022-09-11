public class Increment_Decrement_operators {
    public static void main(String[] args) {
        //Increment operators
        //i++ -->> means first print i values and then increment one by one
        //example
        int i=90;
        System.out.println(i++); // result 90
        //this stage only print i values
        System.out.println(i); // result 91
        // this stage print i values and increment one by one

        //++i
         int j = 90;
         int h= ++j;
         //++j means first increment and then print
        System.out.println(h);

        //Decrement operators
        int a= 45;
        System.out.println(a--); // first print and then decrement
        System.out.println(--a); // first decrement and then print

        //what will be the value of the following expression(x)
        // y=7 x = ++y*8 x = ?
        int y=7;
        int x= ++y*8; // first increment y value and then multiply with 8
        System.out.println(x);

        //example-2
        //a1=74 b1= a--/2c c=4
        // what will be the value of experssion(b)
        int a1=74;
        int c=4;
        double b1= (--a)/(2*c);
        System.out.println(b1);

        //example-3
        //  s=8 y2=8.26 z= y2++ * s2--
        // what will be the value of following expression of (z)
        int s2=8;
        double y2=8.26;
        double z= y2++ * s2 --;
        System.out.println(z);

        // char a++
        int f = 'a';
        System.out.println(f++);

    }
}
