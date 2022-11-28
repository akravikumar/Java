package Core_Java.ControlStatements.If;

import java.util.Scanner;

public class Finding_biggerNum {

    public static void main(String[] args) {


        Scanner H = new Scanner(System.in);
        System.out.println("Enter Ravi Number");
        int ravi = H.nextInt();
        System.out.println("Enter Ranga numbers ");
        int ranga = H.nextInt();

       if(ravi>ranga){
           System.out.println("Ravi is bigger number");
       }
       if(ranga>ravi){
           System.out.println("Ranga is bigger number");

       }
    }
}
