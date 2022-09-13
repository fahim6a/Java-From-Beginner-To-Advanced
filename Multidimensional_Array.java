public class Multidimensional_Array {
    public static void main(String[] args) {
        //what is multidimensional Array
        // multidimensional Array are array of arrays.
        //each multidimensional Array point another array
        //2-D array
        //how we create 1-D array--> int[] variables name ={values};
        //now 2-D array--> int [] [] variables name = {value};
        int [] [] flats; //row and column
        flats=new int [2] [3]; //2 rows and 3 column
        flats[0][0]=101; // ground floor first room
        flats[0][1]=102;// ground floor second room
        flats[0][2]=103;// ground floor third room
        flats[1][0]=201; // first floor first room
        flats[1][1]=202;//first floor second room
        flats[1][2]=203;//first floor third room

        //now display the 2-D array
        for (int i=0; i<flats.length; i++){
            //nested loop
            for (int j=0; j<flats[i].length; j++)
            System.out.println(flats[i][j]);
        }
        // we have to print inside the 0 and 1 arrays values that's why used nested loop
        // flat[i][j]
        //i contain 1-D array and j contain 2-D array

    }
}
