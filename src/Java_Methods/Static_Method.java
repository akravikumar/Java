package com.Methods;

public class Static_Method {

    static int ram = 30; // static methods always its a global variables. It will create outside the method and inside the class

    public static void mymethod() { //  static method

        String ravi = "learning static method";

        int i = 20;
        int j = 50;

        System.out.println("result will be " + ravi + " "+ (i + j + ram)); // global variable will access entire the class

    }

    public static void main(String[] args) {

        Static_Method.mymethod(); // No need to create object bcz it called by class name not required object creation

    }

}
