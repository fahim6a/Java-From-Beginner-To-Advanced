public class Array_practice {
    public static void main(String[] args) {
        //create an 5 float and calculate the sum
//        float [] cal_array= {12,21,45,98,36};
//        float sum=0;
//        for (int i=0; i<cal_array.length; i++){
//            System.out.println(cal_array[i]);
//            sum= sum+cal_array[i];
//            System.out.println("sum of the array: "+sum);
//        }
        //write a program to find out present integer is present or not

        //int [] find_arr={12,45,96};
//        int n=12;
//        //for (int i=0; i< find_arr.length; i++)--optional
//        //{
//            if(n== find_arr.length){
//                System.out.printf("your %d array is found\n",n);
//            }
//            else {
//                System.out.printf("your %d array is found\n",n);
//            }
//            System.out.println("Thank you!");
//       // }

        //calculate avg marks of all students
        //calculating all students marks in CSE-321
        //using for loop
//        float [] marks={88,89,90,91,92,95,96,99};
//        float sum=0;
//        for (int i=0; i<marks.length; i++){
//            sum=sum+(marks[i]);
//
//       }
//        System.out.println("avg: "+sum/marks.length);

        //using for-each loop
//        for (float elements:marks) {
//            sum=sum+elements;
//        }
//        System.out.println("the average marks: "+sum/ marks.length);


        //write a java program to add two size of matrix 2x3
//        int [][] matrix1= {{12,15,32},
//                          {10,15,65 }};
//        int [][] matrix2 = {{45,98,36},
//                            {9,7,23}};
//        //matrix addition
//        // first create an resulting matrix
//        int [][] result = {{0,0,0},
//                          {0,0,0}};
//        //first for loop for matrix1
//        //second for loop for matrix2
//        for (int i=0; i<matrix1.length; i++){// now number of times
//            for (int j=0;j<matrix2[i].length; j++){//column number of times
//                //System.out.println("addition of 2 matrix is: ");
//                //matrix formula
//                result[i][j]= matrix1[i][j]+matrix2[i][j];
//                System.out.print(result[i][j] + "");
//            }
//            System.out.println("");
//        }


        //array in reverse order

       //math.floordiv()--> math is a class floordiv() is a method
        //floordiv used for division
        //math is a class for perform mathamatical terms

//        int [] arr_rev={5,4,9,10,11,12};
//        int n=Math.floorDiv(arr_rev.length,2);
//        int temp; //for swap. it holds temporary values.
//        for (int i=0; i<n; i++){
//            //logic swap of two numbers
//            //arr_rev[i] and arr_rev[arr_rev.length-1-i]
//            temp=arr_rev[i];//arr_rev[i] transfer in temp
//            arr_rev[i]=arr_rev[arr_rev.length-i-1];//arr_rev[i] transfer in arr_rev[arr_rev.length-i-1]
//            arr_rev[arr_rev.length-i-1]=temp;//arr_rev[arr_rev.length-i-1] value transfer in temp
//
//        }
//        for (int elements:arr_rev){
//            System.out.println(elements);
//        }

//        //write a program to find out maximum element in an array
//        int [] maximum = {4,1,2,3,6,5};
//        int max=0;
//        for (int elements: maximum){
//            if(elements>max){
//                max=elements;
//            }
//        }
//        System.out.println(max);

//        //for minimum
//        int [] minimum = {4,1,2,3,6,5};
//        int min=0;
//        for (int elements:minimum){
//            if(elements<min){
//                min=elements;
//            }
//        }
//        System.out.println(min);

        //an array is sorted or not
        int [] arr = {12,58,98,24,155,90};
        boolean issorted=true;
        for (int i=0; i<arr.length-1; i++){
            //in every times arr compare to the i+1;
            //in the last index i+1 will not find. that means 90
            //is along side the rest of the values
            //so we have to compare length-1 times otherwise it throws an error
            //arr[i] is smaller than arr[i+1]?
            //if the array is sorted then it's all right
            //what-if array isn't sorted?
            //now check the array is sorted or not.
            if(arr[i]>arr[i+1]){
                issorted=false;
                break;
            }
        }
        if(issorted){
            System.out.println("the array is sorted");
        }
        else {
            System.out.println("the array is not sorted");
        }
    }
}
