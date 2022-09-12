public class Break_Continue {
    public static void main(String[] args) {
        int i;
        for (i=0; i<5; i++){
            System.out.println(i);
            System.out.println("This is for loop");
            if (i==3){

                System.out.println("loops end");
                break;
            }
        }

        /*
        here we set a condition for printing a particular number
        execute 0-5 times
        first portion of this program execute and runs the number
        0- 5 times
        but in right after the for loop we set a condition
        we are give an instruction to the computer if i value
        0 to 3 then break; the program and print "loops end"

        yes you catch-up right things. break is working this way.
        here is no surprise at all.
         */

        //continue works in similar fashion
        int x;
        for (x=0; x<=6; x++)
        {
            System.out.println(x);
            if (x==5)
            {
                System.out.println("fahim");
                continue;
            }
        }
        /*
        result
        0
1
2
3
4
5
fahim
6
 you might notice what happen there!
 yes first print all the number except 6
 when x value is equal to 5 then print fahim and at last
 execute and print 6.
 continue is works this way.
        */

    }
}
