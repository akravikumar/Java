package Java_Methods;

public class Static_Method {

    public static void mymethod() { //  static method

        String ravi = "learning static method";

        int i = 20;
        int j = 50;

        System.out.println("result will be " + ravi + " "+ (i + j )); // global variable will access entire the class
    }
    public static void main(String[] args) {

        Static_Method.mymethod(); // No need to create object bcz it called by class name not required object creation

    }

}
