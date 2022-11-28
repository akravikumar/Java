package Core_Java.String_Handlings;

public class String_hashCode {
    public static void main(String[] args) {
        String str = "Hello Ravi";
        String str2 =" Hello Hyd";

        System.out.println(str.hashCode()); // hasCode() is a storage loaction of String variable
        System.out.println(str2.hashCode());
    }
}
