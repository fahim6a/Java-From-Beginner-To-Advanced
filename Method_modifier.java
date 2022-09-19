public class Method_modifier {
    //method for an Array
    static void change_arr(int [] arr){
        arr[0]=90;
        arr[1]=85;
    }
    //when you don't want to return value then used void method
     void england(){
        System.out.println("England tour of Pakistan");
    }
    public static void main(String[] args) {
    Method_modifier obj = new Method_modifier();
    obj.england();
    int[] arr={1,2,1,22,5};
    //case-1: changing an integer
    //int x=45;
    //arr(x);
        //  System.out.println("the value of 0 index is: "+x);
     //case-2: changing the array
        change_arr(arr);
        System.out.println("the value of array after changed: "+arr[0]);
        for (int i=0; i<arr.length; i++){
            System.out.print("\t"+arr[i]); //print all the values after changed is being done

        }

    }
}
