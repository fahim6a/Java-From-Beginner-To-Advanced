public class Array_Traversal {
    public static void main(String[] args) {
        //array length
        // length is a property of an array
        int marks [] = {7,8,9,2,3,77};
        //System.out.println(marks[0]);-- display array index
        // apply .length method
        System.out.println(marks.length);
        //marks.length display total number of length of an array
        //we can make String array
        String [] englandxi= {"lees","crawley","pope","root"};
        System.out.println(englandxi[3]);
        System.out.println(englandxi.length);
        //create an array and initialization of an array
        //then run a for loop for display an array
        int [] england ={444,481,498,235,245};
        for (int i=0; i<england.length; i++){
            System.out.print(i);
            //i runs england.length times where england length is 0-4
        }
        //an array displaying using for loop
        for (int i=0; i<england.length; i++){
            System.out.println(england[i]);
        }
       // print an elements in reverse order
        //remember in reverse order we have to count (.length-1)
        int [] aus={11,54,69,98,89,87,744,987,7444};
        for (int j=aus.length-1; j>=0; j--){
            System.out.println(aus[j]);
        }

    }
}
