public class Associativity_of_operators {
    public static void main(String[] args) {
        //the operators are applied and evaluated based on precedence
        //precedence and Associativity
        //precedence means largar operators evaluate first
        //example * / + - operations--->> hierarchy
        int a = 6*5-34/2;
        System.out.println(a);

        /*
        highest precedence goes to * and /. the are going to evaluated on the basis
        of left to right associativity.
        a= 30-34/2
        =30-17
        =13 ans  first multiply 6*5 then divided 34/2 and last part 30-17
         */
        //Associativity works left to right

        int b = 60/5-56*2;
        System.out.println(b);
        // ans -100
        /*
        60/5 = 12
        56*2=112
        12-112 = -100
        */

        //b square - 4ac / 2a

        int a1 = 50;
        int b1 = 4;
        int c=5;
        int container;

        container= b1*b1-(4*a1*c)/(2*a1); // () highest precedence-->14
        // must be close a complicated expression in between ().
        // used of () result is 6
        // without () -24984 somethings.
        System.out.println(container);


    }
}
