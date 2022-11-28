package Core_Java.String_Handlings;

public class String_equals {
    public static void main(String[] args) {
        String str = "hello";
        String std = "ravi";

        System.out.println(str.equals(std)); //False:   .equals method comparing the String values are same or not

        if(str.equals(std)){

            System.out.println("Same Strings printing ");
        }else{
            System.out.println("Not Same Strings printing ");

        }
    }
}
