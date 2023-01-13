package ExceptionHandiling;

public class Exception_Handiliing {

    public static void main(String[] args) {

        int i =6;
        int j=0;
        int c=i/j;
        System.out.println(c); // Excuting the code abnormal, it won't divide the 5/0 = infinity...
        // so it is an exception so that java handiled that exception that's why we call java is a robust or Strong language.

    }
}
