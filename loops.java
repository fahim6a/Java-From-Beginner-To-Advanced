public class loops {
    public static void main(String[] args) {
        //loops is a set of instruction that is used to
        //execute a particular program for repeatedly
        /*types of loops in java
        1.while loop
        2.do-while loop
        3.for loop

        syntax--> while loops
        while(condition){
        //white your code
        }
        always works true condition only

         */
        // print 0 to 10 using while loop
        int i=0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
        /*
        do-while loop
           syntax-->
           do{
            //statement
           } while(condition)
           do-while loop execute the code first and then check the condition


        */
        int x=0;
        do {
            System.out.println(x);
            x++;
        }while (x<=15);

        // for loop
        //it used for runs a program specific times
        int ii;
        for (ii=0; ii<=15; ii++)
        {

            System.out.println(ii);
        }

    }
}
