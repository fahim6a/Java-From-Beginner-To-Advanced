public class Array {
    public static void main(String[] args) {
        //we have a classroom of 500 students and we want to store their marks
        //you have two options
        //no-1---> create 500 variables
        // no-2--> used Array(recommended)
        /*
        syntax of array
        what is array?
        an array is a similar types of data.
        datatype [] variables name
        now we have to memory allocations
        */
//        int [] marks = new int[5];
        // datatypes int [] marks is a variables = new datatypes-->int[5]
        //5 is a no of values which is stored in an array.
        //we can memory allocations in same lines.
        // now memory allocations done we have to access an array
        //initialization separately
//        marks[0]=100;
//        marks[1]=200;
//        marks[2]=12;
//        marks[3]=4;
//        marks[4]=9;
//        marks[4]=90;
        // marks is a reference and [0,1,2,3,4] is index number
        //100,200,...9 is a corresponding values of an index.
        // in array index is always start from 0 and end with n-1 number.
        // here n =5.
        //System.out.println(marks[4]); non-overwrite
        // we can overwrite an index values.
//        System.out.println(marks[4]);

        //Another way of creating an array
        // this time we do not mention the size of an array
        // java automatically find out the size of an array
        // we just declare a reference and set the values like that
        // int marks[] = {values};
        //declaration + initialization
        int [] marks = {12,15,55,44,878,46};
        System.out.println(marks[5]);



    }
}
