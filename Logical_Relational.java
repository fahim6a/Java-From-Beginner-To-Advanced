public class Logical_Relational {
    public static void main(String[] args) {
        boolean box1= true;
        boolean box2= false;
        if(box1 == box2)
        {
            System.out.println("England lost");
        }
        else {
            System.out.println("England win");
        }

        boolean england=true;
        boolean australia=true;
        boolean ireland=true;

        if(england && australia && ireland)
        {
            System.out.println("Matche will be played");
        }
        else {
            System.out.println("match cancel");
        }
    // not equals to !==. syntax--> (!(condition))
        double a=45.0;
        double b=47.0;
        if(!(a ==b)){
            System.out.println("yes");
        }

        //less than equals <=
        int x= 89;
        int y=47;
        if(x<=y){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

        // same as greater than equals >=

        // or operation ||. must be true one condition

        int xx= 45;
        int yy=47;
        if(xx>=45 || yy<=46){
            System.out.println("true"+xx);
        }
        else {
            System.out.println("False"+yy);
        }


    }
}
