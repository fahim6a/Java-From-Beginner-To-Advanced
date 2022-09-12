public class String_Method {
    public static void main(String[] args) {
        //String object.length() method
        String name ="Ahmed Mostakim Fahim"; // result 20 with white space
        int box=name.length();
        System.out.println(box);

        //toLowercase() method
        String name1="AHMED MOSTAKIM FAHIM";
        String box1=name1.toLowerCase();
        System.out.println(box1);

        //toUpperCase() method
        String name2="adrita Era";
        String box2 = name2.toUpperCase();
        System.out.println(box2);

        //trim() method
        //trim () method remove white space and print

        String name3="     fahim & era ";
        String box3=name3.trim();
        System.out.println(box3);

        //substring() method
        //syntax--> String object.substring(index number of String to count)
        System.out.println(name2.substring(7));//result era
        //substring(0) is redundant. redundant means no needed to used substring()
        // while the index number is 0.

        //substring(int start, int end)--> we can define start and end value
        System.out.println(name2.substring(0,6));
        //result--> adrita

        //Replace() method
        //syntax: objectname.replace('oldChar','newChar')
        System.out.println(name.replace('A','a'));
        //multiple String replace()
        System.out.println(name.replace("ahmed","hello"));
        //multiple String replacement--> .replace("oldChar","newChar") "" used

        //startsWith() method
        System.out.println(name.startsWith("ah")); //false
        System.out.println(name.startsWith("Ah"));

        //endsWith() method

        System.out.println(name.endsWith("him"));
        System.out.println(name.endsWith("hsg")); //false

        //charAt() method
        //syntax-->> charAt(index number)
        System.out.println(name.charAt(15));

        //indexOf() method
        //syntax-->> indexOf("String") and return index number of String

        System.out.println(name.indexOf("kim"));
        System.out.println(name.indexOf("him"));

        //indexOf("String",startnumber)
        System.out.println(name.indexOf("him",8));

        //lastIndexOf() method
        System.out.println(name.lastIndexOf("him"));

        //.equal() method
        System.out.println(name.equals("Fahim")); //false
        System.out.println(name.equals("Ahmed Mostakim Fahim")); //true

        //equalIgnoreCase() method
        //equalIgnoreCase() method ignore upperCase, lowerCae and always return true
        //if the String is being matched
        System.out.println(name.equalsIgnoreCase("aHmed mostakim fahim"));
        //return true

        //Escape sequence character
        // \n, \t, \
        System.out.println("my name is \"fahim\" i live in rajshahi");
        // qoute ->> \"qoute\"

        // backslash \\-->> then print one backslash
        System.out.println("my name is fahim \\ and i live in rajshahi");





    }
}
