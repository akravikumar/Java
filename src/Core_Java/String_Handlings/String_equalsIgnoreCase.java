package Core_Java.String_Handlings;

public class String_equalsIgnoreCase {

    public static void main(String[] args) {
        String myStr = "Hello";
        String myStr1 = "HELLO"; // It is ignoring the upper case and lower case
        String myStr2 = "hello world";

        System.out.println(myStr .equalsIgnoreCase(myStr1)); // True
        System.out.println(myStr .equalsIgnoreCase(myStr2)); // False

    }
}
