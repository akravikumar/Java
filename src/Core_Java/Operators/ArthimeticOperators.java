package Core_Java.Operators;

import java.util.Scanner;

public class ArthimeticOperators {

    public static void main(String[] args) {

        Scanner ravi =new Scanner(System.in);
        System.out.println("Enter any two numbers ");
        int i = ravi.nextInt();
        int j=ravi.nextInt();
        System.out.println("additon is: "+(i+j));
        System.out.println("Substaction is: "+ (i-j));
        System.out.println("Multification is: "+(i*j));
        System.out.println("division is: "+(i/j));
        System.out.println("modules is: "+(i%j));

    }
}
